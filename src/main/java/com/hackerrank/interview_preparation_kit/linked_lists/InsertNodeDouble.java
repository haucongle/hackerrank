package com.hackerrank.interview_preparation_kit.linked_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InsertNodeDouble {
    private static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        List<Integer> l = new ArrayList<>();
        l.add(data);
        while (head != null) {
            l.add(head.data);
            head = head.next;
        }
        Collections.sort(l);
        DoublyLinkedListNode tmp = new DoublyLinkedListNode(l.get(0));
        head = tmp;
        for (int i = 1; i < l.size(); i++) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(l.get(i));
            tmp.next = node;
            node.prev = tmp;
            tmp = tmp.next;
        }
        return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            DoublyLinkedList llist = new DoublyLinkedList();

            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }

            int data = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            DoublyLinkedListNode llist1 = sortedInsert(llist.head, data);

            DoublyLinkedList.printDoublyLinkedList(llist1);
        }

        scanner.close();
    }
}