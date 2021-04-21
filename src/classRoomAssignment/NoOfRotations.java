package classRoomAssignment;

import org.junit.Test;

public class NoOfRotations {

	/*
	 * pseudo
	 * 
	 * RecuriveFunction(arr) if(end - start == 0) if(start == 0 &&
	 * arr[start+1]<arr[start]) return start if(start == arr.length-1 &&
	 * arr[start-1]<arr[start]) return start if(arr[start+1]<arr[start] &&
	 * arr[start-1]<arr[start]) return start; Calculate mid Divide the array start
	 * to mid Divide the array mid + 1 to end
	 * 
	 * 
	 */
//	@Test
//	public void example1() {
//		int arr[] = { 5, 6, 7, 3, 4 };
//		recFun(arr);
//	}
//	
//	@Test
//	public void example2() {
//		int arr[] = { 5, 6, 1, 2, 3, 4 };
//		recFun(arr);
//	}
//	
	@Test
	public void example3() {
		int arr[] = { 4, 1, 2, 3, };
		recFun(arr);
	}
	
//	@Test
//	public void example4() {
//		int arr[] = { 4, 5, 6, 3 };
//		recFun(arr);
//	}
	
//	@Test
//	public void example5() {
//		int arr[] = { 2, 3, 4, 5, 1 };
//		recFun(arr);
//	}
//	
//	@Test
//	public void example6() {
//		int arr[] = { 1, 2, 3, 4, 5 };
//		recFun(arr);
//	}
	
	int index = 0;
	private void recFun(int arr[]) {
		System.out.println(noOfRotation(arr, 0, arr.length - 1));
//		System.out.println(index);
	}
//	4, 5, 6, 3
	private int noOfRotation(int[] arr, int start, int end) {
		if (end - start == 0) {
//			if (start == 0 && arr[start + 1] < arr[start])
//				return start;
//			else if (start == arr.length - 1 && arr[start - 1] > arr[start])
//				return start;
			if (start<arr.length-1 && arr[start + 1] < arr[start])
				return start;
		} else {
			int mid = (end + start) / 2;
			if (mid >= 0) {
				return noOfRotation(arr, start, mid) + noOfRotation(arr, mid + 1, end);
			}
		}
		return 0;
	}

}
