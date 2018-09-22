package com.hackerrank.interview_preparation_kit.miscellenaous;

public class FlippingBits {
    static long flippingBits(long n) {
        String binary = Long.toBinaryString(n);
        String s = String.format("%32s", binary).replace(' ', '0');
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                t.append('1');
            } else {
                t.append('0');
            }
        }
        return Long.parseLong(t.toString(), 2);
    }
}
