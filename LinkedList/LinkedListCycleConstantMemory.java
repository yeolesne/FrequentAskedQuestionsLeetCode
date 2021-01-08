package com.frequent.questions.LinkedList;

// Definition for singly-linked list.
class ListNode2 {
	int val;
	ListNode2 next;
	ListNode2(int x) {
		val = x;
		next = null;
	}
}

public class LinkedListCycleConstantMemory {
	// Follow up question, using constant O (1) memory
    // TC: O (N)
    // SC: O (1)
    public boolean hasCycle(ListNode2 head) {
        
        // Base condition
        if(head == null){ // LL is empty
            return false; // No cycle
        }
        
        // slow and fast pointer starts from head of a LL, Floyd's algorithm
        ListNode2 slow = head;
        ListNode2 fast = head;
     
        // Traverse through the LL
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            // If cycle exists, slow and fast will meet at some point, intersection point
            if(slow == fast){
                // start another pointer dummy from head node
                ListNode2 dummy = head;
                
                // Move both dummy from head node and slow from intersection point by one pointer until they meet (point where cycle began)
                while(dummy != slow){
                    slow = slow.next;
                    dummy = dummy.next;   
                }
                
                if(dummy == slow){
                    return true;
                }
                
            }
            
        } // WHILE loop
        
        return false; // cycle does not exist
        
    }
    
}
