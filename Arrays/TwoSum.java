package com.frequent.questions.Arrays;

import java.util.HashMap;

public class TwoSum {
	// Brute Force Solution, TC: O (N^2)
    public int[] twoSum(int[] nums, int target) {
        
        // Base condition
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        
        // Create a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        
        /******** One Pass Approach ************/
        
        // Traverse through array and fill the map - O (N)
        //for(int i = 0; i < nums.length; i++){
            //map.put(nums[i], i);
        //}
        
        // Traverse through array elements to find pair adding up to target and return their indexes
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            
            // Second condition makes sure that we are not using same element twice 
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i, map.get(complement)};
            }
            
            map.put(nums[i], i);
        }
        
       return new int[0]; 
        
    }
        
}
