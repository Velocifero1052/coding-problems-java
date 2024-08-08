package com.example.problems;

public class PlusOne {

    public static int[] solution(int[] digits) {
        int ln = digits.length;

        for (int i = ln - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[ln + 1];

        digits[0] = 1;

        return digits;
    }


}
