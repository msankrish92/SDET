package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.junit.Test;

public class PermutationsII {
	@Test
	public void example1() {
		Integer nums[] = { 1, 1, 2 };
		System.out.println(permute(nums));
	}

	public List<List<Integer>> permute(Integer[] nums) {
		List<List<Integer>> out = new ArrayList<>();
		recursion(nums, out, new ArrayList<>(), 0);
//		List<List<Integer>> out1 = new ArrayList<>(out);
		return out;
	}

	public void recursion(Integer nums[], List<List<Integer>> out, List<Integer> lst, int l) {
		if (l == nums.length) {
			
			out.add(new ArrayList<Integer>(Arrays.asList(nums)));
			return;
		}
		for (int i = l; i < nums.length; i++) {
			
			nums = swap(nums, i, l);
			if(out.contains(new ArrayList<>(Arrays.asList(nums)))) {
				continue;
			}
			recursion(nums, out, lst, l + 1);
			nums = swap(nums, i, l);
		}
	}

	public Integer[] swap(Integer nums[], int l, int r) {
		int temp = nums[l];
		nums[l] = nums[r];
		nums[r] = temp;
		return nums;
	}
}
