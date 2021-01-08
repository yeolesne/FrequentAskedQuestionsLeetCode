package com.frequent.questions.LinkedList;

// Definition for singly-linked list.
class ListNode5 {
	int val;
	ListNode5 next;
	ListNode5() {}
	ListNode5(int val) { this.val = val; }
	ListNode5(int val, ListNode5 next) { this.val = val; this.next = next; }
}

//TC: O (N)
//SC: O (1)

//One pass solution
public class RemoveNthNodeFromEndLLOnePass {
	public ListNode5 removeNthFromEnd(ListNode5 head, int n) {
        /* Steps:
        *   #1. Base condition
        *   #2. Create a Dummy node
        *   #3. Connect Dummy and Head node
        *   #4. Create two pointers slow and fast starting at Dummy node
        *   #5. Move the fast pointer by n (always valid in this question), if 'n' can be invalid, we need to check if (fast != null), fast pointer might run into null pointer exception
        *   #6. Move both fast and slow pointers by 1 until fast is the last node in a LL
        *   #7. update the next pointer of slow - delete the Nth node from end of a LL
        *   #8. return the head node of a LL
        */
        
    
        // #1. Base condition 
        if(head == null){
            return null;
        }
        
        // #2 and #3. Create a dummy node and connect dummy and head node
        ListNode5 dummy = new ListNode5(-1);
        dummy.next = head;
        
        // #4. Create two pointers slow and fast starting at Dummy node
        ListNode5 slow = dummy;
        ListNode5 fast = dummy;
        
        // #5. Move the fast pointer by n (always valid in this question), if 'n' can be invalid, we need to check if (fast != null), fast pointer might run into null pointer exception
        while(n > 0){
            fast = fast.next;
            n -= 1;
        }
        
        // #6. Move both fast and slow pointers by 1 until fast is the last node in a LL
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        // #7. update the next pointer of slow - delete the Nth node from end of a LL
        slow.next = slow.next.next;
        
        // #8. return the head node of a LL
        return dummy.next;
        
    }
	
}
