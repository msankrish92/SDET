package leetCode;

import org.junit.Test;

public class LeetCode3 {
	
	/*Pseudo
	 * Declare a int array of 256
	 * Declare two pointers i and j and max
	 * While j < input.lenght()
	 * if in int array char at j < 0
	 * 	increment it 
	 * 	increment j
	 * 	calculate max
	 * if in int array char at j > 0
	 * 	decrement chat at i in int array
	 * 	increment i
	 * 
	 * 
	 * outside the loop return max
	 */

//	@Test
//	public void example1() {
//		String s = "abcabcbb";
//		System.out.println(method1(s));
//	}
//	
//	@Test
//	public void example2() {
//		String s = "bbbbb";
//		System.out.println(method1(s));
//	}
//	
//	@Test
//	public void example3() {
//		String s = "pwwkew";
//		System.out.println(method1(s));
//	}
	
	@Test
	public void example4() {
		String s = "abba";
		System.out.println(method2(s));
	}

	private int method1(String s) {
		if (s.length() == 1) {
			return 1;
		}

		int charArray[] = new int[256];
		int i = 0;
		int j = 0;
		int max = 0;
		while (j < s.length()) {
			if (charArray[s.charAt(j)] == 0) {
				charArray[s.charAt(j)]++;
				j++;
				max = Math.max(max, j - i);
			} else if (charArray[s.charAt(j)] > 0) {
				max = Math.max(max, j - i);
				charArray[s.charAt(i)]--;
				i++;
			}
		}

		return max;

	}
	
	/*
	 * Pseudo
	 * Convert the given string into character array
	 * Declare start = 0; maxLength = 1
	 * in for loop start from 1(end) to array length
	 * 	in inner for loop start from start value to end -> This loop check all the inbetween values with the value being added
	 * 		if(char at start == char at end)
	 * 			start = i + 1 
	 * 			break
	 * 	calculate max length
	 * 
	 * return max length
	 */

	private int method2(String s) {
		char[] chars = s.toCharArray();
		if (s.length() <= 1) {
			return s.length();
		}

		int maxLen = 1;
		int start = 0;

		for (int end = 1; end < s.length(); end++) {
			for (int i = start; i < end; i++) {
				if (chars[i] == chars[end]) {
					start = i + 1;
					break;
				}
			}
			maxLen = Math.max(maxLen, end - start + 1);
		}

		return maxLen;
	}
}
