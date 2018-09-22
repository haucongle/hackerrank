package com.interview;

public class Carzy {

    public static void main(String[] args) {
        int number = 1225441;
        int length = String.valueOf(number).length();
        for (int i = length - 1; i >= 0; i--) {
            System.out.println((int) ((int) (number / Math.pow(10, i)) * Math.pow(10, i)));
            number = (int) (number % Math.pow(10, i));
        }
    }
}
