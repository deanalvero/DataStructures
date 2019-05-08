package com.deanalvero.datastructures.data;

import android.support.annotation.VisibleForTesting;

import com.deanalvero.datastructures.domain.LinkedList;
import com.deanalvero.datastructures.domain.LinkedListNode;

public class LinkedListImpl<V> implements LinkedList<V> {

    private LinkedListNode<V> firstNode;

    @Override
    public void add(V item) {
        LinkedListNode<V> node = new LinkedListNode<>(
                item,
                null
        );

        if (firstNode != null) {
            LinkedListNode<V> lastNode = nodeWithNullNextNode(firstNode);
            lastNode.setNext(node);
        } else {
            firstNode = node;
        }
    }

    @VisibleForTesting
    protected LinkedListNode<V> getFirstNode() {
        return this.firstNode;
    }

    private LinkedListNode<V> nodeWithNullNextNode(LinkedListNode<V> node) {
        LinkedListNode<V> nextNode = node.getNext();

        if (nextNode == null) {
            return node;
        }
        return nodeWithNullNextNode(nextNode);
    }

}
