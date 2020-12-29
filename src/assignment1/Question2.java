package assignment1;

import org.junit.Test;

public class Question2 {

	/**
	 * Pseudo Create a char array of size 256 Iterate over the string and add all
	 * the occurance in it Iterate again and find if both the upper and lower case
	 * are present return the last match
	 */

	@Test
	public void example1() {
		String input = "aaabcAbCdD";
		System.out.println(method1(input));
	}

	@Test
	public void example2() {
		String input = "aA";
		System.out.println(method1(input));
	}

	@Test
	public void example3() {
		String input = "abcdE";
		System.out.println(method1(input));
	}
	
	@Test
	public void example4() {
		String input = "AbcBa";
		System.out.println(method1(input));
	}

	private char method1(String input) {
		char out = ' ';
		int chArr[] = new int[256];
		for (int i = 0; i < input.length(); i++) {
			chArr[input.charAt(i)]++;
			if (chArr[input.charAt(i)] == 1 && chArr[input.charAt(i) - 32] == 1
					|| chArr[input.charAt(i)] == 1 && chArr[input.charAt(i) + 32] == 1) {
				if(out<input.charAt(i))
				out = Character.toLowerCase(input.charAt(i));
			}
		}
		out = Character.toUpperCase(out);
		return out;

	}

}
