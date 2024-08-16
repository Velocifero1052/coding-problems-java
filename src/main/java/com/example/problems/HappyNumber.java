package com.example.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean solution(int n) {
        Set<Integer> cache = new HashSet<>();

        while (n != 1 && !cache.contains(n)) {
            cache.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }


    private static int getNextNumber(int n) {
        var digits = new ArrayList<Integer>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        return digits.stream().map(number -> number * number).reduce(0, Integer::sum);
    }

    public static boolean solutionFloyds(int n) {
        var slow = n;
        var fast = getNextNumber(n);
        while (fast != 1 && slow != fast) {
            slow = getNextNumber(slow);
            fast = getNextNumber(getNextNumber(fast));
        }
        return fast == 1;
    }


}
