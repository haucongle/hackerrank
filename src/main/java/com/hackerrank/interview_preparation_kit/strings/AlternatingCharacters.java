package com.hackerrank.interview_preparation_kit.strings;

public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        if (arr.length == 0) {
            return 0;
        }
        char current = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == current) {
                count++;
            } else {
                current = arr[i];
            }
        }
        return count;
    }
}
