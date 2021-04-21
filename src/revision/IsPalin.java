package revision;

import org.junit.Test;

public class IsPalin {

	/*
	 * Given a string, determine if its palindrome constrains - aplhanumeric chars -
	 * ignore the cases
	 * Ask for return type
	 * Consistent
	 * Edge case
	 */
	
	/*
	 * Pseudo[Brute Force-String buffer][Time Complexity O[N]]
	 * Create a stringBuffer variable and pass the input as argument
	 * use inbuild method reverse
	 * and compare it with the input
	 * if it is same 
	 * return true
	 * else
	 * false 
	 */
	
	/*
	 * Pseudo[charArray & swap][Time Complexity[O[N/2]]
	 * Convert the input string
	 * delclare a copy on input string
	 * declare two pointer first and last
	 * while first is lesser than last
	 * create a temp char variable swap first with last in copy
	 * 
	 * 
	 * outside the loop
	 * if input equal to copy return true else false;
	 */
	
	/*
	 * Pseudo[Expand from center][Time complexity[O[n/2]]]
	 * if string length is odd
	 * if string length is even, introduce a character in the middle
	 * mid = start + end/2
	 * left = mid -1 right = mid +1
	 * while(start>=0)
	 * 	if(char at left  != char at right)
	 * 		return false;
	 * 
	 * outside
	 * Special character remove it
	 * return the string
	 */
	
	/*
	 * Pseudo[Recurion][Time Complexity O[n]]
	 * input
	 * 
	 * recursion functio
	 */
	
	
	@Test
	public void example1() {
		String input = "testtset";
		System.out.println(method1(input));
	}
	
	@Test
	public void example2() {
		String input = "testts";
//		System.out.println(method1(input));
		System.out.println(method2(input));
	}
	
	@Test
	public void example3() {
		String input = "testTsET";
//		System.out.println(method1(input));
		System.out.println(method2(input));
	}
	
	@Test
	public void example4() {
		String input = "123TT321";
//		System.out.println(method1(input));
		System.out.println(method2(input));
	}
	
	@Test
	public void example5() {
		String input = "TestTtseT";
		System.out.println(method1(input));
		System.out.println(method2(input));
	}
	
	private boolean method1(String input) {
		StringBuilder str = new StringBuilder(input);
		str.reverse();
		if(input.equalsIgnoreCase(str.toString())) {
			return true;
		}
		return false;
	}
	
	private boolean method2(String input) {
		input = input.toLowerCase();
		int start = 0;
		int end = input.length()-1;
		
		while(start<end) {
			if(input.charAt(start)!=input.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
	
//	private boolean method3(String input) {
////		if(input.length()%2)
//		int []arr = new int[2];
//	}
	

}
