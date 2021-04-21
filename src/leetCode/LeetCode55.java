package leetCode;

import org.junit.Test;

public class LeetCode55 {

//	@Test
//	public void example1() {
//		int arr[] = { 2, 3, 1, 1, 4 };
//		System.out.println(canJump(arr));
//	}

	@Test
	public void example2() {
		int arr[] = {2,3,0,1,4};
		System.out.println(canJump(arr));
	}

	public boolean canJumpFromPosition(int position, int[] nums) {
		if (position == nums.length - 1) {
			return true;
		}

		int furthestJump = Math.min(position + nums[position], nums.length - 1);
		for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
			if (canJumpFromPosition(nextPosition, nums)) {
				return true;
			}
		}

		return false;
	}

	public boolean canJump(int[] nums) {
		return canJumpFromPosition(0, nums);
	}

}
