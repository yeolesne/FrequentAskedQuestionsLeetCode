package com.frequent.questions.LinkedList;


//Definition for singly-linked list.
class ListNode11 {
	int val;
	ListNode11 next;
	ListNode11() {}
	ListNode11(int val) { this.val = val; }
	ListNode11(int val, ListNode11 next) { this.val = val; this.next = next; }
}

//TC: O (n) -> To traverse 'n' nodes of LL1 and LL2 - both LL's will be made of same length before comparing the nodes and finding intersection point
//SC: O (1) -> No extra space used

public class IntersectionPointOptimal {
	public ListNode11 getIntersectionNode(ListNode11 headA, ListNode11 headB) {
        
        // #1. Base condition
        // If any of the LL's is empty, then there will be no intersection point, return null
        if(headA == null || headB == null){
            return null;
        }
        
        // #2. Compute the length of both Linked Lists
        
        // p1 pointer will start at head of LL1 and p2 at head of LL2
        ListNode11 p1 = headA;
        ListNode11 p2 = headB;
        
        // Initialize length of LL1 and LL2 to 0
        int lengthA = 0;
        int lengthB = 0;
        
        while(p1 != null){
           lengthA += 1;
           p1 = p1.next;
        }
        
        while(p2 != null){
            lengthB += 1;
            p2 = p2.next;
        }
        
        // #3. Reset p1 and p2 pointers
        p1 = headA;
        p2 = headB;
        
        // #4. Make the lengths of both LL's equal
        while(lengthA != lengthB){
            if(lengthA > lengthB){
                lengthA--;
                p1= p1.next;
            }
            else{
                lengthB--;
                p2 = p2.next;
            }
            
        }
        
        // #5. After the lengths are equal, check if both the pointers p1 and p2 are pointing to same node reference, not same value
        
        // If any of the LL becomes null, means there is no intersection point
        while(p1 != null && p2 != null){
            if(p1 == p2){
                return p1; // intersection point found
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return null; // No intersection point exists
        
    }

}
