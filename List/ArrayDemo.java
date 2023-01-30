package DataStucture.List;

import java.util.Arrays;

import DataStucture.ListADT;

public class ArrayDemo {

    public static void main(String[] args) {
        // ListADT<Integer> l = new ArrayList();
        // l.add(200, 0);
        // l.add(200, 1);
        // l.add(200, 2);
        // l.add(200, 3);
        // l.add(2, 4);
        // System.out.println(l.toString());
        // int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        // Array.swap(arr, 0, 3);
        // System.out.println(Array.searchElement(arr, 4));
        // Array.rotateArrayByOnePosition(arr);
        // int[] arr1 = { 1, 2 };
        // Array.rotateArrayByOnePosition(arr);
        // System.out.println(Array.binarySearch(arr, 2));
        // Array.reverseArray(arr);
        // Array.rotateArray(arr, 1);
        // System.out.println(Array.minIndex(arr, 5));
        // Array.sort(arr);
        // int[] arr = { 1, 2, 3, 4, 6, 7, 8, 5 };
        int[] arr = { 2, 3, 4, 5, 7, 8, 9, 10, 6, 1 };
        // Array.insertLastElementAtCorrectPosition(arr);
        // Array.insertionSort(arr);
        Array.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
