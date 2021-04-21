package classRoomAssignment;

import org.junit.Test;

public class LargestSum {

	/*
	 * pseudo Method 1 -> Brute Force two for loops Method 2 -> Sliding window
	 * Declare a max variable, sum, i 
	 * while loop j < arr.length
	 * if (sum + arr[j] < arr[j]) {
	 *	sum = arr[j];
	 *	max = Math.max(max, arr[j]);
	 *	j++;
	 *else 
	 *	sum = arr[j] + sum;
	 *	max = Math.max(max, sum);
	 *	j++;	
	 *
	 *outside the loop 
	 *return max
	 */

	@Test
	public void example1() {
		int input[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(method2(input));

	}

	@Test
	public void example2() {
		int input[] = { 1, -1, 2, 3, 4 };
		System.out.println(method2(input));

	}

	@Test
	public void example3() {
		int input[] = { 1, -1, 2, -3, 10 };
		System.out.println(method2(input));

	}

	private int method1(int arr[]) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				max = Math.max(sum, max);
			}
		}
		return max;
	}

	private int method2(int arr[]) {
		int max = Integer.MIN_VALUE;

		int j = 1;
		int sum = arr[0];

		while (j < arr.length) {
			if (sum + arr[j] < arr[j]) {
				sum = arr[j];
				max = Math.max(max, arr[j]);
				j++;
			} else {
				sum = arr[j] + sum;
				max = Math.max(max, sum);
				j++;
			}
		}
		return max;
	}

//	private int method3(int arr[]) {
//
//	}

}
