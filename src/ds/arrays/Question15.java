package ds.arrays;

import org.junit.After;
import org.junit.Test;

public class Question15 {

	/*
	 * Find the peak index in a mountain array
	 * 
	 * Example 1:
	 * 
	 * Input: arr = [0,1,0] Output: 1 Example 2:
	 * 
	 * Input: arr = [0,4,2,0] Output: 1
	 * 
	 * Example 3:
	 * 
	 * Input: arr = [0,10,5,2] Output: 1
	 */

//	@Test
//	public void example1() {
//		int arr[] = { 0, 1, 0 };
//		mountainArray(arr);
//	}
//	
//	@Test()
//	public void testData1(){
//		int[] input = {5,3,2,1};
//		mountainArray(input);
//	}
//
//	@Test()
//	public void testData2(){
//		int[] input = {-18,-22,-4,-2,-1,0};
//		mountainArray(input);
//	}

//	@Test()
//	public void testData3(){
//		int[] input = {0,-1,0};
//		mountainArray(input);
//	}
//
//	@Test()
//	public void testData4(){
//		int[] input = {10,2,7,9,11,10};
//		mountainArray(input);
//	}
//
	@Test()
	public void testData5(){
		int[] input = {0,6,0};
		mountainArray(input);
	}
	
	@After
	public void afterMethodSpaces() {
		System.out.println("---------------------------------");
	}

	private void mountainArray(int arr[]) {
		for (int i = 1; i < arr.length-1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.println(i);
			}
		}

	}
}
