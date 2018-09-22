package com.hackerrank.interview_preparation_kit.arrays;

public class NewYearChaos {
    static void minimumBribes(int[] a) {
        int sum = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, a[i] - 2); j < i; j++) {
                if (a[j] > a[i]) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
