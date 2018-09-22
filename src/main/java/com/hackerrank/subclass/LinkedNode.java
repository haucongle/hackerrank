package com.hackerrank.subclass;

public class LinkedNode {
    int data;
    LinkedNode next;

    LinkedNode(int d) {
        data = d;
        next = null;
    }

    public static LinkedNode removeDuplicates(LinkedNode head) {
        //Write your code here
        LinkedNode start = head;
        while (start.next != null) {
            if (start.data == start.next.data) {
                start.next = start.next.next;
            } else {
                start = start.next;
            }
        }
        return head;
    }

    public static LinkedNode insert(LinkedNode head, int data) {
        LinkedNode p = new LinkedNode(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            LinkedNode start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(LinkedNode head) {
        LinkedNode start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}
