package com.example.problems;

import java.util.Map;
import java.util.HashMap;
public class RomanToInteger {

    //1. create a map roman to integer
    //2. create a function special case
    private static final Map<Character, Integer> map = new HashMap<>();
    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static Integer processSubstractCase(Character c1, Character c2) {
        if (c1 == null || c2 == null) return null;

        if (c1 == 'I' && c2 == 'V')
            return 4;
        if (c1 == 'I' && c2 == 'X')
            return 9;
        if (c1 == 'I' && c2 == 'L')
            return 9;
        if (c1 == 'X' && c2 == 'L')
            return 40;
        if (c1 == 'X' && c2 == 'C')
            return 90;
        if (c1 == 'C' && c2 == 'D')
            return 400;
        if (c1 == 'C' && c2 == 'M')
            return 900;

        return null;
    }

    public static Integer solution(String s) {
        var result = 0;

        if (s == null || s.isEmpty()) return 0;

        for (int i = 0; i < s.length(); i++) {
            var c1 = s.charAt(i);
            var c2 = i != (s.length() - 1) ? s.charAt(i + 1) : null;
            var sCase = processSubstractCase(c1, c2);

            if (sCase != null) {
                result += sCase;
                i++;
            } else {
                result += map.get(c1);
            }

        }

        return result;
    }

}
