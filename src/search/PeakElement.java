package search;

import org.junit.Test;

public class PeakElement {
	
	/*
	 *Pseudo
	 * declare two variable 
	 * while(low<=high)
	 * mid = (low+high)/2
	 * if(mid == arr.length && mid > mid -1 || mid-1 < mid && mid+1<mid)
	 * return mid
	 * else
	 * low = mid + 1;
	 */
	
	@Test
	public void example1() {
		int arr[] = {1,2,1,3,5,6,4};
		System.out.println(method1(arr));
	}
	
	@Test
	public void example2() {
		int arr[] = {1,2,3,1};
		System.out.println(method1(arr));
	}
	
	@Test
	public void example3() {
		int arr[] = {4,1};
		System.out.println(method1(arr));
	}

	
	private int method1(int arr[]) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == arr.length && arr[mid] > arr[mid -1] || arr[mid-1] < arr[mid] && arr[mid+1]<arr[mid]) {
				return arr[mid];
			}else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
}
