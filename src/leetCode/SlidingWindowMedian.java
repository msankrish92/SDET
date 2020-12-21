package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class SlidingWindowMedian {

	@Test
	public void example1() {
		int[] arr = {1,3,-1,-3,5,3,6,7};
		int k = 3;
//		slidingWindowMedian(arr,k);
	}
	
	//Method 1 (Time Complexity O[nlogn]
	/*
	 * private void slidingWindowMedian(int arr[], int k) { for (int i = 0; i <
	 * arr.length; i++) { int[] temp = new int[k]; int index = 0; temp[index++] =
	 * arr[i]; for (int j = i+1; j < i+k && j<arr.length; j++) { temp[index++] =
	 * arr[j]; } Arrays.sort(temp); System.out.println(temp[k/2]); } }
	 */
	
	
	
}
