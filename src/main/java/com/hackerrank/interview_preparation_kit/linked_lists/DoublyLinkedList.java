package com.hackerrank.interview_preparation_kit.linked_lists;

import java.util.ArrayList;
import java.util.List;

class DoublyLinkedList {
    DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    void insertNode(int nodeData) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
    }

    static void printDoublyLinkedList(DoublyLinkedListNode node) {
        List<String> l = new ArrayList<>();
        while (node != null) {
            l.add(String.valueOf(node.data));
            node = node.next;
        }
        System.out.println(String.join("->", l));
    }
}
