package bai_10.thuc_hanh.list_don_gian;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public int getLength() {
        return elements.length;
    }
    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(elements.length * 2);
        }

        for (int i = size; i > index; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size += 1;
    }

    public E remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        size -= 1;
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> newMyList= new MyList<>(elements.length);
        Object[] newElements = new Object[elements.length];
        System.arraycopy(elements,0,newElements,0,size);
        newMyList.size = this.size;
        newMyList.elements = newElements;
        return newMyList;
    }

    public boolean contains(E o) {
        int i = 0;
        while(i < size) {
            if (elements[i] == o) {
                return true;
            }
            i++;
        }
        return false;
    }

    public int indexOf(E o) {
        int i = 0;
        while (i < size) {
            if (elements[i] == o) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean add(E o) {
        if (size == elements.length) {
            ensureCapacity(elements.length*2);
        }
        elements[size] = o;
        size += 1;
        return elements[size-1] == o;
    }

    public void clear() {
        size = 0;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements,minCapacity);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index is out of bound exception");
        }
        return (E) elements[i];
    }

    @Override
    public String toString() {
        String display = "";
        for (int i = 0; i < size; i++) {
            display += elements[i] + "\t";
        }
        return display;
    }
}
