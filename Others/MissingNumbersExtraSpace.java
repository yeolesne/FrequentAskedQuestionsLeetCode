package com.frequent.questions.Others;

import java.util.Arrays;

//Extra space solution

//TC: O (N) + O (N + 1) = O (N) + O (N) = O (2N) = O (N), O (N) -> Traverse 'N' elements in 'nums' array, O (N + 1) -> Traverse 'N + 1' elements in 'temp' array to check for missing number

//SC: O (N + 1) = O (N) -> 'temp' array of length 'N + 1'

public class MissingNumbersExtraSpace {
	 public int missingNumber(int[] nums) {
	        int n = nums.length;
	        
	        // #1. Create a temp array of length 'n + 1'
	        int[] temp = new int[n + 1];
	        
	        // #2. fill the temp array with value -1
	        Arrays.fill(temp, -1);
	        
	        // #3. Traverse through 'nums' array and put the number at corresponding index in 'temp' array 
	        for(int i = 0; i < nums.length; i++){
	            temp[nums[i]] = nums[i];
	        }
	        
	        // #4. Traverse through 'temp' array to check for missing number, it will be still -1
	        int i;
	        for(i = 0; i < temp.length; i++){
	            if(temp[i] < 0){
	                break;
	            }
	        }
	        
	        // return index in 'temp' array as missing number
	        return i;
	        
	    }
	 
}
