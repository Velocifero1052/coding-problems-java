package com.example.problems;

public class ReverseString {

    public static char[] solution(char[] word) {
        char temp;

        for (int i = 0; i < word.length / 2; i++) {
            temp = word[i];
            word[i] = word[word.length - i - 1];
            word[word.length - i - 1] = temp;
        }
        return word;
    }

}
