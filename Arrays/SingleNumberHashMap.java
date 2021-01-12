package com.frequent.questions.Arrays;

import java.util.HashMap;

//TC: O (N) -> Traverse through 'N' elements in array and fill the map with count of each element

//SC: O (N) -> HashMap to store the count of each (N) number(s) in array

public class SingleNumberHashMap {
	public int singleNumber(int[] nums) {
        // #1. Create a HashMap to keep track of count/frequency of each number in array
        HashMap<Integer, Integer> count = new HashMap<>();
        
        // #2. Fill the map with count/frequency of each number in array
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        // #3. Traverse through the keys in map and check if count of number(key) is 1, return that number(key) as a single number, lookup in HashMap is constant time -> O (1)
        for(Integer key : count.keySet()){
            if(count.get(key) < 2){
                return key;
            }         
        }
        
        // #4. else, return -1
        return -1;
        
    }
	
}
