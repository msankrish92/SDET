
package ds.arrays;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Question6 {
	
	/*
	 * Given an integer array, return all the duplicate values in the array
	 * [2,1,3,1,3,1,3,4] => [1,1 ]
	 */
		

	@Test
	public void example1() {
		int arr[] = { 1, 5, 1, 2, 3, 2 };
		duplicateValue(arr);
	}

	@Test
	public void example2() {
		int arr[] = { 2, 1, 3, 1, 3, 1, 3, 4 };
		duplicateValue(arr);
	}

	@Test
	public void example3() {
		int arr[] = { 2, 1, 3, 4 };
		duplicateValue(arr);
	}

	@Test
	public void example4() {
		int arr[] = { -2, 1, 3, 4, -2 };
		duplicateValue(arr);
	}

	@Test
	public void example5() {
		int arr[] = { 0, 0, 0, 0, 0 };
		duplicateValue(arr);
	}

	private void duplicateValue(int arr[]) {

		Set<Integer> duplicates = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int noOfElements = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					noOfElements++;
				}
				if (noOfElements > 0) {
					duplicates.add(arr[i]);
				}
			}
		}
		System.out.println(duplicates);
	}

}
