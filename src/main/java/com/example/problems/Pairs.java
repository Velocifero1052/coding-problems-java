package com.example.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pairs {

    public static List<String> solution(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return Collections.emptyList();

        Arrays.sort(nums);

        int i = 0, j = nums.length - 1;
        var res = new ArrayList<String>();

        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                res.add(List.of(nums[i], nums[j]).toString());
                i++;
                j--;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return res;
    }

}
