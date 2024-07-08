package com.example.problems;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    //https://leetcode.com/problems/valid-parentheses/
    //1. input string valid if open brackets must be closed by the same type of brackets
    //2. open brackets must be closed in the correct order
    //3. Every close bracket has a corresponding open bracket of the same type

    static Map<Character, Character> map = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
    );

    public static Boolean solution(String s) {
        if (s == null || s.isEmpty()) return false;

        var stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;

                Character character = stack.pop();
                if (character != map.get(s.charAt(i))) return false;
            }
        }

        return stack.isEmpty();
    }

}
