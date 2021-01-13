package com.frequent.questions.SortingAndSearching;

//Two Pointers starting from beginning

/*
*   To improve the O (n+m).log(n+m) time complexity from previous approach, we will use two pointers technique starting from beginning of both sorted arrays

Typically, one could achieve O(n+m) time complexity in a sorted array(s) with the help of two pointers approach.

The straightforward implementation would be to set get pointer p1 in the beginning of nums1, p2 in the beginning of nums2, and push the smallest value in the output array at each step.

Since nums1 is an array used for output, one has to keep first m elements of nums1 somewhere aside, that means O(m) space complexity for this approach.
*/

/*
*   TC: O (n+m) -> Traverse the m elements in nums1_copy and n elements in nums2 to compare and push the smallest one in nums1/output array
*   SC: O (m) -> nums1_copy array to store 'm' elements of nums1 aside for comparision with nums2 array
*/


public class MergeSortedArray2PointersBeginning {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	        
	        // #1. Since nums1 is used as an output array in this problem, we need to store 'm' elements in nums1 in other array for comparision, create the array
	        int[] nums1_copy = new int[m];
	        
	        // #2. Copy the 'm' elements from nums1 to nums1_copy
	        System.arraycopy(nums1, 0, nums1_copy, 0, m);
	        
	        // #3. Initialize the pointers in nums1_copy, nums2 and nums1
	        int p1 = 0; // nums1_copy
	        int p2 = 0; // nums2
	        int p = 0; // nums1/output array
	        
	        // #4. Compare the elements in nums1_copy and nums2 and push the smallest element in nums1/output array
	        while(p1 < m && p2 < n){
	            if(nums1_copy[p1] < nums2[p2]){
	                nums1[p] = nums1_copy[p1];
	                p1++;
	                p++;
	            }
	            else{
	                nums1[p] = nums2[p2];
	                p2++;
	                p++;
	            }
	            
	        }
	        
	        // #5. If there are still elements in either nums1_copy or nums2 to add in nums1/output array
	        if(p1 < m){
	            System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - (p1 + p2));
	        }
	        
	        if(p2 < n){
	             System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - (p1 + p2));
	        }
	        
	    }
	 
}
