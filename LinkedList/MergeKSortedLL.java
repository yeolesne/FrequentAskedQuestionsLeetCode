package com.frequent.questions.LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

// Definition for singly-linked list.
class ListNode9 {
	int val;
	ListNode9 next;
	ListNode9() {}
	ListNode9(int val) { this.val = val; }
	ListNode9(int val, ListNode9 next) { this.val = val; this.next = next; }
}

//TC: O (n. logk) + O (n. logk) = O 2(n.log k) = O (n.log k) -> n.log k - for insertion of 'n' nodes not all at once where 'logk' is to heapify 'k' nodes during insertion. n.log k - for removing 'n' nodes not all at once where 'logk' is to hapify 'k' nodes during removal.
//SC: O (k) -> To store 'k' head nodes of 'k' Linked Lists

public class MergeKSortedLL {
	 public ListNode9 mergeKLists(ListNode9[] lists) {
	        
	        // #1. Create a Min Heap using Priority Queue in Java which will store references to the nodes in LL's
	        // Priorty Queue will use the custom comparator while adding top.next to min heap
	        PriorityQueue<ListNode9> minHeap = new PriorityQueue<>(new pqComparator());
	        
	        // #2. Add the head of all 'k' Linked Lists to min heap
	        for(ListNode9 list : lists){ // Traverse through all 'k' LL's in a given 'lists' array
	            if(list != null){ // If LL is not empty
	                minHeap.add(list); // Add the head of that LL to min heap
	            }
	        }
	        
	        // #3. For getting merged sorted list, we will create dummy node, create prev pointer and start from dummy node, remove top from heap and add to merged list as prev.next = top, and move the prev pointer. Keep doing this until the min heap is empty
	        ListNode9 dummy = new ListNode9(-1);
	        ListNode9 prev = dummy;
	        
	        // #4. Until min heap is not empty, remove the top node from heap, add it to merged sorted list(output) and if top.next is not null, then add it to heap
	        while(!minHeap.isEmpty()){
	            ListNode9 top = minHeap.remove();
	            
	            if(top.next != null){
	                minHeap.add(top.next);    
	            }
	            
	            // Add the top to merged sorted list(output) and move the prev pointer ahead
	            prev.next = top;
	            prev = prev.next;
	        }
	        
	        return dummy.next; // Return the head of merged sorted list as dummy.next since, prev pointer has been used/moved to create the merged sorted list
	    }
	    
	}

class pqComparator implements Comparator<ListNode9>{
	    public int compare(ListNode9 s1, ListNode9 s2){
	        if(s1.val < s2.val){
	            return -1;
	        }
	        if(s1.val > s2.val){
	            return 1;
	        }
	        return 0; // if equal, return 0
	    }
	    
}
