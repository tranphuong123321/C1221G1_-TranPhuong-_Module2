package bai_10.thuc_hanh.linkedlist_don_gian;

public class MyLinkedList <E>{
    private int numNodes = 0;
    private Node head;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    //Methods
    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        Node tail;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(element);
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        Node removeNode;

        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }

        removeNode = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return (E) removeNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }



}
