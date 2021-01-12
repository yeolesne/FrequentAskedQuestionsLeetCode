package com.frequent.questions.Others;

//TC: O (N) -> To compute sum of all numbers in 'nums' array

//SC: O (1) -> No extra space used

public class MissingNumberGaussFormula {
	public int missingNumber(int[] nums) {

        // #1. Compute the sum of first 'N' natural numbers using Gauss's formula in constant time - O (1), formula: summation 0 to N = N(N + 1) / 2
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        
        // #2. Traverse through the array and compute sum of all numbers in linear time - O (N)
        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
    
        // #3. Missing number will be expectedSum - actualSum, return the missing number
        return expectedSum - actualSum;
     
    }
	
}
