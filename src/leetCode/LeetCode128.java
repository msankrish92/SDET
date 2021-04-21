package leetCode;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LeetCode128 {
	
	/*
	 * Pseudo
	 * Initialize count and max
	 * Add all the elements to the set
	 * And iterate over the element
	 *  and check if the current value -1 is present in the set
	 *  	if preset do nothing -> as it might hold smaller value than that
	 *  else
	 *  	start from current valu
	 *  	while(current value is in the list
	 *  		increment count
	 *  		increment val by 1
	 *  	max of max and count
	 *  outsie if make reset count
	 *  
	 *  outside loop
	 *  retun max
	 *  
	 */

	@Test
	public void example1() {
		int nums[] = {100,4,200,1,3,2};
		System.out.println(longestConsecutive(nums));
	}

	@Test
	public void example2() {
		int nums[] = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(method1(nums));
	}
	
	public int method1(int[] nums) {
		Set<Integer> st = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			st.add(nums[i]);
		}
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			int currentCount = 0;
			if(st.contains(nums[i]-1)) {
				continue;
			}else {
				int val = nums[i];
				while(st.contains(val)) {
					currentCount++;
					val = val+1;
				}
				max = Math.max(currentCount, max);
			}
		}
		return max;		
	}
	

	public int longestConsecutive(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int length = 0;
		for (int i = 0; i < nums.length; i++) {
			length = Math.max(nums[i], length);
		}
		int arr[] = new int[length + 1];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]]++;
		}
		int i = 0;
		int j = 0;
		int max = 0;
		while (j < arr.length - 1) {
			if (arr[j] != 0 && arr[j + 1] != 0) {
				j++;
			} else {
				max = Math.max(j - i, max);
				j++;
				i = j;
			}
		}
		return max + 1 > j - i ? max + 1 : j - i + 1;
	}
}
