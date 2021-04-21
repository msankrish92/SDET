package classRoomAssignment;

import org.junit.Test;

public class IsPalindrome {
	
	/*
	 * Pseudo
	 * [Brute force]
	 * Remove one char
	 * check if it a palindrome or not
	 * 
	 * Optimized
	 * Take two pointers 
	 * one from start
	 * one from end
	 * check if both are same
	 * if the distance is 2 you can return true;
	 * [Not working] 
	 * 
	 * 
	 */

	@Test
	public void example1() {
		String input = "babu";
//		System.out.println(palin(input));
	}
	
	@Test
	public void example2() {
		String input = "aaabbb";
	}
	
	@Test
	public void example3() {
		String input = "abba";
	}
	
//	private boolean palin(String input) {
//		int i = 0;
//		int j = input.length()-1;
//		
//	}
	
}
