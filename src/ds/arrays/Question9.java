package ds.arrays;

import org.junit.Test;

public class Question9 {
	/*
	 * 3) Given an array, return true if and only if the given array A is monotonic.
	 * for everyone An array is monotonic if it is either monotone increasing or
	 * monotone decreasing.
	 * 
	 * Input: [1,2,3,3,4,4,4,4,5] Output: true
	 * 
	 * Input: [1,2,5,3,4,4,4,4,5] Output: false
	 * 
	 * Input: [5,4,4,2,1] Output: true
	 */

	@Test
	public void example1() {
		int arr[] = { 1, 2, 3, 3, 4, 4, 4, 4, 5 };
		System.out.println(monotonicArray(arr));
	}

	@Test
	public void example2() {
		int arr[] = { 1, 2, 5, 3, 4, 4, 4, 4, 5 };
		System.out.println(monotonicArray(arr));
	}

	@Test
	public void example3() {
		int arr[] = { 5, 4, 4, 2, 1 };
		System.out.println(monotonicArray(arr));
	}

	@Test
	public void example4() {
		int arr[] = { 1, 1, 1, 1 };
		System.out.println(monotonicArray(arr));
	}

	@Test
	public void example5() {
		int arr[] = { -1, 2, 3, 3, 4, 4, 4, 4, 5 };
		System.out.println(monotonicArray(arr));
	}

	// Method 1 (Time Complexity O[n])
	//	private boolean monotonicArray(int arr[]) {
	//		boolean flag = true;
	//		int temp = arr[0];
	////		if the first element and the last element are same it is non monotonic Array
	//		if (arr[0] == arr[arr.length - 1]) {
	//			return false;
	//		}
	////		Checks for positive or negative number
	//		if (arr[0] < arr[arr.length - 1]) {
	////			loops through to check whether the next element is greater than current element
	//			for (int i = 0; i < arr.length; i++) {
	//				if (temp <= arr[i]) {
	//					temp = arr[i];
	//				} else {
	//					flag = false;
	//				}
	//			}
	//
	//		} else {
	//			for (int i = 0; i < arr.length; i++) {
	//				if (temp >= arr[i]) {
	//					temp = arr[i];
	//				} else {
	//					flag = false;
	//				}
	//			}
	//		}
	//		return flag;
	//	}

	// Method 2(Time Complexity O[n])
	private boolean monotonicArray(int arr[]) {
		boolean increasing = true;
		boolean decreasing = true;

		//		if the first element and the last element are same mark it is neither increasing or decreasing monotonic
		if (arr[0] == arr[arr.length - 1]) {
			increasing = false;
			decreasing = false;
		} else {

		//		Loops through to check whether the next element is greater or lesser
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				increasing = false;
			} else if (arr[i] < arr[i + 1]) {
				decreasing = false;
			}
		}
		}
		return increasing || decreasing;
	}
}
