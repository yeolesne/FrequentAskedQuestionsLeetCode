package com.frequent.questions.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}


//TC: O (No of nodes in BT)
//SC: O (No of nodes at current level)

public class BTLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
        
        // #1. Create a list of lists
        List<List<Integer>> result = new ArrayList<>();
        
        // #2. Base condition
        if(root == null){ // BT is empty
            return result; // return empty list
        }
        
        // #3. Create a Queue using Linked List
        Queue<TreeNode> q = new LinkedList<>();
        
        // #4. Initiate the queue with root node
        q.add(root);
        
        // #5. Start Level Order Traversal
        while(!q.isEmpty()){
            
            // #5.1. Get the size of queue, how many nodes at current level
            int size = q.size();
            
            // #5.2. Create a list to store all the nodes at current level
            List<Integer> list = new ArrayList<>();
            
            // #5.3. Iterate for loop and process all nodes at current level stored in a queue
            for(int i = 0; i < size; i++){
                TreeNode front = q.poll();
                
                list.add(front.val);
                
                // #5.3.1. Process the children of a node and add them to queue 
                if(front.left != null){
                    q.add(front.left);
                }
                
                if(front.right != null){
                    q.add(front.right);
                }
                
            } // FOR loop
            
            // 5.4. Add the list from current level to main result
            result.add(list);
            
        } // WHILE loop
        
        return result;
    }
    
}
