package com.frequent.questions.Arrays;

//TC: O (N) -> Traverse through 'N' elements in array and XOR them together

//SC: O (1) -> No extra space used

//Bit Manipulation Approach
/*
*   Concept

If we take XOR of zero and some bit, it will return that bit
a \oplus 0 = aa⊕0=a
If we take XOR of two same bits, it will return 0
a \oplus a = 0a⊕a=0
a \oplus b \oplus a = (a \oplus a) \oplus b = 0 \oplus b = ba⊕b⊕a=(a⊕a)⊕b=0⊕b=b
So we can XOR all bits together to find the unique number.

*/


public class SingleNumberBitManipulation {
	public int singleNumber(int[] nums) {
        int a = 0;
        
        for(int num : nums){
            a = a ^ num;
        }
        
        return a;
        
    }
    
}
