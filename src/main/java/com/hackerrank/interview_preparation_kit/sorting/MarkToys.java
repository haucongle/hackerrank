package com.hackerrank.interview_preparation_kit.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MarkToys {
    static int maximumToys(int[] prices, int k) {
        List<Integer> l = Arrays.stream(prices).boxed()
                .sorted(Comparator.comparingInt(i -> i))
                .collect(Collectors.toList());
        int c = 0, s = 0;
        for (Integer i : l) {
            if (s + i <= k) {
                s += i;
                c++;
            } else {
                break;
            }
        }
        return c;
    }
}
