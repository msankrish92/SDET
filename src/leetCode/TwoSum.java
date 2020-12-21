package leetCode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TwoSum {

//	@Test
//	public void example() {
//	int nums[] = {2,7,11,15};
//	int target = 9;
//	twoSums(nums, target);
//	}
//	
//	@Test
//	public void example1() {
//	int nums[] = {3,2,4};
//	int target = 6;
//	twoSums(nums, target);
//	}
	
	@Test
	public void example2() {
	int nums[] = {3,3};
	int target = 6;
	twoSums(nums, target);
	}
	
	private void twoSums(int nums[], int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int difference = target - nums[i];
			if(map.containsKey(difference)) {
				System.out.println(map.get(difference) + "->" + i);
			}
			map.put(nums[i], i);
		}
	}
	
}
