// Extra space solution

package com.frequent.questions.LinkedList;

import java.util.HashSet;

//Definition for singly-linked list.
class ListNode10 {
	int val;
	ListNode10 next;
	ListNode10() {}
	ListNode10(int val) { this.val = val; }
	ListNode10(int val, ListNode10 next) { this.val = val; this.next = next; }
}

//TC: O (m + n) -> To traverse 'm' nodes of LL1 and 'n' nodes of LL2
//SC: O (n) -> To store total 'n' nodes of both LL's

public class IntersectionPointHashSet {
	public ListNode10 getIntersectionNode(ListNode10 headA, ListNode10 headB) {
        
        // #1. Base condition
        // If any of the LL's is empty, then there will be no intersection point, return null
        if(headA == null || headB == null){
            return null;
        }
        
        // #2. Create a HashSet to store the references to nodes in LL1 and LL2\
        HashSet<ListNode10> set = new HashSet<>();
        
        // #3. First traverse through the nodes of LL1 and put references to those nodes in a set until LL1 becomes null
        
        // p1 pointer will start at head of LL1
        ListNode10 p1 = headA;
        
        while(p1 != null){
           set.add(p1);
           p1 = p1.next;
        }
        
        // #4. Now, traverse through the nodes of LL2 and check if the reference to that node already exists in a set
        
        // p2 pointer will start at head of LL2
        ListNode10 p2 = headB;
        
        while(p2 != null){
            if(set.contains(p2)){
                return p2; // node p2 is the intersection point of two linked lists
            }
            else{
                set.add(p2);
            }
            p2 = p2.next;
        }
        
        return null; // No intersection point exists
        
    }
    
}
