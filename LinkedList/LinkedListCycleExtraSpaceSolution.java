package com.frequent.questions.LinkedList;

import java.util.HashSet;

// Definition for singly-linked list.
class ListNode1 {
	int val;
	ListNode1 next;
	ListNode1(int x) {
		val = x;
		next = null;
	}
}

public class LinkedListCycleExtraSpaceSolution {
	// Solution with extra space, HashSet
    // TC: O (N)
    // SC: O (N)
    public boolean hasCycle(ListNode1 head) {
        
        // Base condition
        if(head == null){ // LL is empty
            return false; // No cycle
        }
        
        // curr pointer to traverse the LL
        ListNode1 curr = head;
        
        // Create a HashSet to store the nodes in a LL and identify if cycle exists
        HashSet<ListNode1> set = new HashSet<>();
        
        // Traverse through the LL
        while(curr != null){
            if(!set.contains(curr)){ // If node not already present in a set, add it
                set.add(curr);
            }    
            else{
                return true; // If node already present in a set, cycle exists, return true
            }
            
            curr = curr.next; // update the curr pointer to next node in a LL
        }
        
        return false; // cycle does not exist
        
    }
    
}
