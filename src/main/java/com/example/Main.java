package com.example;

import com.example.problems.FindingDuplicates;
import com.example.problems.Pairs;
import com.example.problems.SquaresOfSortedArray;
import com.example.problems.TwoSum;

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
        var pairInput = new int[]{-1 -4, 0, -5, 10, 2, 3, 4, 5, 2, 1, 3};
        System.out.println("3. Pairs");
        System.out.print("Input: ");
        printArray(pairInput);
        System.out.println("Output: " + Pairs.solution(pairInput, 4));
        hr();
        //4. Squares of a Sorted Array
        var sortedSquaresInput = new int[]{-7,-3,2,3,11};
        System.out.println("4. Squares of a Sorted Array");
        System.out.print("Input: ");
        printArray(sortedSquaresInput);
        System.out.print("Output: ");
        printArray(SquaresOfSortedArray.solution(sortedSquaresInput));
        hr();



    }
}