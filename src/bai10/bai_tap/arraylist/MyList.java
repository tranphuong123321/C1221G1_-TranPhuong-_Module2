package bai_10.bai_tap.arraylist;

import java.util.Arrays;

public class MyList<E> {
    //số phần tử trong mảng list (Default = 0)
    private int size = 0;
    //Sức chứa default của mảng list
    private static final int Default_Capacity = 10;
    //
    Object elements[];

    //contractor ko tham số sức chứa mặc định
    public MyList() {
        elements = new Object[Default_Capacity];
    }

    //contractor có tham số suscws chứa đc truyền vào
    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    //lấy số lượng phần tử
    public int getSize() {
        return this.size;
    }

    //clear tất cả phần tử
    public void clear() {
        size = 0;
        for (Object i : elements) {
            i = null;
        }
    }

    //add phần tử vào cuối và kiểm tra
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(1);
        }
        elements[size] = element;
        size++;
        return true;
    }

    //thay đổi sức chứa
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > 0) {
            int newCapacity = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newCapacity);
        } else {
            throw new IllegalArgumentException("Capacity: " + minCapacity);
        }
    }

    //add phần tử tại vị trí chỉ định
    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(1);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }

    }

    //get phần tử tại vị trí chỉ định
    public E get(int index) {
        return (E) elements[index];
    }

    //get index của phần tử
    public int indextOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    //kiểm tra phần tử có tồn tại không
    public boolean contain(E element) {
        return this.indextOf(element) >= 0;
    }

    //Clone list
    public MyList<E> clone() {
        MyList<E> clone = new MyList<>();
        clone.elements = Arrays.copyOf(this.elements, this.size);
        clone.size = this.size;
        return clone;
    }

    //xóa 1 phần tử tại vị trí chỉ đinh
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];

        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
