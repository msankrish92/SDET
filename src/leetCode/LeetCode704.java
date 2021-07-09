package leetCode;

import org.testng.annotations.Test;

public class LeetCode704 {

	@Test
	public void example1() {
		int nums[] = {-1,0,3,5,9,12};
		int target = 9;
		System.out.println(method1(nums, target, 0, nums.length));
	}
	
	@Test
	public void example2() {
		int nums[] = {-1,0,3,5,9,12};
		int target = 2;
		System.out.println(method1(nums, target, 0, nums.length));
	}
	
	@Test
	public void example3() {
		int nums[] = {5};
		int target = -5;
		System.out.println(method1(nums, target, 0, nums.length));
	}
	
	@Test
	public void example4() {
		int nums[] = {5};
		int target = 5;
		System.out.println(method1(nums, target, 0, nums.length));
	}
	
	@Test
	public void example5() {
		int nums[] = {2,5};
		int target = 2;
		System.out.println(method1(nums, target, 0, nums.length));
	}
	
	public int method1(int nums[], int target, int start, int end) {
		int mid = (start + end)/2;
		if(start == end) {
//			if(nums[mid] == target) return mid;
			return -1;
		}
		if(nums[mid] == target) {
			return mid;
		}else if(nums[mid]>target){
			return method1(nums, target, start, mid);
		}else {
			return method1(nums, target, mid+1, end);
		}
//		return -1;
	}
	
}
