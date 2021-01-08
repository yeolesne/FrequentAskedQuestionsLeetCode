package com.frequent.questions.LinkedList;

// Definition for singly-linked list.
class ListNode3 {
	int val;
	ListNode3 next;
	ListNode3(int x) { val = x; }
}

public class DeleteNodeWithoutHeadPointerReference {
	public void deleteNode(ListNode3 node) {
        // No need to check Base condition as nde to be deleted is always in the LL
        
        // Delete the node w/o reference to head pointer, use the next pointer to get next node
        ListNode3 nextNode = node.next;
        
        // Copy the value of next node in a node to be deleted
        node.val = nextNode.val;
        
        // Delete the given node
        // Set the next pointer of node to be deleted to nextNode's next pointer
        node.next = nextNode.next;
        
        // Set nextNode to null
        nextNode = null;
        
    }
    
}
