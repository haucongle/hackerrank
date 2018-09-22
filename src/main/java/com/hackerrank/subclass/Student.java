package com.hackerrank.subclass;

class Student extends Person {
    private int[] scores;

    Student(String f, String l, int id, int[] scores) {
        super(f, l, id);
        this.scores = scores;
    }

    String calculate() {
        int sum = 0;
        for (int s : scores) {
            sum += s;
        }
        int avg = sum / scores.length;
        if (avg >= 90) {
            return "O";
        } else if (avg >= 80) {
            return "E";
        } else if (avg >= 70) {
            return "A";
        } else if (avg >= 55) {
            return "P";
        } else if (avg >= 40) {
            return "D";
        } else {
            return "T";
        }
    }
}
