package com.hackerrank.interview_preparation_kit.arrays;

public class TwoDimensionArray {
    private static int sumHourGlass(int[][] arr, int i, int j) {
        return arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int sum = sumHourGlass(arr, 0, 0);
        int tmp;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tmp = sumHourGlass(arr, i, j);
                if (tmp > sum) {
                    sum = tmp;
                }
            }
        }
        System.out.println(sum); // 19
    }
}
