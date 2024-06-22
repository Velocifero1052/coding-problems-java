package com.example.problems;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array

public class FindingDuplicates {

    private static final Integer MAX_NUMBER = 30000;

    public static List<Integer> solution(int[] nums) {
        var bits = new BitSet(MAX_NUMBER);
        var res = new ArrayList<Integer>();
        for (int num : nums) {
            if (bits.get(num))
                res.add(num);
             else
                bits.set(num);
        }
        return res;
    }

}
