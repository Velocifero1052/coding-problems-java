package com.example.problems;

import java.util.Map;
import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/description/
public class ValidParentheses {

    private static Map<Character, Character> map = Map.of(
      ')', '(',
      '}', '{',
      ']', '['
    );

    //false:
    //1. Pop stack bracket  != value from the map
    //2. If stack is empty in case of comparing of brackets
    //3. Reached the end of s and stack is not empty
    public static boolean solution(String s) {
        if (s == null || s.isEmpty()) return false;

        var stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.containsValue(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                var br = stack.pop();
                if (br != map.get(ch)) return false;
            }
        }

        return stack.isEmpty();
    }

}
