package com.deanalvero.datastructures.domain;

public class LinkedListNode<V> {
    private V item;
    private LinkedListNode<V> next;

    public LinkedListNode(V item, LinkedListNode<V> next) {
        this.item = item;
        this.next = next;
    }

    public V getItem() {
        return item;
    }

    public void setNext(LinkedListNode<V> next) {
        this.next = next;
    }

    public LinkedListNode<V> getNext() {
        return next;
    }

}
