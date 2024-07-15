package com.example.problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static boolean solution(int[] nums) {
        Set<Integer> cache = new HashSet<>();

        for (Integer num : nums) {
            if (cache.contains(num))
                return true;
            else cache.add(num);
        }

        return false;
    }

}
