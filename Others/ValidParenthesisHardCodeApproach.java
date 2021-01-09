package com.frequent.questions.Others;

import java.util.Stack;

//Hardcoded approach - Characters in a string are hardcoded 

//TC: O (N) - Traverse 'n' characters in a string
//SC: O (N) - Store 'n' opening characters of a string in stack

public class ValidParenthesisHardCodeApproach {
	 public boolean isValid(String s) {
	        
	        // #1. Create a stack
	        Stack<Character> stack = new Stack<>();
	        
	        // #2. Traverse through the characters in a string
	        for(int i = 0; i < s.length(); i++){
	            char ch = s.charAt(i);
	            
	            // #2.1. if opening characters encountered, push to stack
	            if(ch == '(' || ch == '[' || ch == '{'){
	                stack.push(ch);
	            }
	            
	            // #2.2. If closing brackets and stack is not empty, check for the corresponding opening bracket at top of stack and pop, if not correct opening bracket, return false directly
	            else if(!stack.isEmpty()){
	               if(ch == ')' && stack.pop() != '('){
	                    return false;
	                }
	                else if(ch == ']' && stack.pop() != '['){
	                    return false;
	                }
	                else if(ch == '}' && stack.pop() != '{'){
	                    return false;
	                }
	              
	            }
	            // #2.3. else block handles cases such as s = "]"
	            else{
	                return false;
	            }
	            
	        }
	        
	        // #3. This handles cases such as s = "[" - stack will not be empty in such case and input is invalid, return false
	        return stack.isEmpty();
	        
	    }
	 
}
