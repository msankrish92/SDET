package leetCode;

import org.junit.Test;

public class LeetCode896 {

//	https://leetcode.com/problems/monotonic-array/
	
	@Test
	public void example1() {
		int A[] = {1,2,2,3};
		System.out.println(isMonotonic(A));
	}
	
	@Test
	public void example2() {
		int A[] = {6,5,4,4};
		System.out.println(isMonotonic(A));
	}
	
    public boolean isMonotonic(int[] A) {
        boolean incFlag = true;
        boolean decFlag = true;
        
        for(int i = 0; i<A.length-1; i++){
            if(A[i]>A[i+1]){
                incFlag = false;
            }
            if(A[i]<A[i+1]){
                decFlag = false;
            }
        }
        
        return incFlag||decFlag;
        
    }
	
}
