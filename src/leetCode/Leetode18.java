package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class Leetode18 {

	@Test
	public void example1() {
		int nums[] = { 1, 0, -1, 0, -2, 2 };
		System.out.println(method2(nums, 0));
	}

	@Test
	public void example2() {
		int nums[] = { -5, 5, 4, -3, 0, 0, 4, -2 };
		System.out.println(method2(nums, 4));
	}

	Set<List<Integer>> lst = new HashSet<>();

	public List<List<Integer>> fourSum(int[] nums, int target) {
		recur(nums, new ArrayList<Integer>(), 4, target, 0);
		return new ArrayList<>(lst);
	}

	public void recur(int nums[], List<Integer> ls, int limit, int target, int start) {
		if (limit == 0) {
			if (target == 0) {
				List<Integer> temp = new ArrayList<>(ls);
				Collections.sort(temp);
				lst.add(new ArrayList<>(temp));
				limit--;
				return;
			} else {
				limit--;
				return;
			}
		}
		for (int i = start; i < nums.length; i++) {
			target = target - nums[i];
			ls.add(nums[i]);
			recur(nums, ls, --limit, target, ++start);
			limit++;
			ls.remove(ls.size() - 1);
			target = target + nums[i];
		}
	}

	public Set<List<Integer>> method2(int nums[], int target) {
		Arrays.sort(nums);
		Set<List<Integer>> st = new HashSet<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			List<Integer> lst = new ArrayList<Integer>();
			lst.add(nums[i]);
			for (int j = i + 1; j < nums.length; j++) {
				lst.add(nums[j]);
				for (int k = j + 1; k < nums.length; k++) {
					lst.add(nums[k]);
					int searchValue = target - (nums[i] + nums[j] + nums[k]);
					if (bs(nums, k + 1, nums.length, searchValue)) {
						lst.add(searchValue);
						st.add(new ArrayList<>(lst));
						lst.remove(lst.size() - 1);
					}
					lst.remove(lst.size() - 1);
				}
				lst.remove(lst.size() - 1);
			}
			lst.remove(lst.size() - 1);
		}
		return st;
	}

	public boolean bs(int nums[], int start, int end, int target) {
		int mid = (start + end) / 2;
		if (start == end)
			return false;
		if (nums[mid] == target) {
			return true;
		} else if (nums[mid] > target) {
			return bs(nums, start, mid, target);
		} else {
			return bs(nums, mid + 1, end, target);
		}
	}
	
	public void method3(int nums[], int target) {
		Arrays.sort(nums);
		List<Integer> lst = new ArrayList<>();
		for(int i = 0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length; j++) {
				int left = 0;
				int right = nums.length-1;
				int searchValue = target - (nums[i] + nums[j]);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
