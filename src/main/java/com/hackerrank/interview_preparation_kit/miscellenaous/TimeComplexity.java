package com.hackerrank.interview_preparation_kit.miscellenaous;

public class TimeComplexity {
    static String primality(int n) {
        if (n < 2) {
            return "Not prime";
        }
        if (n < 4) {
            return "Prime";
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }
}
