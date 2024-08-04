package com.example.problems;

import java.util.HashMap;

public class MajorityElement {

    public static int solution(int[] nums) {
        var map = new HashMap<Integer, Integer>();

        for (var num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > nums.length / 2)
                return num;

        }

        return 0;
    }

}
