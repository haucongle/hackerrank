package com.hackerrank.interview_preparation_kit.linked_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertNodeSingle {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        int data = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

        printSinglyLinkedList(llist_head);

        scanner.close();
    }

    private static void printSinglyLinkedList(SinglyLinkedListNode node) {
        List<String> l = new ArrayList<>();
        while (node != null) {
            l.add(String.valueOf(node.data));
            node = node.next;
        }
        System.out.println(String.join("->", l));
    }

    private static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode tmp = head;
        for (int i = 0; i < position - 1; i++) {
            tmp = tmp.next;
        }
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode tmp2 = tmp.next;
        tmp.next = node;
        node.next = tmp2;
        return head;
    }
}


