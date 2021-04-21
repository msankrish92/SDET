package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode416 {

//	@Test
//	public void example1() {
//		int arr[] = {1,5,11,5};
//		System.out.println(method2(arr));
//	}
//	
//	@Test
//	public void example2() {
//		int arr[] = {1,2,3,5};
//		System.out.println(method2(arr));
//	}
	
//	@Test
//	public void example3() {
//		int arr[] = {2,4,10,20};
//		System.out.println(method2(arr));
//	}
	
//	@Test
//	public void example4() {
//		int arr[] = {100};
//		System.out.println(method2(arr));
//	}
	
	@Test
	public void example4() {
		int arr[] = {2,2,3,5};
		System.out.println(method2(arr));
	}
	
	/*
	 * boolean flag = false; private boolean method1(int arr[]) { Arrays.sort(arr);
	 * int target = 0; for (int i = 0; i < arr.length; i++) { target += arr[i]; }
	 * if(target%2 == 1) return false;
	 * 
	 * if(arr[arr.length-1] == target) { return true; } recFun(arr,target/2, 0, 0);
	 * return flag; }
	 * 
	 * private void recFun(int arr[], int target, int sum, int start) { if(target ==
	 * sum) { flag = true; } if(sum > target) return; for (int i = start; i <
	 * arr.length; i++) { sum += arr[i]; recFun(arr, target, sum, i+1); sum -=
	 * arr[i]; } }
	 */
	
	private boolean method2(int arr[]) {
		int target = 0;
		for (int i = 0; i < arr.length; i++) {
			target += arr[i];
		}
		if(target%2 == 1)
			return false;
		Arrays.sort(arr);
		int rows = arr.length-1;
		target = target/2;
		if(arr[rows] == target) {
			return true;
		}
		if(arr[rows] > target) {
			return false;
		}
		return bottomUpRecFunction(arr,rows,target,0);
	}
	
	private boolean bottomUpRecFunction(int arr[], int rows, int target, int cs) {
		if(cs == target) {
			return true;
		}
		for (int i = rows; i >= 0; i--) {
			if(cs+arr[i] <= target) {
				if(bottomUpRecFunction(arr, i-1, target, cs+arr[i])) {
					return true;
				}
				cs-=arr[i];
			}
		}
		return false;
	}
	
}
