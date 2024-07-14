package com.example.problems;

public class SingleNumber {

    public static int solution(int[] arr) {
        int res = 0;

        for (int num: arr) {
            res ^= num;
        }

        return res;
    }

}
