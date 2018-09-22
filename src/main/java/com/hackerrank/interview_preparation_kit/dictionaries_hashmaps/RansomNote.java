package com.hackerrank.interview_preparation_kit.dictionaries_hashmaps;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    static Map<String, Integer> createStatistic(String[] a) {
        Map<String, Integer> m = new HashMap<>();
        for (String s : a) {
            if (m.containsKey(s)) {
                m.put(s, m.get(s) + 1);
            } else {
                m.put(s, 1);
            }
        }
        return m;
    }

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> m = createStatistic(magazine);
        Map<String, Integer> n = createStatistic(note);
        boolean flag = true;
        for (String c : n.keySet()) {
            if (!m.containsKey(c) || (n.get(c) > m.get(c))) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}
