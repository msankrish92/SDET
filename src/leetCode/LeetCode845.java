package leetCode;

import org.junit.Test;

public class LeetCode845 {
//	https://leetcode.com/problems/longest-mountain-in-array/
	@Test
	public void example() {
		int arr[] = {875,884,239,731,723,685};
		System.out.println(longestMountain(arr));
	}
	
//	@Test
	public void example1() {
		int arr[] = {2,2,2};
		System.out.println(longestMountain(arr));
	}
	
//	@Test
	public void example3() {
		int arr[] = {2,1,4,7,3,2,1,2,1,4,7,3,2,1,0};
		System.out.println(longestMountain(arr));
	}
	
	private int longestMountain(int nums[]) {
//		875,884,239,731,723,685
		boolean goingUp = false;
		boolean goingDown = false;
		int counter = 0;
		int max = 0;
		for(int i = 0; i<nums.length-1; i++) {
			if(nums[i]<nums[i+1] && goingDown == false) {
				goingUp = true;
				counter++;
			}else if(nums[i]>nums[i+1] && goingUp == true) {
				goingDown = true;
				counter++;
			}else if(nums[i]>nums[i+1] && goingUp == false) {
				goingDown = true;
				counter++;
			}else {
				goingDown = false;
				goingUp = false;
				counter = 1;
			}
			if(goingDown== true && goingUp == true) {
				if(counter>max) max = counter;
			}
		}
		return max==0?max:max+1;
	}
	
//	boolean inc = false, dec = false;
//    int mountLen = 1;
//    int output = 0;
//    for (int i = 1; i < in.length; i++) {
//        if(in[i] > in[i-1] && !dec) {
//            mountLen++;
//            inc = true;
//        } else if (in[i] > in[i-1] && dec) {
//            mountLen = 1;
//            inc = true;
//            dec = false;
//        } else if (in[i] < in[i-1] && !inc) {
//            mountLen = 1;
//            inc = false;
//            dec = false;
//        } else if (in[i] < in[i-1] && inc) {
//            mountLen++;
//            dec = true;
//            output = Math.max(output, mountLen);
//        }else if (in[i] == in[i-1] ) {
//            inc = false;
//            dec = false;
//        }    
//    }
//    return output;
	
	
}
