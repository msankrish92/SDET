package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class Question7 {

	/*
	 * 1) Given an array of integers sorted in non-decreasing order(All the elements
	 * are greater the element before it, return an array of the squares of each
	 * number, also in sorted non-decreasing order.
	 * 
	 * Input: [-8,-3,3,4,10] Output: [9,9,16,64,100]
	 */

	@Test
	public void example1() {
		int arr[] = { -8, -3, 3, 4, 10 };
		int[] squareOfEachNumber = squareOfEachNumber(arr);
		for (int i = 0; i < squareOfEachNumber.length; i++) {
			System.out.println(squareOfEachNumber[i]);
		}
		System.out.println("-----");

	}

	@Test
	public void example2() {
		int arr[] = { 1, 5, 6, 8, 10 };
		int[] squareOfEachNumber = squareOfEachNumber(arr);
		for (int i = 0; i < squareOfEachNumber.length; i++) {
			System.out.println(squareOfEachNumber[i]);
		}
		System.out.println("-----");
	}

	@Test
	public void example3() {
		int arr[] = { -8, -3, -2, -1 };
		int[] squareOfEachNumber = squareOfEachNumber(arr);
		for (int i = 0; i < squareOfEachNumber.length; i++) {
			System.out.println(squareOfEachNumber[i]);
		}
		System.out.println("-----");
	}

	@Test
	public void example4() {
		int arr[] = { -8, -3, 3, 3, 10 };
		int[] squareOfEachNumber = squareOfEachNumber(arr);
		for (int i = 0; i < squareOfEachNumber.length; i++) {
			System.out.println(squareOfEachNumber[i]);
		}
		System.out.println("-----");
	}
	
	

	// Method 1(Over all time complexity is O(n log(n))
//	private int[] squareOfEachNumber(int arr[]) {
////		int output[] = new int[arr.length];// O[1]
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = arr[i] * arr[i];// O[n]
//		}
//		Arrays.sort(arr);// O(n log(n))
//		return arr;// O[1]
//	}

//	 Method 2(SortSquares - Uses merge Sort)(Time Complexity is O[n])
//	private int[] squareOfEachNumber(int arr[]) {
////		Dividing positive and negative number
//		int length = arr.length;
//		int k;
//		for (k = 0; k < length; k++) {
//			if (arr[k] >= 0) { // O[n]
//				break;
//			}
//		}
//
//		int j = k; // positive start index
//		int i = k - 1; // negative start index
//		int index = 0;
//		int[] temp = new int[length];
//
////		sorting the element		
//		while (i >= 0 && j < length) { // O[n]
//			if (arr[i] * arr[i] < arr[j] * arr[j]) {
//				temp[index] = arr[i] * arr[i];
//				i--;
//			} else {
//				temp[index] = arr[j] * arr[j];
//				j++;
//			}
//			index++;
//		}
////		To add all the remaining elements to the array
//		while (i >= 0) { // O[n]
//			temp[index] = arr[i] * arr[i];
//			i--;
//			index++;
//		}
//
//		while (j < length) { // O[n]
//			temp[index] = arr[j] * arr[j];
//			j++;
//			index++;
//		}
//
//		return temp;
//	}

	// Method3(Using two pointers)(Time Complexity 0[n])
	private int[] squareOfEachNumber(int arr[]) {

		int length = arr.length;
		int temp[] = new int[arr.length];
		int startingPointer = 0;
		int endPointer = length - 1;
		int index = length - 1;
//		will compare the starting and end point and place the greater element in at last temp index
		while (startingPointer <= endPointer) { //O[n]
			if (Math.abs(arr[startingPointer]) >= Math.abs(arr[endPointer])) {
				temp[index--] = arr[startingPointer] * arr[startingPointer];
				startingPointer++;
			} else {
				temp[index--] = arr[endPointer] * arr[endPointer];
				endPointer--;
			}

		}

		return temp;

	}

}
