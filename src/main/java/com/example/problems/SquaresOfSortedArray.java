package com.example.problems;

public class SquaresOfSortedArray {
    //https://leetcode.com/problems/squares-of-a-sorted-array
    public static int[] solution(int[] nums) {
        var res = new int[nums.length];
        int l = 0; int r = nums.length -1;
        int i = nums.length - 1;

        while (l <= r) {
            if (Math.abs(nums[l]) < Math.abs(nums[r])) {
                res[i] = nums[r] * nums[r];
                r--;
            } else {
                res[i] = nums[l] * nums[l];
                l++;
            }
            i--;
        }

        return res;
    }

}
