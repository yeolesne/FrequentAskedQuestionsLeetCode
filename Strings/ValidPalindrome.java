package com.frequent.questions.Strings;


/*
*   Questions to ask to interviewer:
*       1. Lower and Upper case letters are same?
*       2. Is empty string considered as a valid palindrome?
*       3. Should we consider special characters as well or just alphanumeric characters?
*/

// TC: O (N) -> Traverse through 'N' characters in string or character array in my approach
// SC: O (1) -> No extra space used

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        
        // #1. Base condition
        if(s.equals("")){
            return true;
        }
        
        // #2. Convert the given string to character array
        char[] charArray = s.toCharArray();
        
        // #3. Start two pointers, each at two extreme ends in a string and check for valid palindrome, ignoring the cases and special characters as well as spaces 
        for(int i = 0, j = charArray.length - 1; i < j; i++, j--){
            
            // #3.1. Ignoring characters other than alphanumeric characters for 'i' and 'j' pointers
            while(i < j && !Character.isLetterOrDigit(charArray[i])){
                i++;
            }
            
            while(i < j && !Character.isLetterOrDigit(charArray[j])){
                j--;
            }
            
            // #3.2. Ignoring the cases of characters at both pointers
            if(Character.toLowerCase(charArray[i]) != Character.toLowerCase(charArray[j])){
                return false; // not a valid palindrome
            }
               
        }
        
        return true;
        
    }
    
}
