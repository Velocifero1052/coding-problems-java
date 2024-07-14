package com.example;

import com.example.problems.BestTimeBuySellStock;
import com.example.problems.FindingDuplicates;
import com.example.problems.Pairs;
import com.example.problems.ReverseString;
import com.example.problems.RomanToInteger;
import com.example.problems.SquaresOfSortedArray;
import com.example.problems.TwoSum;
import com.example.problems.ValidPalindrome;
import com.example.problems.ValidParentheses;

public class Main {

    public static void printArray(int[] nums) {
        System.out.print("[");
        boolean first = true;
        for (int num : nums) {
            if (!first) {
                System.out.print("," + num);
            } else {
                System.out.print(num);
                first = false;
            }
        }
        System.out.println("]");
    }

    public static void hr() {
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        //1. two sum
        hr();
        System.out.println("1. Two sum");
        System.out.println("Input: nums = [2,7,11,15], target = 22");
        var twoSumResult = TwoSum.solution(new int[]{2, 7, 11, 15}, 22);
        System.out.print("Output: ");
        printArray(twoSumResult);
        hr();

        //2. Finding duplicates
        System.out.println("2. Finding duplicates");
        System.out.println("Input: nums: [4,3,2,7,8,2,3,1]");
        System.out.println("Output: " + FindingDuplicates.solution(new int[]{4,3,2,7,8,2,3,1}));
        hr();

        //3. Pairs
        System.out.println("3. Pairs");
        var pairInput = new int[]{-1 -4, 0, -5, 10, 2, 3, 4, 5, 2, 1, 3};
        System.out.print("Input: ");
        printArray(pairInput);
        System.out.println("Output: " + Pairs.solution(pairInput, 4));
        hr();

        //4. Squares of a Sorted Array
        System.out.println("4. Squares of a Sorted Array");
        var sortedSquaresInput = new int[]{-7,-3,2,3,11};
        System.out.print("Input: ");
        printArray(sortedSquaresInput);
        System.out.print("Output: ");
        printArray(SquaresOfSortedArray.solution(sortedSquaresInput));
        hr();

        //5. Roman to Integer
        System.out.println("5. Roman to Integer");
        var romanToIntegerInput = "MCMXCIV";
        System.out.println("Input: " + romanToIntegerInput);
        System.out.println("Output: " + RomanToInteger.solution(romanToIntegerInput));
        hr();

        //6. Valid parentheses
        System.out.println("6. Valid parentheses");
        var validParenthesesInput = "{}[]()";
        System.out.println("Input: " + validParenthesesInput);
        System.out.println("Output: " + ValidParentheses.solution(validParenthesesInput));
        var validParenthesesInput2 = "{}}";
        System.out.println("Input: " + validParenthesesInput2);
        System.out.println("Output: " + ValidParentheses.solution(validParenthesesInput2));
        hr();

        //7. Best time to buy and sell stocks
        System.out.println("7. Best time to buy and sell stocks");
        var bestTimeToBuyAndSellInput = new int[]{7,1,5,3,6,4};
        System.out.print("Input: ");
        printArray(bestTimeToBuyAndSellInput);
        System.out.println("Output: " + BestTimeBuySellStock.solution(bestTimeToBuyAndSellInput));
        hr();

        //8. Reverse String
        System.out.println("8. Reverse string");
        var reverseStringInput = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println("Input: " + String.valueOf(reverseStringInput));
        System.out.println("Output: " + String.valueOf(ReverseString.solution(reverseStringInput)));
        hr();

        //9. Valid palindrome
        System.out.println("9. Valid palindrome");
        var validPalindromInput = "A man, a plan, a canal: Panama";
        System.out.printf("Input: \"%s\"\n", validPalindromInput);
        System.out.println("Output: " + ValidPalindrome.solution(validPalindromInput));
        hr();

    }
}