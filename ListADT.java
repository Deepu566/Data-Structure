package DataStucture;

public interface ListADT<E> extends Iterable<E> {

    public int size();

    public boolean isEmpty();

    public E get(int index) throws IndexOutOfBoundsException;

    public E set(int index, E element) throws IndexOutOfBoundsException;

    public void add(E element, int index) throws IndexOutOfBoundsException;

    public E remove(int index) throws IndexOutOfBoundsException;

    public void add(E element) throws IndexOutOfBoundsException;
}
