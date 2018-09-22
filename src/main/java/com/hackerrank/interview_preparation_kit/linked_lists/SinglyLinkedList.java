package com.hackerrank.interview_preparation_kit.linked_lists;

import java.util.ArrayList;
import java.util.List;

class SinglyLinkedList {
    SinglyLinkedListNode head;
    private SinglyLinkedListNode tail;

    SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    static void printSinglyLinkedList(SinglyLinkedListNode node) {
        List<String> l = new ArrayList<>();
        while (node != null) {
            l.add(String.valueOf(node.data));
            node = node.next;
        }
        System.out.println(String.join("->", l));
    }

    void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}
