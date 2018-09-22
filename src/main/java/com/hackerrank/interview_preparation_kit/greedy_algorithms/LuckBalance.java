package com.hackerrank.interview_preparation_kit.greedy_algorithms;

import java.util.Arrays;
import java.util.Collections;

public class LuckBalance {

    static int luckBalance(int k, int[][] contests) {
        int sum = 0;
        int size = contests.length;
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            if (contests[i][1] == 1) {
                arr[i] = contests[i][0];
            } else {
                arr[i] = 0;
                sum += contests[i][0];
            }
        }

        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < size; i++) {
            if (i < k) {
                sum += arr[i];
            } else {
                sum -= arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] a = {
                {5, 1},
                {2, 1},
                {1, 1},
                {8, 1},
                {10, 0},
                {5, 0},
        };
        System.out.println(luckBalance(3, a));
    }

}
