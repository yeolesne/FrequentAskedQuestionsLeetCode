package com.frequent.questions.LinkedList;


//Definition for singly-linked list.
class ListNode12 {
	int val;
	ListNode12 next;
	ListNode12() {}
	ListNode12(int val) { this.val = val; }
	ListNode12(int val, ListNode12 next) { this.val = val; this.next = next; }
}

//TC: O (max(m, n)) -> 'm' - number of nodes in LL1, 'n' - number of nodes in LL2. The time required will be to traverse the LL with max number of nodes for addition 
//SC: O (max(m, n)) -> We are returning the sum of two LL's as a result LL, so space required will be equal to maximum number of nodes from LL1 or LL2(LL with maximum length) + 1 (1 node in case if carry is 1 at the end, in this case new node with carry is appended at the end of result LL)

public class AddTwoNumbersLL {
	public ListNode12 addTwoNumbers(ListNode12 l1, ListNode12 l2) {
        
        // #1. Initialize the variables required for sum of two Linked Lists
        int sum = 0;
        int carry = 0;
        int x = 0; // will store value of node from LL1
        int y = 0; // will store value of node from LL2
        
        // #2. Initialize two pointers starting from head of LL1 and LL2
        ListNode12 p1 = l1;
        ListNode12 p2 = l2;
        
        // #3. To return the sum of two LL's as a result LL, we will create a dummy node in result LL and start curr pointer from that dummy node
        ListNode12 dummy = new ListNode12(-1);
        ListNode12 curr = dummy;
        
        // #4. Traverse the two linked lists to add the node values and return the sum as a LL
        
        // #4.1. Traverse until both the LL's becomes null, if any of the LL becomes null, then the node value for that LL will be 0
        while(p1 != null || p2 != null){
            // If p1 becomes null, then the node value - x for p1 LL will be 0
            x = (p1 != null) ? p1.val : 0;
            // If p2 becomes null, then the node value - y for p2 LL will be 0
            y = (p2 != null) ? p2.val : 0;
            // Compute the addition/sum for x, y nodes including carry value
            sum = x + y + carry;
            // Update carry for next addition operation
            carry = sum / 10;
            // Create a new node with the sum value and make it as next node of curr pointer
            /*
            *   If (sum / 10) == 0, then curr.next = new ListNode(sum); -> sum = sum % 10
            *   If (sum / 10) == 1, then curr.next = new ListNode(sum % 10)
            */
            curr.next = new ListNode12(sum % 10);
            // Update the curr pointer
            curr = curr.next;
            
            // Move p1 and p2 pointers if not null to traverse next nodes of LL1 and LL2
            if(p1 != null)
                p1 = p1.next;
            if(p2 != null)
                p2 = p2.next;
            
        }
        
        // #5. If after exiting while loop/adding all nodes from LL1 and LL2, carry = 1, then append that carry as a new node to the result LL
        // IF carry = 0, by default curr.next = null, no need to append anything to the result LL
        if(carry > 0){
            curr.next = new ListNode12(carry);
        }
        
        // #6. Return the head of result Linked List (sum of LL1 and LL2)
        return dummy.next;
        
    }
    
}
