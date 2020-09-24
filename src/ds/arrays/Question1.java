package ds.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Question1 {

	/*
	 * Given an array of positive integers, find the subarrays that adds up to the
	 * given number (k) Input Array :{ 1, 7, 4, 3, 1, 2, 1, 5, 1 }; Desired Sum (k):
	 * 7
	 */

//	@Test
//	public void example() {
//		int arr[] = { 1, 7, 4, 3, 1, 2, 1, 5, 1 };
//		int desiredValue = 7;
//		subArray(arr, desiredValue);
//		System.out.println("--------");
//	}

	@Test
	public void example1() {
		int arr[] = { 1, 1, 1, 1, 1 };
		int desiredValue = 5;
		subArray(arr, desiredValue);
		System.out.println("--------");
	}
//
//	@Test
//	public void example2() {
//		int arr[] = { 1, 4, 20, 3, 10, 5 };
//		int desiredValue = 5;
//		subArray(arr, desiredValue);
//		System.out.println("--------");
//	}

	// Method 1(Time Complexity O[n^2]
//	private void subArray(int arr[], int desiredValue) {
////		int arr[] = { 1, 7, 4, 3, 1, 2, 1, 5, 1 };
////		int desiredValue = 7;
//		
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == desiredValue) {
//				System.out.println(i + "->" + i);
//				continue;
//			}
//			int temp = arr[i];
//			for (int j = i; j < arr.length-1; j++) {
//				temp = arr[j+1] +temp;
//				if(temp == desiredValue) {
//					System.out.println(i + "->" + (j+1));
//					break;
//				}
//				if(temp>desiredValue) {
//					break;
//				}
//			}
//
//		}
//
//	}

	// Method 2
	private void subArray(int arr[], int desiredSum) {

		Map<Integer, Integer> map = new HashMap<>();
		// To reset
//		I have seen like if a value is not present in an array and 
//		if we want the index ,it returns is -1... is this the reason 
//		why we choose -1 as index value in adding '0' ?
//		if all the elements are same we happen to start at the first index 
//		that is 0 and the last difference value will be zero as well, so we are adding below statement
		map.put(0, -1);
//		int arr[] = {1,7,4,3,1,2,1,5,1};
		int sum_so_far = 0;

		for (int i = 0; i < arr.length; i++) {
			sum_so_far += arr[i];
			int diff = sum_so_far - desiredSum;
			if (map.containsKey(diff)) {
				System.out.println("Found the array: {" + (map.get(diff) + 1) + "," + i + "}");
			}
			map.put(sum_so_far, i);
		}

	}

	// Method 3 (Time complexity O[n])
//	private void subArray(int arr[], int desiredValue) {
//
//		int leftIndex = 0;
//		int rightIndex = 0;
//		int currentSum = arr[0];
//
////		until right index is lesser than array length
//		while (rightIndex < arr.length) {
////			if current sum is lesser than desired value add next element
//			if (currentSum < desiredValue) {
////				this is to end the loop, if right index is equal to arr.length -1 break
//				if (rightIndex == arr.length - 1) {
//					break;
//				}
//				currentSum = currentSum + arr[++rightIndex];
//			} else if (currentSum > desiredValue) { // if current sum is greater than desired sum remove the first
//													// element
//				currentSum = currentSum - arr[leftIndex++];
//			} else if (currentSum == desiredValue) { // if current sum is equal to desired sum, sysout right and left
//														// index
//				System.out.println(leftIndex + "->" + rightIndex);
////				this is to end the loop, if right index is equal to arr.length -1 break
//				if (rightIndex == arr.length - 1) {
//					break;
//				}
//				// making the current sum equal to next element to left index
//				currentSum = arr[++leftIndex];
//				// Pointing both the left and right index to the same point
//				rightIndex = leftIndex;
//			}
//		}
//	}

}
