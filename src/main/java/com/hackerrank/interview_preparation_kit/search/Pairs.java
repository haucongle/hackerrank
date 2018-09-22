package com.hackerrank.interview_preparation_kit.search;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    static int pairs(int k, int[] a) {
        int c = 0;
        Map<Integer, Boolean> m = new HashMap<>();
        for (Integer i : a) {
            m.put(i, true);
        }
        for (Integer i : m.keySet()) {
            if (m.getOrDefault(i - k, false)) {
                c++;
            }
            if (m.getOrDefault(i + k, false)) {
                c++;
            }
            m.put(i, false);
        }
        return c;
    }
}
