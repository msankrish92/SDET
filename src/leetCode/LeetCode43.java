package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode43 {

//	@Test
//	public void example1() {
//		String nums1 = "2";
//		String nums2 = "3";
//		System.out.println(multiply(nums1, nums2));
//	}
//
//	@Test
//	public void example2() {
//		String nums1 = "12";
//		String nums2 = "34";
//		System.out.println(multiply(nums1, nums2));
//	}
//
//	@Test
//	public void example3() {
//		String nums1 = "25";
//		String nums2 = "25";
//		System.out.println(multiply(nums1, nums2));
//	}
	
	@Test
	public void example4() {
		String nums1 = "123";
		String nums2 = "456";
		System.out.println(multiply(nums1, nums2));
	}

	@Test
	public void example5() {
		String nums1 = "999";
		String nums2 = "999";
		System.out.println(multiply(nums1, nums2));
	}

	
	/*
	 * Pseudo
	 * Create an array of length of both the string
	 * Iterate over each char of string one
	 * 	Iterate over each char of string two
	 * 		mul = current char in string two * current char in string two in ascii
	 * 		p1 = i + j + 1;
	 * 		p2 = i + j;
	 * 		sum =  mul + out[p1] to add previous calculated value if any
	 * 		out[p1] = sum % 10 -> to place the left out value remainder
	 * 		out[p2] = (sum/10) + out[p2] -> to add the current carry over to already present value
	 * 
	 * outside the loop
	 * add the array to string builder and return it.
	 */

	public String multiply(String num1, String num2) {
		int out[] = new int[num1.length() + num2.length()];
		for (int i = num1.length() - 1; i >= 0; i--) {
			for (int j = num2.length() - 1; j >= 0; j--) {
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int p1 = i+j+1;
				int p2 = i+j;
				int sum = mul + out[p1];
				out[p1] = sum % 10;
				out[p2] = (sum / 10) + out[p2];
			}
		}
		StringBuilder st = new StringBuilder();
		for (int i = 0; i < out.length; i++) {
			if(!(out[i] == 0 && st.length()==0))
			st.append(out[i]);
		}
		return st.length()==0?"0":st.toString();
	}

}
