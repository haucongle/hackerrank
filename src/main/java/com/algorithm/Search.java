package com.algorithm;

public class Search {
    public static void main(String[] args) {

    }

    private int linear(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return i;
            }
        }
        return -1;
    }

    private int binary(int[] a, int k) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] == k) {
                return m;
            } else if (a[m] < k) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    private int binary2(int[] a, int k, int l, int r) {
        if (l > r) {
            return -1;
        }
        int m = (l + r) / 2;
        if (a[m] == k) {
            return m;
        } else if (a[m] < k) {
            return binary2(a, k, m + 1, r);
        } else {
            return binary2(a, k, l, m - 1);
        }
    }
}
