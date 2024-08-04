package com.example.problems;


public class SqrtX {

    public static int solution(int num) {
        if (num < 2) {
            return num;
        }

        var left = 2;
        var right = num / 2;
        var pivot = 0;

        var number = 0L;

        while (left < right) {
            pivot = left + (right - left) / 2;
            number = (long) pivot * pivot;
            if (number > num) {
                right = pivot - 1;
            } else if (number < num) {
                left = pivot + 1;
            } else {
                return pivot;
            }
        }

        return right - 1;
    }

}
