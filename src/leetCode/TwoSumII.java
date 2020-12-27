package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TwoSumII {

//	Two Sum II
//	int[] nums = {1,4,5,7,8,9,11};
//	int k = 12
//	[[0,6][1,4][2,3]]
//	int[] nums = {1,4,5,7,7,9,11};
//	int k = 11
//	[[1,3]]

//	Pseudo
//	Create a Hash Map with Integer, Integer
//	One holds index and other hold diffence value
//	loop through and check it the difference value is already present in the map
//	if present return the key of it and add it to the list
//	When the diffence matches I can remove it
//	if not add the it to the map

	@Test
	public void example1() {
		int nums[] = { 1, 4, 5, 7, 8, 9, 11 };
		int k = 12;
		System.out.println(Arrays.toString(twoSum(nums, k)));
	}

//	@Test
	public void example2() {
		int nums[] = { 1, 4, 5, 7, 7, 9, 11 };
		int k = 11;
		System.out.println(twoSum(nums, k));
	}

//	@Test
	public void example3() {
		int nums[] = { 1, 4, 5, 7, 8, 9, 11 };
		int k = 50;
		System.out.println(twoSum(nums, k));
	}

	private int[] twoSum(int nums[], int k) {
		int temp[] = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		int difference = 0;
		for (int i = 0; i < nums.length; i++) {
			difference = k - nums[i];
			if (map.containsKey(nums[i])) {

				temp[0] = map.get(nums[i]);
				temp[1] = i;
				return temp;
			}
			map.put(difference, i);
			difference = 0;
		}
		return temp;
	}

}
