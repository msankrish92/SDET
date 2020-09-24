package ds.arrays;

import org.junit.Test;

public class Question12 {
	
	/*
	 * Given an array of integers, return the highest sum of consecutive element in
	 * the array
	 * 
	 * Input: [1,-5,2,-3,7,1] Output: 8
	 */

	@Test
	public void example() {
		int arr[] = {1,-5,2,-3,7,1};
		kandaneAlgorithm(arr);
		
	}
	
	//Method 1(Time complexity O[n]
	private void kandaneAlgorithm(int arr[]) {
		int max_sum = 0;
		int window_sum = arr[0];
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {//O[n]
			sum = arr[i] + window_sum;
//			if sum is lesser than 0 or equal to 0, make window sum 0
			if(sum<=0) {
				window_sum = 0;
			}else if(sum>0) { //if sum is greater than 0 make window sum equal to sum
				window_sum=sum;
			}
			max_sum = Math.max(window_sum, max_sum);
		}
		System.out.println(max_sum);
	}
	
}
