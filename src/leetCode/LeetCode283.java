package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode283 {

	/*-
	 * Pseudo[Two pointer][Time Complexity O[N]]
	 * Declare two pointers i and j
	 * while j < array length
	 * if value in jth index == 0
	 * 	increment j
	 * else 
	 * 	swap i with j
	 * 	increment j and i
	 */

	/*-
	 * Pseudo[Time Complexity O[N]]
	 * We can move all the non zero element to the begining
	 * And
	 * in another for loop
	 * fill the array with zero
	 */

	@Test
	public void example1() {
		int input[] = { 0, 1, 0, 3, 12 };
		method1(input);
	}

	@Test
	public void example2() {
		int input[] = { 1, 1, 0, 3, 10 };
		method1(input);
	}

	@Test
	public void example3() {
		int input[] = { 0, 0, 0, 3, 10 };
		method1(input);
	}

	private void method1(int arr[]) {
		int i = 0;
		int j = 0;
		while (j < arr.length) {
			if (arr[i] != 0 && arr[j] != 0) {
				i++;
				j++;
			} else if (arr[j] == 0) {
				j++;
			} else {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
