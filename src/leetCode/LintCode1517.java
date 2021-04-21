package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class LintCode1517 {

	
	/*
	 * Pseudo
	 * Declare a Max Index variable
	 * Loop throght the array for array length - k time
	 * Have a inner loop for k time
	 * 	if value in maxIndex is lesser than value in current index i+j
	 * 		maxIndex = i
	 * 		break
	 * 	else if value in maxIndex is greater than current index i+j
	 * 		break
	 * 
	 * Copy it to a array and return it
	 */
	
	/*
	 * 1) If you find the max, that will be your next Starting point or Max
	 * 2) Only when the values in max index and current index are equal I need to check for consecutive elements 
	 */
	
	
	@Test
	public void example1() {
		int arr[] = {1,4,3,2,5};
		int k = 4;
		System.out.println(Arrays.toString(method1(arr, k)));
	}
	
	@Test
	public void example2() {
		int arr[] = {994,237,415,264,942,113,994,28,531,188,62,173};
		int k = 4;
		System.out.println(Arrays.toString(method1(arr, k)));
	}
	
	private int[] method1(int A[], int K) {
		 int maxIndex = 0;
	        for (int i = 1;i<=A.length-K ;i++){
	            if(A[i]>A[maxIndex]){
	                maxIndex = i;
	            }else if(A[i] == A[maxIndex]){
	                int tempIndex = i+1;
	                int tempMaxIndex = maxIndex+1;
	                while((i+K-1)<A.length && maxIndex<i){
	                    if(A[tempMaxIndex]<A[tempIndex]){
	                        maxIndex = i;
	                        break;
	                    }else if(A[tempMaxIndex]>A[tempIndex]) {
	                    	break;
	                    }
	                    tempIndex++;
	                    tempMaxIndex++;
	                }
	            }
	        } 
	       return Arrays.copyOfRange(A,maxIndex,maxIndex+K);
	}
	
	public int[] method2(int[] A, int K) {
        int[] res = new int[K];
        int start = 0;
        for (int i = 0; i <= A.length - K; i++) {
            for(int j = 0; j < K; j++) {
                if(A[i + j] > A[start + j]) {
                    start = i;
                    break;
                }
                else if (A[i + j] < A[start + j]){
                    break;
                }
            }
        }
        for(int i = 0; i < K; i++) {
            res[i] = A[start + i];
        }
        return res;
    }
}
