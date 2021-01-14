package com.frequent.questions.Others;

//Two pointers approach

//TC: O (N) -> Traverse through 'N' stock prices in given array to find maximum profit
//SC: O (1) -> No extra space used


public class BuyAndSellStock {
	public int maxProfit(int[] prices) {
        
        // #1. Base condition
        if(prices == null){
            return 0;
        }
        
        // #2. Initialize buying price to max Integer value and maximum profit to 0
        // In order to get maximum profit, we need minimum buying price and maximum difference of selling and buying price
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        // #3. Traverse through the stock prices to get minimum buying price and maximum profit
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buyingPrice){
                buyingPrice = prices[i];
            }
            else if(prices[i] - buyingPrice > maxProfit){
                maxProfit = prices[i] - buyingPrice;
            }
            
        }
        
        return maxProfit;
        
    }
    
}
