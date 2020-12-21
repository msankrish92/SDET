package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class Question39 {

//	@Test
//	public void example1() {
//		int[] arr = {2,0,2,1,1,0};
//		dutchAlgorithm(arr);
//	}
//	
//	private void dutchAlgorithm(int arr[]) {
//		int low = 0;
//		int mid = 0;
//		int high = arr.length;
//		
//		while(mid<high){
//			if(arr[mid] == 0) {
//				int temp = arr[low];
//				arr[low] = arr[mid];
//				arr[mid] = temp;
//				low++;
//				mid++;
//			}
//			if(arr[mid] == 1) {
//				mid++;
//			}
//			if(arr[mid] == 2) {
//				int temp = arr[mid];
//				arr[mid] = arr[high-1];
//				arr[high-1] = temp;
//				high--;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//	}

	public static void main(String[] args) {
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		int low = 0;
		int mid = 0;
		int high = arr.length;

		while (mid < high) {
			if (arr[mid] == 2) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[high - 1];
				arr[high - 1] = temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
