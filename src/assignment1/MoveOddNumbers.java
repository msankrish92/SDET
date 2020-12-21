package assignment1;

import java.util.Arrays;

import org.junit.Test;

public class MoveOddNumbers {

	@Test
	public void example1() {
		int arr[] = { 2, 1, 5, 3, 12 };
		method1(arr);
	}

	@Test
	public void example2() {
		int[] arr = { 5, 2, 7, 8, 9, 12, 11 };
		method1(arr);
	}

	private void method1(int arr[]) {
		int evenCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			}
		}
		int i = 0;
		int j = i + 1;
		while (i != evenCount) {
			if (arr[i] % 2 == 0) {
				i++;
				j = i + 1;
			} else if (arr[i] % 2 == 1 && j < arr.length) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
