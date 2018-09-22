package com.hackerrank.interview_preparation_kit.arrays;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        for (int i = 0; i < d; i++) {
            a = rotLeft(a);
        }
        return a;
    }

    static int[] rotLeft(int[] a) {
        if (a.length != 0) {
            int tmp = a[0];
            for (int i = 0; i < a.length; i++) {
                if (i == a.length - 1) {
                    a[i] = tmp;
                } else {
                    a[i] = a[i + 1];
                }
            }
        }
        return a;
    }
}
