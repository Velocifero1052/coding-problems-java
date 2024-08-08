package com.example.problems;

public class ClimbingStairs {

    public static int solution(int num) {
        int[] cache = new int[num + 1];

        return helperRecursive(num, cache);
    }

    public static int helperRecursive(int i, int[] cache) {
        if (i < 0) return 0;
        if (i == 0) return 1;
        if (cache[i] > 0) return cache[i];

        cache[i] = helperRecursive(i - 1, cache) + helperRecursive(i - 2, cache);
        return cache[i];
    }


}
