package assignment1;

import org.junit.Test;

public class RiverRecords {

	/*
	 * Given an array of integers, without reordering, determine the maximum
	 * difference between any element and any prior smaller difference. If there is
	 * never a lower prior element, return -1.
	 * 
	 * Example arr = [5, 3, 6, 7, 4] 
	 * There are no earlier elements than arr[0].
	 * There is no earlier reading with a value lower than arr[1]. 
	 * There are two lower earlier readings with a value lower than arr[2] = 6: 
	 * arr[2] - arr[1] =6 - 3 = 3 
	 * arr[2] - arr[0] = 6 - 5 = 1 
	 * There are three lower earlier readings with a lower value than arr[3] = 7: 
	 * arr[3] - arr[2] = 7 - 6 = 1 
	 * arr[3] - arr[1] = 7 - 3 = 4 
	 * arr[3] - arr[0] = 7 - 5 = 2 
	 * There is one lower earlier reading with a lower value than arr[4] = 4: 
	 * arr[4] - arr[1] = 4 - 3 = 1 
	 * The maximum trailing record is arr[3] - arr[1] = 4.
	 */
	
	@Test
	public void example() {
		int[] arr = {5, 3, 6, 7, 4};
		method1(arr);
	}
	
	@Test
	public void example1() {
		int[] arr = {2, 3, 10, 2, 4, 8, 1};
		method1(arr);
	}
	
	@Test
	public void example2() {
		int[] arr = {7, 9, 5, 6, 3, 2};
		method1(arr);
	}
	
	private void method1(int arr[]) {
		int max = -1;
//		boolean flag = true;
		for(int i=arr.length-1; i>=0; i--) {
			for(int j = i-1; j>=0; j--) {
				if(arr[i]>arr[j])
				max = Math.max(max, arr[i]-arr[j]);
//				flag = false;
			}
		}
		System.out.println(max);
	}

}
