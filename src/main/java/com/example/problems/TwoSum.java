package com.example.problems;

import java.util.HashMap;
//https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static int[] solution(int[] nums, Integer target) {
        var numsMap = new HashMap<Integer, Integer>();

        // initializing map
        for (var i = 0; i < nums.length; i++) {
            var num = nums[i];
            if (!numsMap.containsKey(target - num)) {
                numsMap.put(num, i);
            }
            else {
                var firstIndex = numsMap.get(target - num);
                return new int[]{firstIndex, i};
            }
        }
        return new int[]{};
    }

}
