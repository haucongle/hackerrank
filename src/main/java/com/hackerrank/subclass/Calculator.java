package com.hackerrank.subclass;

import java.util.ArrayList;
import java.util.List;

public class Calculator implements AdvancedArithmetic {
    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            return (int) Math.pow(n, p);
        }
    }

    private List<Integer> getFactors(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    @Override
    public int divisorSum(int n) {
        List<Integer> factors = getFactors(n);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
}
