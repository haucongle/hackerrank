package com.hackerrank.interview_preparation_kit.greedy_algorithms;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            value = Math.min(value, arr[i + 1] - arr[i]);
        }
        return value;
    }

    public static void main(String[] args) {
        int[] a = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        System.out.println(minimumAbsoluteDifference(a));//1
    }
}
