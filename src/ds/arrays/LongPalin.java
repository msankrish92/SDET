package ds.arrays;

import org.junit.Test;

public class LongPalin {
	
	@Test//Even length
	public void example1() {
		String input = "aaaabbaaaa";
		palindrome(input);
	}

	@Test//two word
	public void example2() {
		String input = "aabc";
		palindrome(input);
	}

	@Test//single word 
	public void example3() {
		String input = "abc";
		palindrome(input);
	}

	@Test//single word
	public void example4() {
		String input = "paypal";
		palindrome(input);
	}

	@Test//odd length
	public void example5() {
		String input = "racecar";
		palindrome(input);
	}
	
	private void palindrome(String input) {
		int startIndex = 0;
		int endIndex = input.length()-1;
		int size = 0;
		while(startIndex<=endIndex) {
			if(input.charAt(startIndex) == input.charAt(endIndex)) {
				size++;
				startIndex++;
				endIndex--;
			}else {
				endIndex--;
				size = 0;
			}
		}
		
		System.out.println(size);
		
	}

}
