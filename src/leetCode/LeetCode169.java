package leetCode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LeetCode169 {

	@Test
	public void example1() {
		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));
	}

	public int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		int max = 0;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
			}
		}

		for (int a : map.keySet()) {
			if (map.get(a) == max) {
				return a;
			}
		}
		return -1;
	}
}
