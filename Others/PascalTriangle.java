package com.frequent.questions.Others;

import java.util.ArrayList;
import java.util.List;

//TC: O (numRows * j), j - number of columns
// SC: O (numColumns or number of elements in a row)
public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
        
        // #1. Create list of lists 
        List<List<Integer>> result = new ArrayList<>();
        
        // #2. Base condition
        if(numRows == 0){
            return result;
        }
        
        // #3. Iterate for loop to generate 'n' number of rows in pascal's triangle
        for(int i = 0; i < numRows; i++){
            
            // #3.1. Create a list to store elements in current row
            List<Integer> list = new ArrayList<>();
            
            // #3.2. fill all the columns of current row
            for(int j = 0; j <= i; j++){
                
                // #3.2.1. first and last column of each row will be 1, other columns number will be sum of two numbers directly above it
                if(j == 0 || j == i){
                    list.add(1);
                }
                else{
                    list.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }   
            }
            
            // #3.3. Add the list of current row to final result (list of lists)
            result.add(list);
            
        }
        
        return result;
         
    }
}
