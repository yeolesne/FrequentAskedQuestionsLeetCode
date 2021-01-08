package com.frequent.questions.LinkedList;

// Definition for singly-linked list.
class ListNode4 {
	int val;
	ListNode4 next;
	ListNode4() {}
	ListNode4(int val) { this.val = val; }
	ListNode4(int val, ListNode4 next) { this.val = val; this.next = next; }
}

//TC: O (N) + O (size - n) = O (N)
//SC: O (1)

//Two pass solution
public class RemoveNthnodefromEndLLTwoPass {
	public ListNode4 removeNthFromEnd(ListNode4 head, int n) {
        
        // Base condition 
        if(head == null){
            return null;
        }
        
        // Create a dummy node and connect dummy and head node
        ListNode4 dummy = new ListNode4(-1);
        dummy.next = head;
        
        // *First pass to get the size of a LL, O (N)
        ListNode4 curr = head;
        int size = 0;
        
        while(curr != null){
            size += 1;
            curr = curr.next;
        }
        
        // *Second pass to go till node before the Nth node from end of a LL and delete the Nth node, O (size - n)
        
        // Compute how many nodes to traverse before Nth node
        int nodesToTraverse = size - n;
        
        // Reset current pointer to dummy node
        curr = dummy;
        
        // Stop on node before Nth node from end of a LL
        while(nodesToTraverse > 0){
            curr = curr.next;
            nodesToTraverse--;
        }
        
        // Delete the Nth node from end of a LL
        curr.next = curr.next.next;
        
        return dummy.next;   
    }

}
