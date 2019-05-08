package com.deanalvero.datastructures.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListNodeTest {

    @Test
    public void new_input_sameInput() {
        String input = "input";

        LinkedListNode<String> item = new LinkedListNode<>(
                input,
                null
        );

        assertEquals("input", item.getItem());
        assertNull(item.getNext());
    }

    @Test
    public void setNext_input_getNextReturnInput() {
        String input1 = "input1";
        String input2 = "input2";

        LinkedListNode<String> item1 = new LinkedListNode<>(
                input1,
                null
        );

        LinkedListNode<String> item2 = new LinkedListNode<>(
                input2,
                null
        );

        item1.setNext(item2);

        assertEquals("input1", item1.getItem());
        assertEquals("input2", item2.getItem());
        assertNull(item2.getNext());
        assertEquals(item2, item1.getNext());
    }
}
