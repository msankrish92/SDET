package leetCode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SlidingWindowMaximum {

	@Test
	public void example1() {
		int nums[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		slidingWindowMaximum(nums, k);
	}
	
	//Method 1(Time Complexity O[N^2]
	/*
	 * private void slidingWindowMaximum(int nums[], int k) {
	 * 
	 * int output[] = new int[nums.length]; int index = 0;
	 * 
	 * for (int i = 0; i <= nums.length-k; i++) { int temp = nums[i]; for (int j =
	 * i+1; j < k+i && j<nums.length; j++) { if(temp<nums[j]) { temp = nums[j]; } }
	 * output[index++] = temp; } System.out.println(Arrays.toString(output)); }
	 */
	
	//Method 2 (Time complexity O[N])
	private void slidingWindowMaximum(int nums[], int k) {
		int window_max_value = 0;
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < k; i++) {
			window_max_value = nums[i] + window_max_value;
		}
		lst.add(window_max_value);
		for (int i = k; i < nums.length; i++) {
			if(window_max_value<nums[i]) {
				window_max_value = nums[i];
			}
			lst.add(window_max_value);
		}
		System.out.println(lst);
	}
}
