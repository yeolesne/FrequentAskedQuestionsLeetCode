package com.frequent.questions.Others;

import java.util.Arrays;

//TC: O (N log N) + O (N) = O (N log N), O (N log N) -> To sort the given array, O (N) -> Traverse through 'N' elements of the sorted array to check for missing number

//SC: O (1) -> No extra space used

public class MissingNumbersLogNSolution {
	 public int missingNumber(int[] nums) {

	        // #1. Sort the given array
	        Arrays.sort(nums);
	        
	        // #2. Traverse through sorted array to check for missing number
	        int i = 0;
	    
	        while(i < nums.length){
	            // #2.1. If the number in sorted array at 'i'th index is not equal to index itself, return the index as missing number
	            if(nums[i] != i){
	                return i;
	            }
	            i++;
	        }
	        
	        // return 'i+1' if the missing number is 'N'th number in the range 0 to N
	        return i;
	        
	    }
	 
}
