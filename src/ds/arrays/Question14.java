package ds.arrays;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Question14 {
	
	/*
	 * Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing
	 * order, return a sorted array of only the integers that appeared in all three
	 * arrays.
	 * 
	 * Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8] Output:
	 * [1,5] Explanation: Only 1 and 5 appeared in the three arrays.
	 */

	@Test
	public void example1() {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,5,7,9};
		int arr3[] = {1,3,4,5,8};
		commonElement(arr1,arr2,arr3);
		
	}
	
	private void commonElement(int arr1[], int arr2[], int arr3[]) {
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				if(arr1[i] == arr2[j]) {
					for (int k = 0; k < arr3.length; k++) {
						if(arr1[i] == arr3[k]) {
							System.out.println(arr1[i]);
						}
					}
				}
				
			}
		}
		
		
		
	}
	
	
	
	
	
}
