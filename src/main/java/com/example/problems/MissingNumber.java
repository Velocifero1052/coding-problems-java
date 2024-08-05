package com.example.problems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MissingNumber {

    public static int solution(int[] nums) {


        var set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        for(int i = 0; i < nums.length + 1; i++) {
            if (!set.contains(i)) return i;
        }

        return 0;
    }

    public static int xorSolution(int[] nums) {
        int ln = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ln ^= i ^ nums[i];
        }
        return ln;
    }


}
