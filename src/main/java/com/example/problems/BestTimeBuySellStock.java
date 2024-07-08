package com.example.problems;

public class BestTimeBuySellStock {
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock

    public static int solution(int[] prices) {

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
            }

            if (Math.abs(price - minPrice) > maxProfit) {
                maxProfit = Math.abs(price - minPrice);
            }

        }

        return maxProfit;
    }

}
