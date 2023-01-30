package DataStucture.List;

import java.util.Arrays;
import java.util.Iterator;
import DataStucture.ListADT;

public class ArrayList<E> implements ListADT<E> {

    private E[] data;
    private int size;
    private final static int CAPACITY = 4;

    public ArrayList() {
        this(CAPACITY);
    }

    public ArrayList(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        checkIndex(index, size);
        return data[index];
    }

    @Override
    public E set(int index, E element) throws IndexOutOfBoundsException {
        checkIndex(index, size);
        E temp = data[index];
        data[index] = element;
        return temp;
    }

    @Override
    public void add(E element, int index) throws IndexOutOfBoundsException {
        checkIndex(index, size + 1);
        if (size == data.length) {
            resize(2 * data.length);
        }
        for (int k = size - 1; k >= index; k--) {
            data[k + 1] = data[k];
        }
        data[index] = element;
        size++;
    }

    private void resize(int capacity) {
        E[] temp = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        checkIndex(index, size);
        E element = data[index];
        for (int k = index; k < size; k++) {
            data[k] = data[k + 1];
        }
        data[size - 1] = null;
        size--;
        return element;

    }

    @Override
    public void add(E element) throws IndexOutOfBoundsException {
        if (size == data.length) {
            resize(2 * CAPACITY);
        }
        data[size] = element;
        size++;
    }

    private void checkIndex(int index, int size) throws IndexOutOfBoundsException {
        if (index < 0 | index >= size) {
            throw new IndexOutOfBoundsException("Please provide correct index");
        }
    }

    @Override
    public String toString() {
        return "ArrayList" + Arrays.toString(data);
    }
}
