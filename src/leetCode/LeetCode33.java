package leetCode;

import org.junit.Test;

public class LeetCode33 {

//	@Test
//	public void example1() {
//		int nums[] = {4,5,6,7,0,1,2};
//		int target = 0;
//		System.out.println(search(nums, target));
//	}
//	@Test
//	public void example2() {
//		int nums[] = {3,1};
//		int target = 3;
//		System.out.println(search(nums, target));
//	}
//	
//	@Test
//	public void example3() {
//		int nums[] = {5,1,3};
//		int target = 5;
//		System.out.println(search(nums, target));
//	}
//	
//	@Test
//	public void example4() {
//		int nums[] = {1,3,5};
//		int target = 2;
//		System.out.println(search(nums, target));
//	}
////	
//	@Test
//	public void example5() {
//		int nums[] = {5,1,2,3,4};
//		int target = 1;
//		System.out.println(search(nums, target));
//	}
	
	@Test
	public void example6() {
		int nums[] = {4,5,6,7,0,1,2};
		int target = 3;
		System.out.println(search(nums, target));
	}
	
	
	
	/*
	 * public int search(int[] nums, int target) { int mid = findPivot(nums, target,
	 * 0, nums.length); return findIndex(nums, 0, mid, nums.length, target); }
	 * 
	 * private int findIndex(int[] nums, int start, int mid, int end, int target) {
	 * if(start>=nums.length) { return -1; } if (start == end) { if (nums[start] ==
	 * target) return start; else return -1; } if (target >= nums[start] && target
	 * <= nums[mid]) { return findIndex(nums, start, (start + mid) / 2, mid,
	 * target); } else { return findIndex(nums, mid + 1, (mid + end + 1) / 2, end,
	 * target); }
	 * 
	 * }
	 * 
	 * private int findPivot(int nums[], int target, int start, int end) { if (start
	 * == end) { return start; } int mid = (start + end) / 2; if (nums[mid] >
	 * nums[start]) { return findPivot(nums, target, mid, end); } else { return
	 * findPivot(nums, target, start, mid); } }
	 */
	
	private int search(int nums[], int target) {
		return findIndex(nums,0,nums.length-1,target);
	}
//	0,1,2,3,4,5,6
//	4,5,6,7,0,1,2 	3
	private int findIndex(int nums[], int start, int end, int target) {
		if(end - start == 1) {
			if(nums[start]==target)
				return start;
			else if(end>nums.length &&nums[end] == target) {
				return end;
			}else {
				return -1;
			}
		}
		int mid = (start+end)/2;
		if(nums[mid]>=nums[start] && target<=nums[mid] && target>=nums[start]) {
			return bs(nums,start,mid,target);
		}else if(nums[mid]<=nums[end] && target>=nums[mid] && target<=nums[end]) {
			return bs(nums, mid, end, target);
		}else if(nums[start]>nums[mid]){
			return findIndex(nums, start, mid, target);
		}else {
			return findIndex(nums, mid, end, target);
		}
	}
	
	private int bs(int nums[], int start, int end, int target) {
		if(start>=nums.length) {
			return -1;
		}
		if(start == end) {
			if(nums[start] == target)
				return start;
			else
				return -1;
		}
		int mid = (start+end)/2;
		if(target>=nums[start] && target<=nums[mid]) {
			return bs(nums, start, mid, target);
		}else {
			return bs(nums, mid+1, end, target);
		}
	}
	
}
