package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode16 {

//	@Test
//	public void example1() {
//		int nums[] = { -1, 2, 1, -4 };
//		int k = 3;
//		int target = 1;
////		method1(nums, k, target);
//		method2(nums, target);
//	}
	
	@Test
	public void example2() {
		int nums[] = {-1,2,1,-4,3};
		int k = 3;
		int target = 1;
//		method1(nums, k,target);
		method2(nums, target);
	}
//	
//	@Test
//	public void example3() {
//		int nums[] = {1,1,1,0};
//		int k = 3;
//		int target = -100;
//		method1(nums, k,target);
//	}
//	
//	@Test
//	public void example4() {
//		int nums[] = {0,2,1,-3};
//		int k = 3;
//		int target = 1;
//		method1(nums, k,target);
//	}
//	
//	@Test
//	public void example5() {
//		int nums[] = {1,1,-1,-1,3};
//		int k = 3;
//		int target = -1;
//		method1(nums, k,target);
//	}
//
//	@Test
//	public void example6() {
//		int nums[] = { -1, 0, 1, 1, 55 };
//		int k = 3;
//		int target = 3;
//		method1(nums, k, target);
//	}

//	@Test
//	public void example7() {
//		int nums[] = { 1, 1, 1, 0 };
//		int k = 3;
//		int target = -100;
//		method1(nums, k, target);
//	}

//	@Test
//	public void example7() {
//		int nums[] = { -3, -2, -5, 3, -4 };
//		int k = 3;
//		int target = -1;
//		method1(nums, k, target);
//	}

	int min = Integer.MAX_VALUE;
	int lastDist = Integer.MAX_VALUE;

	private void method1(int input[], int k, int target) {
		rec(input, k, 0, 0, target);
		System.out.println(min);
	}

	private void rec(int input[], int k, int start, int cur, int target) {
		if (lastDist == 0)
			return;
		if (k == 0) {
			if (target == cur) {
				lastDist = 0;
				min = cur;
//			} else if (target > cur) {
//				if (lastDist > target - cur && lastDist != 0) {
//					lastDist = Math.abs(Math.abs(target) - Math.abs(cur));
//					min = cur;
//				}
//			} else {
//				if (lastDist > cur - target && lastDist != 0) {
////					lastDist = Math.abs(Math.abs(target) - Math.abs(cur));
//					
//					if (cur < 0)
//						lastDist = Math.abs(target) + Math.abs(cur);
//					else
//						lastDist = Math.abs(Math.abs(target) - Math.abs(cur));
//					min = cur;
//				}
//			}
			} else if (target > 0 && cur > 0 || target < 0 && cur < 0) {
				if (Math.abs(target) > Math.abs(cur) && lastDist > Math.abs(target) - Math.abs(cur)) {
					lastDist = Math.abs(target) - Math.abs(cur);
					min = cur;
				} else if (lastDist > Math.abs(Math.abs(target) - Math.abs(cur))) {
					lastDist = Math.abs(cur) - Math.abs(target);
					min = cur;
				}
			} else if (lastDist > Math.abs(target) + Math.abs(cur)) {
				lastDist = Math.abs(target) + Math.abs(cur);
				min = cur;
			}
			return;
		}
		for (int i = start; i < input.length; i++) {
			cur = cur + input[i];
			rec(input, --k, i + 1, cur, target);
			++k;
			cur = cur - input[i];
		}
	}

//	-1, 2, 1, -4 	3
	private void method2(int nums[], int target) {
		int closest = Integer.MAX_VALUE;
		Arrays.sort(nums);
		int curr = 0;
		int min = 0;
		for (int i = 0; i < 3; i++) {
			curr += nums[i];
		}
//		closest = curr;
		if (target == curr) {
			closest = 0;
			min = curr;
			return;
		} else if (target > 0 && curr > 0 || target < 0 && curr < 0) {
			if (Math.abs(target) > Math.abs(curr) && closest > Math.abs(target) - Math.abs(curr)) {
				closest = Math.abs(target) - Math.abs(curr);
				min = curr;
			} else if (closest > Math.abs(Math.abs(target) - Math.abs(curr))) {
				closest = Math.abs(curr) - Math.abs(target);
				min = curr;
			}
		} else if (closest > Math.abs(target) + Math.abs(curr)) {
			closest = Math.abs(target) + Math.abs(curr);
			min = curr;
		}
		for (int i = 3; i < nums.length; i++) {
			curr = curr - nums[i - 3];
			curr = curr + nums[i];
			if (target == curr) {
				closest = 0;
				min = curr;
				break;

			} else if (target > 0 && curr > 0 || target < 0 && curr < 0) {
				if (Math.abs(target) > Math.abs(curr) && closest > Math.abs(target) - Math.abs(curr)) {
					closest = Math.abs(target) - Math.abs(curr);
					min = curr;
				} else if (closest > Math.abs(Math.abs(target) - Math.abs(curr))) {
					closest = Math.abs(curr) - Math.abs(target);
					min = curr;
				}
			} else if (closest > Math.abs(target) + Math.abs(curr)) {
				closest = Math.abs(target) + Math.abs(curr);
				min = curr;
			}
		}
		System.out.println(min);
	}

}
