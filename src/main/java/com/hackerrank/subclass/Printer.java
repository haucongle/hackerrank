package com.hackerrank.subclass;

public class Printer <T> {
    public void printArray(T[] arr) {
        for (T a : arr) {
            System.out.println(a);
        }
    }
}
