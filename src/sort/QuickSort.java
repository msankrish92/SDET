package sort;

import java.util.Arrays;

import org.junit.Test;

public class QuickSort {

//	Partion(arr,left,right)
//	steps 1-7
//	returns the partition
//	 quickSort(){
//	 int mid = Partion(arr,left,right);
//	quickSort(arr,left,mid);
//	quickSort(arr,mid+1,right);
//	}  

	@Test
	public void example1() {
		int arr[] = { 5, 2, 1, 6, 7, 8 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void example2() {
		int arr[] = { 9,8,5,6,7,0,1 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void example3() {
		int arr[] = { 4,2,2,4,7,2 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	@Test
	public void example4() {
		int arr[] = { 9,8,7,6,5,4,3 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void example5() {
		int arr[] = { -9,8,7,-6,5,4,3,-1 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private void quickSort(int arr[], int start, int end) {
		if (start < end) {
			int mid = partion(arr, start, end);
			quickSort(arr, start, mid);
			quickSort(arr, mid + 1, end);
		}

	}
//	9,8,5,6,7,0,1
/*
 * pivot = 9
 * left = 1 => 5 -> will search for greater than pivot value
 * right = 6 => 1 -> will search for less than pivot value
 * 
 */
//	9,8,7,6,5,4,3
	private int partion(int arr[], int start, int end) {
		int pivot = arr[start];
		int left = start;
		int right = end;
		while (left < right) {
			while (left <= right && arr[left] < pivot) {
				left++;
			}
			while (left <= right && arr[right] > pivot) {
				right--;
			}
			if (left < right && arr[left]>=pivot && arr[right] <= pivot) {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				left++;
				right--;
			}
		}
		int temp = arr[start];
		arr[start] = arr[right];
		arr[right] = temp;
		return right;
	}

}
