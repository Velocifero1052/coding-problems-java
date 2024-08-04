package com.example.problems;

import java.util.HashMap;

public class FirstUniqueCharacter {

    public static int solution(String s) {
        var map = new HashMap<Character, Integer>();

        for (var i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);
            map.computeIfPresent(ch, (key, value) -> value + 1);
            map.putIfAbsent(ch, 1);
        }

        for (int i = 0 ; i < s.length(); i++) {
            var ch = s.charAt(i);

            if (map.get(ch) == 1) {
                return i;
            }

        }


        return -1;
    }

}
