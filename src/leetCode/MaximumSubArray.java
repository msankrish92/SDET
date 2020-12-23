package leetCode;

import org.junit.Test;

public class MaximumSubArray {

	@Test
	public void example() {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(method2(arr));
	}
	
	@Test
	public void example1() {
		int arr[] = {1};
		System.out.println(method2(arr));
	}
	
	@Test
	public void example2() {
		int arr[] = {-2,1};
		System.out.println(method2(arr));
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
	
	private int method2(int[] s) //11
	{
//		int res = 0, sum = 0;
		
		return recurse(s, 0, s.length-1);
		
	}

	
    private int recurse(int[] s, int left,int right) 
    {
    	if(right == left) 
    	{
    		return s[left];
    	}
    	
    	int mid = (left + right)/2;

    	int l = recurse(s, left, mid);//left=>0, mid =311
    	int r = recurse(s, mid+1, right);
    	int m = recurseMid(s,left,mid,right);// 20
    	return Math.max(Math.max(l,r), m);
    }

	private int recurseMid(int[] s, int left, int mid, int right) 
	{
		int leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE;
		int sum = 0, sum1 = 0;
		
		for (int i = mid; i >= left; i--) 
		{
			sum+=s[i];
			if(sum > leftSum) leftSum = sum;
		}
		
		for (int i = mid+1; i <= right; i++) 
		{
			sum1+=s[i];
			if(sum1 > rightSum) rightSum = sum1;
		}
		
		return leftSum+rightSum;
	}
}
