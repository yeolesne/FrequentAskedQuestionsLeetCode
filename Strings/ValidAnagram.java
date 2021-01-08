package com.frequent.questions.Strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	 // TC: O (N) -> To traverse string 's' and fill the map
    //     O (N) -> To traverse string 't' and check if it is anagram of 's'
    
    // SC: O (N) -> Using HashMap to store the count of each character in string 's'
    public boolean isAnagram(String s, String t) {
        
        // Base condition
        if(s.length() == 0 && !s.equals("") || t.length() == 0 && !t.equals("")
           || s.length() != t.length()){
            return false;
        }
        
        // Create a HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Traverse through string 's' and fill map with count of each character in 's'
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // Traverse through the string 't' to see if it is anagram of string 's'
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            
            // If any character in 't' is not present in HashMap, then return false right away
            if(!map.containsKey(ch)){
                return false;
            }
            // Else, reduce the count of that character in HashMap
            else{
                map.put(ch, map.get(ch) - 1);
            }
            
        }
        
        // For-Each loop to iterate through all the keys in HashMap and check if the values of all keys is 0, meaning string 't' has exactly same characters as string 's' ('t' is anagram of 's')
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            // If any value is not 0, means 't' has different characters than 's', return false
            if(entry.getValue() != 0){
                return false;
            }
        }
        
        // Else, return true, 't' is anagram of 's'
        return true;
    
    }
    
}
