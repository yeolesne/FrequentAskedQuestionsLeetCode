package com.frequent.questions.LinkedList;

// Definition for singly-linked list.
class ListNode8 {
	int val;
	ListNode8 next;
	ListNode8() {}
	ListNode8(int val) { this.val = val; }
	ListNode8(int val, ListNode8 next) { this.val = val; this.next = next; }
}

//TC: O (m + n) -> To traverse the 'm' nodes in ll1 and 'n' nodes in ll2
//SC: O (1) -> No extra space used

public class MergeSortedLists {
	public ListNode8 mergeTwoLists(ListNode8 l1, ListNode8 l2) {
        
        // Create a dummy node
        ListNode8 dummy = new ListNode8(-1);
        // Create a previous pointer initially pointing to dummy pointer
        ListNode8 prev = dummy;
        
        // Create a sorted merged list until both l1 and l2 lists are not null, if any one of the lists becomes null, exit while loop
        while(l1 != null && l2 != null){
            
            // Since we want sorted merged list, we check values of nodes l1 and l2
            // If l1 node value is less or equal to l2 node value, make it next node of previous pointer and increment l1 pointer
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }
            // Else, if node l2 value is less than node l1 value, make it next node of previous pointer and increment l2 pointer
            else{
                prev.next = l2;
                l2 = l2.next;
            }
            
            // In both cases, move the previous pointer
            prev = prev.next;
            
        }
        
        // After exiting while loop, one of the lists l1 and l2 will be non null
        // So, merge it at the end of merged sorted list we got from while loop
        // If l1 is null, merge l2 at the end of sorted merged list else vice versa
        prev.next = l1 == null ? l2 : l1;
        
        // The pointers prev, l1 and l2 moved to traverse through the two lists l1 and l2
        // Dummmy pointer did not, so to return the head of merged sorted list, return dummy.next
        return dummy.next;
        
    }
    
}
