package com.hackerrank.interview_preparation_kit.search;

import java.util.HashMap;
import java.util.Map;

public class IceCreamParlor {

    static void whatFlavors(int[] cost, int money) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            map.put(cost[i], i);
        }
        for (int i = 0; i < cost.length; i++) {
            Integer j = map.getOrDefault(money - cost[i], -1);
            if (j > 0 && j != i) {
                System.out.println(String.format("%s %s", i + 1, j + 1));
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 2};
        whatFlavors(a, 4); //1 4
    }
}
