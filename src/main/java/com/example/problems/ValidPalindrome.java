package com.example.problems;

public class ValidPalindrome {

    public static boolean solution(String s) {

        var sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        var s_ = sb.toString();


        int i = 0;
        int j = s_.length() - 1;

        while (i < j) {
            var symbolOne = Character.toLowerCase(s_.charAt(i));
            var symbolTwo = Character.toLowerCase(s_.charAt(j));
            if (symbolOne != symbolTwo) return false;

            i++;
            j--;
        }

        return true;
    }

}
