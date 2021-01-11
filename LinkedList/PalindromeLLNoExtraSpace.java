package com.frequent.questions.LinkedList;

//Definition for singly-linked list.
class ListNode7 {
	int val;
	ListNode7 next;
	ListNode7() {}
	ListNode7(int val) { this.val = val; }
	ListNode7(int val, ListNode7 next) { this.val = val; this.next = next; }
}

//TC: O (N) + O (N) + O (N) = O (3N) = O (N)
//O (N) -> To find end of first half of a LL (slow pointer), O (N) -> To reverse second half of a LL (slow.next till end), O (N) -> Compare first and second halves of a LL for palindrome check
//SC: O (1) -> Modifying LL in-place, no extra space used

public class PalindromeLLNoExtraSpace {
	public boolean isPalindrome(ListNode7 head) {
        
        // #1. Base condition 
        if(head == null){ // LL is empty
            return true;
        }
        
        // Divide the LL in two halves
        // #2. Find end of first half of a LL (middle of a LL) -> slow pointer
        ListNode7 slow = head;
        ListNode7 fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // #3. Reverse the second half of a LL (slow.next to end)
        ListNode7 h2 = reverse(slow.next);
        
        // #4. Compare the first and second half of a LL to check if it is a palindrome and save the result, don't return yet
        ListNode7 h1 = head; // first half
        ListNode7 p2 = h2; // second half
        
        // #4.1. Create a result variable and initialize it to true
        boolean result = true;
        
        // We are checking null value only for p2 pointer as it will reach to null first -> second half of a LL will be less than first half always
        while(result == true && p2 != null){
            if(h1.val != p2.val){
                result = false; // change the result value and save it
            }
            h1 = h1.next;
            p2 = p2.next;
        }
        
        // #5. Restore the LL
        
        // #5.1. Reverse back the reversed second half of a LL and connect with first half -> good programming practice to restore what's changed
        slow.next = reverse(h2);
        
        // #6. Return the result
        return result;  
        
    }
    
    // Reverse function
    public ListNode7 reverse(ListNode7 curr){
        ListNode7 prev = null;
        ListNode7 nextNode = null;
        
        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        return prev;
        
    }
    
}
