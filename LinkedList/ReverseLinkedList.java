package com.frequent.questions.LinkedList;



// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


// TC: O (N)
// SC: O (1)

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        
        // Base condition
        if(head == null){ // if LL is empty
            return null;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        
        ListNode nextNode = null;
        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        return prev;
        
    }

}
