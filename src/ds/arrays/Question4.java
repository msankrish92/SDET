package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class Question4 {
	
	/*
	 * Given an unsorted integer array, find the smallest missing positive integer.
	 * [2,8,10,1,0, 2,1] => 3 
	 */

	@Test
	public void example1() {
		int[] arr = { 2, 8, 4, 1, 0, 2, 1 };
		smallestPositiveInt(arr);
		System.out.println("----");
	}
	
	@Test
	public void example2() {
		int[] arr = { -2, 8, 10, 1, 0, -5 };
		smallestPositiveInt(arr);
		System.out.println("----");
	}
	
	@Test
	public void example3() {
		int[] arr = { -2, -8, -10, -1, 2 };
		smallestPositiveInt(arr);
		System.out.println("----");
	}
	
	

	private void smallestPositiveInt(int arr[]) {

		Arrays.sort(arr); 
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > 0 && arr[i] + 1 != arr[i + 1] && arr[i] != arr[i + 1]) {
				System.out.println(arr[i] + 1);
				break;
			}

		}
	}

}
