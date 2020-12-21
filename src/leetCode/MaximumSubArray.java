package leetCode;

import org.junit.Test;

public class MaximumSubArray {

	@Test
	public void example() {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(method1(arr));
	}
	
	@Test
	public void example1() {
		int arr[] = {1};
		System.out.println(method1(arr));
	}
	
	@Test
	public void example2() {
		int arr[] = {-2,1};
		System.out.println(method1(arr));
	}
	
	private int method1(int nums[]) {
		 int i = 0;
		 int currentMax = 0;
		 int max = Integer.MIN_VALUE;
		 while(i<nums.length) {
			 currentMax += nums[i];
			 if(currentMax<0) {
				 currentMax = 0;
			 }
			 i++;
			 max = Math.max(currentMax, max);
		 }
		 return max;
	}
	
}
