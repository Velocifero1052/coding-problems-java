package com.example;

import com.example.problems.BestTimeBuySellStock;
import com.example.problems.ContainsDuplicates;
import com.example.problems.FindingDuplicates;
import com.example.problems.FirstUniqueCharacter;
import com.example.problems.IntersectionOfTwoArrays;
import com.example.problems.MissingNumber;
import com.example.problems.Pairs;
import com.example.problems.ReverseString;
import com.example.problems.RomanToInteger;
import com.example.problems.SingleNumber;
import com.example.problems.SqrtX;
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
        var validPalindromeInput = "A man, a plan, a canal: Panama";
        System.out.printf("Input: \"%s\"\n", validPalindromeInput);
        System.out.println("Output: " + ValidPalindrome.solution(validPalindromeInput));
        hr();

        //10. Single number
        System.out.println("10. Single number");
        var singleNumberInput = new int[]{ 4, 1, 2, 1, 2 };
        System.out.print("Input: ");
        printArray(singleNumberInput);
        System.out.println("Output: " + SingleNumber.solution(singleNumberInput));
        hr();

        //11. Contains duplicate
        System.out.println("11. Contains duplicates");
        var containsDuplicateInput = new int[]{1,2,3,1};
        System.out.print("Input: ");
        printArray(containsDuplicateInput);
        System.out.println("Output: " + ContainsDuplicates.solution(containsDuplicateInput));
        hr();

        //12. First unique character
        System.out.println("12. First unique character");
        var firstUniqueCharacterInput = "loveleetcode";
        System.out.printf("Input: \"%s\"\n", firstUniqueCharacterInput);
        System.out.println("Output: " + FirstUniqueCharacter.solution(firstUniqueCharacterInput));
        hr();

        //13. Intersection of two arrays
        System.out.println("13. Intersection of two arrays");
        var arr1 = new int[]{1, 2, 2 ,1};
        var arr2 = new int[]{2, 2};
        System.out.println("Input: ");
        printArray(arr1);
        printArray(arr2);
        System.out.print("Output: ");
        printArray(IntersectionOfTwoArrays.solution(arr1, arr2));
        hr();

        //14. SqrtX
        System.out.println("14. SqrtX");
        var input = 6;
        System.out.println("Input: " + input);
        System.out.println("Output: " + SqrtX.solution(input));
        hr();

        //15. Missing Number
        System.out.println("15. Missing number");
        var missingNumberInput = new int[]{3, 0, 1};
        System.out.print("Input: ");
        printArray(missingNumberInput);
        System.out.println("Output: " + MissingNumber.solution(missingNumberInput));
        System.out.println("XOR solution output: " + MissingNumber.xorSolution(missingNumberInput));
        hr();

    }
}