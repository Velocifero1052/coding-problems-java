package com.example.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {

    public static int[] solution(int[] arr1, int[] arr2) {
        if (arr1.length < arr2.length)
            return solution(arr2, arr1);

        Map<Integer, Integer> cache = new HashMap<>();

        for (var a: arr1) {
            cache.put(a,
                    cache.getOrDefault(a, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();

        for (var a: arr2) {
            int count = cache.getOrDefault(a, 0);
            if (count > 0) {
                res.add(a);
                cache.put(a, count - 1);
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

}
