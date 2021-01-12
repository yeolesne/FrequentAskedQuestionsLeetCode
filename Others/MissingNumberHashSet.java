package com.frequent.questions.Others;

import java.util.HashSet;

//TC: O (N) + O (N) = O (2N) = O (N), O (N) -> To add 'N' elements of array to a set, O (N) -> Iterate through 0 to N numbers in a for loop

//SC: O (N) -> HashSet to store 'N' elements in 'nums' array


public class MissingNumberHashSet {
	 public int missingNumber(int[] nums) {

	        // #1. Create a HashSet
	        HashSet<Integer> set = new HashSet<>();
	        
	        // #2. Traverse through array and add all numbers to set
	        for(int num : nums){
	            set.add(num);
	        }
	    
	        // #3. Iterate through 0 to N numbers in for loop and check for missing number in a set
	        int expectedNumbers = nums.length + 1;
	        int i;
	        
	        for(i = 0; i < expectedNumbers; i++){
	            if(!set.contains(i)){
	                break;
	            }
	        }
	        
	        // #4. return missing number
	        return i;
	    
	        
	    }
	    
}
