package com.deanalvero.datastructures.data;

import com.deanalvero.datastructures.domain.LinkedListNode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LinkedListImplTest {

    @Test
    public void add_inputThreeItems_itemsInOrder() {
        LinkedListImpl<String> linkedList = new LinkedListImpl<>();
        linkedList.add("test1");
        linkedList.add("test2");
        linkedList.add("test3");

        LinkedListNode<String> firstNode = linkedList.getFirstNode();
        assertNotNull(firstNode);
        assertEquals("test1", firstNode.getItem());

        LinkedListNode<String> secondNode = firstNode.getNext();
        assertNotNull(secondNode);
        assertEquals("test2", secondNode.getItem());

        LinkedListNode<String> thirdNode = secondNode.getNext();
        assertNotNull(thirdNode);
        assertEquals("test3", thirdNode.getItem());

    }
}
