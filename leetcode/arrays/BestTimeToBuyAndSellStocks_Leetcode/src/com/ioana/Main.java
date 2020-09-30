package com.ioana;

public class Main {

    public static void main(String[] args) {

        int[] prices = new int[] {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if(prices[i] < minBuyPrice) {

                minBuyPrice = prices[i];

            } else if(prices[i] - minBuyPrice > maxProfit) {

                maxProfit = prices[i] - minBuyPrice;
            }

        }

        return maxProfit;
    }
}
