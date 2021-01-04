package search;

import org.junit.Test;

public class RotatedArraySearch {

	/*
	 * Pseudo
	 * Boundry will be first index value mid and second index value
	 * if the value false between first index and mid move left
	 * else move right
	 * 
	 */
	
	
	@Test
	public void example1() {
		int arr[] = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(method1(arr, target));
	}
	
	@Test
	public void example2() {
		int arr[] = {4,5,6,7,0,1,2};
		int target = 3;
		System.out.println(method1(arr, target));
	}
	
	
	
	@Test
	public void example3() {
		int arr[] = {1};
		int target = 0;
		System.out.println(method1(arr, target));
	}
	
	@Test
	public void example4() {
		int arr[] = {4,5,6,7,0,1,2};
		int target = 4;
		System.out.println(method1(arr, target));
	}
	
	private int method1(int arr[], int target) {
		int firstValue = arr[0];
//		int lastValue =  arr[arr.length-1];
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(target == arr[mid]) return mid;
			if(target>=firstValue && target<=arr[mid]) {
				high = mid-1;
			}else {
				if(mid<arr.length-1)
					firstValue = arr[mid+1];
				low = mid+1;
			}
		}
		
		return -1;
	}
	
	
}
