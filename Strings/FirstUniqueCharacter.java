package com.frequent.questions.Strings;

import java.util.HashMap;

public class FirstUniqueCharacter {
	// TC:O (N) + O (N) = O (2N) -> O (N) 
    // SC: O (N)
    
    // **************** Two Pass Approach ***************** //
    public int firstUniqChar(String s) {
        // Base condition
        if(s == null || s.length() == 0){
            return -1;
        }
        
        // Create a HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Traverse through the array and fill the map
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
        }
        
        // Traverse through the array again to find first unique character in a string
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(map.get(ch) == 1){
                return i;
            }
            
        }
        
        return -1;
    }
    
}
