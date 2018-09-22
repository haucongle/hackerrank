package com.hackerrank.interview_preparation_kit.sorting;

public class BubbleSort {
    static void countSwaps(int[] a) {
        int n = a.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    c++;
                }
            }
        }
        System.out.println("Array is sorted in " + c + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }
}
