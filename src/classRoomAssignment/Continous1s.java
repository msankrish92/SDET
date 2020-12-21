package classRoomAssignment;

import org.junit.Test;

public class Continous1s {
	
//	P4) Given an array A of 0s and 1s, you are allowed to change K values from 0 to 1.
//	Return the length of the longest (contiguous) subarray that contains only 1s. 
//	Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
//	Output: 6
//	Input: A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
//	Output: 10
	
//	Psuedo
//	Declare variable i,j,replacedCount,maxLength
// 	In while loop until i less than input length
//	if value at j is lesser than input.length and j not equal 1 -> increment replacedCount
//	if value of replacedCount equal to k -> max of maxLength and j-i+1 and i++, j=i+1, reset replacedCount 
//	return maxLength
	
	@Test
	public void example1() {
		int[] A = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		System.out.println(continous1(A,k));
 	}
	
	@Test
	public void example2() {
		int[] A = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k = 3;
		System.out.println(continous1(A,k));
 	}
	
	@Test
	public void example3() {
		int[] A = {1,1,1,1,0};
		int k = 2;
		System.out.println(continous1(A,k));
 	}

	private int continous1(int arr[], int k) {
		int i = 0;
		int j = 0;
		int replacedCount = 0;
		int maxLength = 0;
		while(i<arr.length && j<arr.length) {
			if(arr[j] != 1) {
				replacedCount++;
			}
			if(replacedCount>k) {
				maxLength = Math.max(maxLength, j-i);
				if(arr[i] == 0) {
					replacedCount--;
				}
				i++;
				if(arr[i] == 0) {
					replacedCount--;
				}
			}
			j++;
		}
		return Math.max(maxLength, maxLength-1);
	}
}
