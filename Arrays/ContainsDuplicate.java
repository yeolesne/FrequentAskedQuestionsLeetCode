package com.frequent.questions.Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
	 /*
	    *   Time Complexity: O (N)
	    *   Space Complexity: O (N)
	    */
	    public boolean containsDuplicate(int[] nums) {
	        
	        // Base condition
	        if(nums == null || nums.length == 0){
	            return false;
	        }
	        
	        // Create a Hashset
	        HashSet<Integer> set = new HashSet<>();
	        
	        // Traverse through the array, if element not present in set add it, else return true as duplicates present in array
	        for(int i = 0; i < nums.length; i++){
	            
	            if(!set.contains(nums[i])){
	                set.add(nums[i]);
	            }
	            else{
	                return true;
	            }
	            
	        }
	        
	        return false;
	        
	    }
	    
}
