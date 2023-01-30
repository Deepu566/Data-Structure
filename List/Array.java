package DataStucture.List;

import java.lang.reflect.Array;
import java.util.Arrays;

class Array {
    public static int searchElement(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void rotateArrayByOnePosition(int[] array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Empty array");
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
    }

    public static int binarySearch(int[] array, int element) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (element == array[mid]) {
                return mid;
            } else if (element > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverseArray(int[] array) {
        int end = array.length - 1;
        for (int i = 0; i < (array.length / 2); i++) {
            swap(array, i, end - i);
        }
    }

    public static void rotateArray(int[] a, int d) {
        for (int i = 0; i < d; i++) {
            rotateArrayByOnePosition(a);
        }
    }

    public static int minIndex(int[] array, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = minIndex(array, i);
            swap(array, minIndex, i);
        }
    }

    public static void sort(int[] array) {
        selectionSort(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;

        }
    }

    public static void insertLastElementAtCorrectPosition(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                swap(array, i - 1, i);
            }
        }
    }

    public static void mergeSort(int[] array) {
        divide(array, 0, array.length - 1);

    }

    private static void divide(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int mid = (startIndex + endIndex) / 2;
        divide(array, startIndex, mid);
        divide(array, mid + 1, endIndex);
        merge(array, startIndex, mid, endIndex);
    }

    private static void merge(int[] array, int startIndex, int mid, int endIndex) {
        int[] newArray = new int[(endIndex - startIndex) + 1];
        int i = startIndex;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= endIndex) {
            if (array[i] < array[j]) {
                newArray[k++] = array[i++];
            } else {
                newArray[k++] = array[j++];
            }
        }
        while (i <= mid) {
            newArray[k++] = array[i++];
        }
        while (j <= endIndex) {
            newArray[k++] = array[j++];
        }
        // for (int idx = 0; idx < newArray.length; idx++) {
        // array[idx] = newArray[idx];
        // }
        System.out.println(Arrays.toString(newArray));
    }
}
