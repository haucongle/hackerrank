package com.hackerrank.interview_preparation_kit.dictionaries_hashmaps;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {
        Map<Character, Integer> m = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }
        for (Character c : s2.toCharArray()) {
            if (m.containsKey(c)) {
                return "YES";
            }
        }
        return "NO";
    }
}
