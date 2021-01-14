package com.frequent.questions.SortingAndSearching;

//Three Pointers starting from end

/*
*   To improve the O (m) space complexity from previous approach, we will use three pointers technique starting from end of both sorted arrays

Typically, one could achieve O(1) space complexity in a sorted array(s) with the help of three pointers approach.

The straightforward implementation would be to set get pointer p1 in the end of nums1(m - 1), p2 in the end of nums2(n - 1), p at the end of nums1((m + n) - 1) and push the greater value in the nums1 array at p pointer at each step.

This approach ensures that we don't overwrite any elements in nums1 because we are starting from end in nums1 where there are just 0's, it eliminates the need of extra space O (m)
*/

/*
*   TC: O (n+m) -> Traverse the m elements in nums1 and n elements in nums2 to compare and push the greater one in nums1/output array at 'p' pointer
*   SC: O (1) -> No extra space is used
*/

public class MergeSortedArray3PointersEnd {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // #1. Base condition
        // If nums1 is null - no capacity to hold additional elements from nums2, do nothing
        // If nums2 is null or n is 0 - No elements to merge in nums1, do nothing
        if(nums1 == null || nums2 == null || n == 0){
            return; // Do nothing
        }
        
        // #2. Initialize the pointers in nums1 and nums2 from end
        // Three pointers approach, p - keeps track of position where element from nums1 or nums2 is inserted in nums1 in sorted order, p1 - last element of nums1k, p2 - last element of nums2
        int p = (m+n) - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        
         // #3. Iterate through the elements in nums1 and nums2 until p1 and p2 goes out of bounds(p1 < 0, p2 < 0)
        // Check which is greater, place the greater element at the "p" pointer, decrement greater element's pointer and "p" pointer
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            }
            else{
                nums1[p] = nums2[p2];
                p2--;
            }
            p--; // decrement 'p' pointer in both if and else cases
             
        }
        
        // #4. place the elements from nums2(p2 pointer) in nums1(p pointer) until p2 becomes less than 0
        /*
        * Example edge case for which this code snippet will be used: 
        * e.g: nums1 = [0], m = 0
        *      nums2 = [1], n = 1
        *      p = (0+1)-1 = 1-1 = 0
        *      p1 = m - 1 = -1
        *      p2 = n - 1 = 1 - 1 = 0
        * Here, we don't have any elements in nums1 to compare with elements in nums2, so just place the nums2 elements in nums1 p pointer until p2 becomes negative or goes out of bounds
        */
        while(p2 >= 0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
        
        
    }

}
