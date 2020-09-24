package ds.arrays;

import org.junit.Test;

public class Question5 {
	
	/*
	 * Given an array of integers and a number k. Return the highest sum of any k
	 * consecutive elements in the array. 
	 * [2,4,1,3,5,6,0,1,3,1] k=3 maxSum
	 * => 3+5+6 => 14
	 */

	@Test
	public void example1() {
		int arr[] = { 2, 4, 1, 3, 5, 6, 0, 1, 3, 1 };
		highestConsecutiveSum3(arr, 2);
		System.out.println("---");
	}

//	@Test
//	public void example2() {
//		int arr[] = { -2, -4, -1, -5, -8 };
//		highestConsecutiveSum2(arr,3);
//		System.out.println("---");
//	}
//
//	@Test
//	public void example3() {
//		int arr[] = { 2, 4, -1, 5, 1 };
//		highestConsecutiveSum2(arr,3);
//		System.out.println("---");
//	}


	private void highestConsecutiveSum2(int[] arr, int consecutiveCount) {
		int hightest = Integer.MIN_VALUE;
		int temp = 0;

		for (int i = 0; i < arr.length - consecutiveCount; i++) {
			for (int j = i; j < i + consecutiveCount; j++) {
				temp = arr[j] + temp;

			}
			if (hightest < temp) {
				hightest = temp;

			}
			temp = 0;
		}

		System.out.println(hightest);
	}
	
	private void highestConsecutiveSum3(int[] arr, int consecutiveCount) {
//		int arr[] = { 2, 4, 1, 3, 5, 6, 0, 1, 3, 1 };

		int max_sum = 0;
		int window_sum = 0;
		
		for (int i = 0; i < consecutiveCount ; i++) {
			max_sum += arr[i];
		}
		
		window_sum = max_sum;	
		
		
		for(int i = consecutiveCount; i<arr.length; i++) {
			window_sum += arr[i] - arr[i-consecutiveCount];
			max_sum = Math.max(window_sum, max_sum);
		}
		
		System.out.println(max_sum);
	}

}
