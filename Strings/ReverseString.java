package com.frequent.questions.Strings;

public class ReverseString {
	// TC: O (N)
    // SC: O (1)
    public void reverseString(char[] s) {
        
        // Base condition 
        if(s == null || s.length == 0){
            return;
        }
        
        // Two pointers approach to reverse array of characters
        int i = 0;
        int j = s.length - 1;
        
        while(i < j){
            swap(s, i, j);
            i++;
            j--;
        }
        
    }
    
    public void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    
}
