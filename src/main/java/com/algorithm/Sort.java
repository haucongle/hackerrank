package com.algorithm;

public class Sort {

    public static void main(String[] args) {

    }

    private void insertion(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int v = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > v) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = v;
        }
    }

    private void selection(int[] a) {
        int l = a.length;
        for (int i = 0; i < l - 1; i++) {
            int m = i;
            for (int j = i + 1; j < l; j++) {
                if (a[j] < a[m]) {
                    m = j;
                }
            }
            int t = a[i];
            a[i] = a[m];
            a[m] = t;
        }
    }

    private void bubble(int[] a) {
        int l = a.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = t;
                }
            }
        }
    }
}
