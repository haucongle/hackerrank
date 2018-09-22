package com.hackerrank.subclass;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int min = elements[0], max = elements[0];
        for (int e : elements) {
            if (e < min) {
                min = e;
            }
            if (e > max) {
                max = e;
            }
        }
        maximumDifference = Math.abs(max - min);
    }
}
