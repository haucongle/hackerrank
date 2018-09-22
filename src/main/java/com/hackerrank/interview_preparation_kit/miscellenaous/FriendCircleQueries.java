package com.hackerrank.interview_preparation_kit.miscellenaous;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FriendCircleQueries {

    static int[] maxCircle(int[][] queries) {
        int length = queries.length;
        int[] result = new int[length];
        Map<Integer, Integer> map = new HashMap<>();
        int group = 0;
        for (int i = 0; i < length; i++) {
            int[] query = queries[i];
            if (map.containsKey(query[0]) && map.containsKey(query[1])) {
                Integer value = map.get(query[0]);
                Integer value2 = map.get(query[1]);
                map = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,
                        e -> {
                            if (e.getValue().equals(value2)) {
                                return value;
                            }
                            return e.getValue();
                        }));
            } else if (map.containsKey(query[0])) {
                Integer value = map.get(query[0]);
                map.put(query[1], value);
            } else if (map.containsKey(query[1])) {
                Integer value = map.get(query[1]);
                map.put(query[0], value);
            } else {
                map.put(query[0], group);
                map.put(query[1], group);
                group++;
            }
            System.out.println(map);
            result[i] = map.values().stream()
                    .collect(Collectors.toMap(Function.identity(), e -> 1, Math::addExact))
                    .entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
//        int[][] q = {
//                {1, 2},
//                {3, 4},
//                {1, 3},
//                {5, 7},
//                {5, 6},
//                {7, 4},
//        };
//        System.out.println(Arrays.toString(maxCircle(q))); // 2.2.4.4.7
        int[][] q = new int[50000][];
        String fileName = "C:\\Users\\WIN 10\\IdeaProjects\\selenium\\src\\main\\resources\\testcase.txt";
        FileReader fileReader = new FileReader(fileName);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int j = 0;
        while ((line = bufferedReader.readLine()) != null) {
            String[] strings = line.split(" ");
            int[] intarray = new int[strings.length];
            int i = 0;
            for (String str : strings) {
                intarray[i++] = Integer.parseInt(str);
            }
            q[j++] = intarray;
        }
//        System.out.println(Arrays.deepToString(q));
        System.out.println(Arrays.toString(maxCircle(q)));
    }
}
