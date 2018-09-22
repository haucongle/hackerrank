package com.hackerrank.interview_preparation_kit.strings;

public class MakeAnagrams {
    static int makeAnagram(String a, String b) {
        int[] arr = new int[26];
        int count = 0;
        for (char c : a.toCharArray()) {
            ++arr[c - 'a'];
        }
        for (char c : b.toCharArray()) {
            --arr[c - 'a'];
        }
        for (int i : arr) {
            count += Math.abs(i);
        }
        return count;
    }
}
