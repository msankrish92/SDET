package ds.arrays;

import org.junit.Test;

public class Question2 {
	
	/*
	 * Given two arrays, write a method to print their intersection. [1,2,4,5,4]
	 * [2,4,7,9,4] => [2,4]
	 */

	@Test
	public void example1() {
		int arr1[] = {1,2,5,4,3};
		int arr2[] = {8,9,1,4,6};
		intersection(arr1, arr2);
		System.out.println("----");
	}
	
	@Test
	public void example2() {
		int arr1[] = {0,2,5,4,3};
		int arr2[] = {8,9,0,4,6,5};
		intersection(arr1, arr2);
		System.out.println("----");
	}
	
	@Test
	public void example3() {
		int arr1[] = {1,-2,5,4,3};
		int arr2[] = {8,9,1,4,6,5,-2};
		intersection(arr1, arr2);
		System.out.println("----");
	}
	
	private void intersection(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
	
}
