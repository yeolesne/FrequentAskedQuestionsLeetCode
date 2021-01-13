package com.frequent.questions.SortingAndSearching;

import java.util.Arrays;

//Merge and Sort approach  

/*
*   The naive approach would be to merge both lists into one and then to sort. It's a one line solution (2 lines in Java) 
*   with a pretty bad time complexity \mathcal{O}((n + m)\log(n + m))O((n+m)log(n+m)) because here one doesn't profit 
*   from the fact that both arrays are already sorted.
*/

/*
*   TC: O (n+m).log(n+m) -> O (n+m) - To merge both sorted arrays, O (log(n+m)) - To sort nums1 after merging (n+m) elements
*   SC: O (1)
*/

public class MergeSortedArrayMergeSortApproach {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // #1. Merge nums1 and nums2
        System.arraycopy(nums2, 0, nums1, m, n);
        
        // #2. Sort nums1 array
        Arrays.sort(nums1);
        
    }
	
}
