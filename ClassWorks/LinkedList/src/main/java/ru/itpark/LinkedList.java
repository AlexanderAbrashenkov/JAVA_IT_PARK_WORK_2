package ru.itpark;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    private int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public void add(T element) {
        // создали новый узел связного списка
        Node<T> newNode = new Node<T>(element);
        if (count == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            // положили новый узел после последнего
            this.tail.setNext(newNode);
            // сделаем новый узел последним
            this.tail = newNode;
        }
        count++;
    }

    public void addToBegin(T element) {
        Node<T> newNode = new Node<T>(element);
        if (count == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        count++;
    }
}
