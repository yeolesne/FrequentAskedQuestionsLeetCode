package com.frequent.questions.LinkedList;

import java.util.ArrayList;
import java.util.List;

// Definition for singly-linked list.
class ListNode6 {
	int val;
	ListNode6 next;
	ListNode6() {}
	ListNode6(int val) { this.val = val; }
	ListNode6(int val, ListNode6 next) { this.val = val; this.next = next; }
}

//TC: O (N) + O (N) = O (2N) = O (N)
//O (N) -> copy 'N' nodes values to a list, O (N) -> To traverse 'N' elements of a list to check if LL is a palindrome
//SC: O (N) -> 'N' nodes values from LL are copied to an ArrayList


public class PalindromeLLExtraSpace {
	 public boolean isPalindrome(ListNode6 head) {
	        
	        // #1. Base condition 
	        if(head == null){ // LL is empty
	            return true;
	        }
	        
	        // #2. Create an ArrayList
	        List<Integer> list = new ArrayList<>();
	        
	        
	        // #3. Traverse through nodes of a LL and copy the node values in a list
	        ListNode6 curr = head;
	        
	        while(curr != null){
	            list.add(curr.val);
	            curr = curr.next;
	        }
	        
	        // #4. Two pointers technique to check if LL is a palindrome
	        int start = 0;
	        int end = list.size() - 1;
	        
	        while(start < end){
	            // Note: list.get(start) != list.get(end) does not work for testcase: [-129, -129], .equals works for all test cases
	            if(!list.get(start).equals(list.get(end))){
	                return false;
	            }
	            start++;
	            end--;
	        }
	        
	        return true;
	        
	    }
	 
}
