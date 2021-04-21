package sort;

import java.util.Arrays;

import org.junit.Test;

public class MergeSort {

	/*
	 * Pseudo 4 1 2 3 7 4 1 2 3 7 4 1 2 3 7
	 * 1 4 2 3
	 * 
	 * 
	 */

	@Test
	public void example() {
		int[] arr = { 4, 1, 2, 3, 7 };
		System.out.println(Arrays.toString(method1(arr)));
	}

	private int[] method1(int arr[]) {
		divide(arr, 0, arr.length);
		return arr;
	}

	private void divide(int arr[], int start, int end) {
		if(start == end) {
			return;
		}
		int mid = (end + start) / 2;
		if (mid > 0) {
			divide(arr, start, mid);
			divide(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	
	}

	private void merge(int arr[], int start, int mid, int end) {
		int L[] = Arrays.copyOfRange(arr, start, mid);
		int R[] = Arrays.copyOfRange(arr, mid, end);

		int i = 0;
		int j = 0;

		while (i < L.length || j < R.length) {
			if (i < L.length && j < R.length) {
				if (L[i] < R[j]) {
					arr[start++] = L[i++];
				} else {
					arr[start++] = R[j++];
				} 
			}else if(i < L.length) {
				arr[start++] = L[i++];
			}else {
				arr[start++] = R[j++];
			}
		}

//		while (i < L.length) {
//			arr[start++] = L[i++];
//		}
//
//		while (j < R.length) {
//			arr[start++] = R[j++];
//		}
		
	}

}
