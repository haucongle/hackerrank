package com.hackerrank.subclass;

public class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }

    public static int getHeight(Node root) {
        if (root == null) {
            return -1;
        }
        int l = getHeight(root.left);
        int r = getHeight(root.right);
        if (l > r) {
            return l + 1;
        } else {
            return r + 1;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}
