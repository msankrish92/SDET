package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class SquareOfEachNumber {

	/*
	 * 1) Given an array of integers sorted in non-decreasing order(All the elements are greater the element 
	 * before it, return an array of the squares of each number, also in sorted non-decreasing order.
	 * 
	 * Input: [-8,-3,4,3,10] Output: [9,9,16,64,100]
	 */
	
	
	@Test
	public void example1() {
		int arr[] = {-8,-3,4,3,10};
		int[] squareOfEachNumber = squareOfEachNumber(arr);
		for (int i = 0; i < squareOfEachNumber.length; i++) {
			System.out.println(squareOfEachNumber[i]);
		}
	}
	
	@Test
	public void example2() {
		int arr[] = {-8,-3,0,3,10};
		int[] squareOfEachNumber = squareOfEachNumber(arr);
		for (int i = 0; i < squareOfEachNumber.length; i++) {
			System.out.println(squareOfEachNumber[i]);
		}
	}
	
	//Method 1
	private int[] squareOfEachNumber(int arr[]) {
		int output[] = new int[arr.length];//O[1]
		for (int i = 0; i < arr.length; i++) {
			output[i] = arr[i] * arr[i];//O[n]
		}
		Arrays.sort(output);//O(n log(n))
		return output;//O[1]
	}
	
	



	
}
