package com.frequent.questions.Others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

//Generic Approach - Opening characters in a set and closing : opening mapping in a map

//TC: O (N) - Traverse 'n' characters in a string
//SC: O (N) - Store 'n' opening characters of a string in stack, 'n' opening characters in a set and closing to opening mapping of 'n' characters in a map

public class ValidParenthesisGenericApproach {
	public boolean isValid(String s) {
        
        // #1. Create a stack
        Stack<Character> stack = new Stack<>();
        
        // #2. Create a HashSet to store the opening characters (brackets)
        HashSet<Character> opening = new HashSet<>(Arrays.asList('(', '[', '{'));
        
        // 3.  Create a HashMap to store the mapping of closing and its corresponding opening bracket
        HashMap<Character, Character> closing = new HashMap<>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        
        // #4. Traverse through the characters in a string
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            // #4.1. if opening characters encountered, push to stack
            // If the opening character is present in hashset, push to stack
            if(opening.contains(ch)){
                stack.push(ch);
            }
            
            // #4.2. If closing brackets and stack is not empty, get the opening bracket from "closing" map and check for the corresponding opening bracket at top of stack and pop, if not correct opening bracket, return false directly
            else if(!stack.isEmpty()){
               if(closing.get(ch) != stack.pop()){
                    return false;
                }
            }
            // #4.3. else block handles cases such as s = "]"
            else{
                return false;
            }
            
        }
        
        // #5. This handles cases such as s = "[" - stack will not be empty in such case and input is invalid, return false
        return stack.isEmpty();
        
    }

}
