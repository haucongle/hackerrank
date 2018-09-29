package com.hackerrank.data_structures.arrays;

import java.util.Arrays;

public class ArraysDS {

    static int[] reverseArray(int[] a) {
        int[] res = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            res[j++] = a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2};
        int[] res = reverseArray(arr);
        System.out.println(Arrays.toString(res));
    }

}
