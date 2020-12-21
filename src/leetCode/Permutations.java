package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Permutations {

	@Test
	public void example1() {
		Integer nums[] = { 1, 2, 3, 4 };
		System.out.println(permute(nums));
	}

	public List<List<Integer>> permute(Integer[] nums) {
		List<List<Integer>> out = new ArrayList<>();
		recursion(nums, out, new ArrayList<>(), 0);

		return out;
	}

	public void recursion(Integer nums[], List<List<Integer>> out, List<Integer> lst, int l) {
		if (l == nums.length) {
			System.out.println("Return value " + Arrays.toString(nums));
			out.add(new ArrayList<Integer>(Arrays.asList(nums)));
			return;
		}
		for (int i = l; i < nums.length; i++) {
			System.out.println("l value is " + l);
			System.out.println("i value is " + i);
			nums = swap(nums, i, l);
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
