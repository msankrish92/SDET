package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class RotateAnArray {

//	@Test
//	public void example1() {
//		int[] arr = {1,2,3,4};
//		int rotate = 2;
//		rotateArray(arr,rotate);
//	}

	@Test
	public void example2() {
		int[] arr = { 1, 2, 3, 4 };
		int rotate = 6;
		rotateArray2(arr, rotate);
	}

	private void rotateArray(int arr[], int rotate) {
		if (rotate < 0) {
			rotate = Math.abs(rotate);
		}

		if (rotate > arr.length) {
			rotate = rotate % arr.length;
		}
		int temp = 0;
		int tempArr[] = new int[arr.length];
		for (int i = 0; i < rotate; i++) {
			temp = arr[arr.length - 1];

			for (int j = 0; j < arr.length - 1; j++) {
				tempArr[j + 1] = arr[j];

			}
			tempArr[0] = temp;
			System.arraycopy(tempArr, 0, arr, 0, arr.length);

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private void rotateArray2(int arr[], int rotate) {
		int temp[] = new int[arr.length];
		if (rotate < 0) {
			rotate = Math.abs(rotate);
		}

		if (rotate > arr.length) {
			rotate = rotate % arr.length;
		}
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[arr.length-i-1];
		}
		
		System.arraycopy(temp, 0, arr, 0, arr.length);

		for (int i = 0; i < arr.length/2; i++) {
			temp[i] = arr[(arr.length/2-i)-1 ];
		}
		
		System.arraycopy(temp, 0, arr, 0, arr.length/2);
		
		for (int i = 0; i < arr.length/2; i++) {
			temp[arr.length/2+1] = arr[(arr.length/2)+1];
		}
		
//		System
		
	}

}
