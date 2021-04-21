package revision;

import org.junit.Test;

public class PalinInd {

	/*
	 * Pseudo[Brute Force][Time complexity O[n^2]  
	 * Iterate over the array 
	 * 	iterate over the array 
	 * String = out array value + inner value 
	 * check for palin 
	 * if true print it in the console
	 * 
	 * 
	 * outside the loop return list
	 */

	@Test
	public void example1() {
		String input[] = { "bat", "ball", "tab" };
		method1(input);
		System.out.println();
	}

	@Test
	public void example2() {
		String input[] = { "hey", "lehe", "l", "eh" };
		method1(input);
		System.out.println();
	}

	@Test
	public void example3() {
		String input[] = { "aba", "" };
		method1(input);
		System.out.println();
	}

	@Test
	public void example4() {
		String input[] = { "abc", "def" };
		method1(input);
		System.out.println();

	}

	private void method1(String input[]) {

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (i != j) {
					String sb = new String(input[i] + input[j]);
					StringBuilder sbRev = new StringBuilder(sb);
					if (sb.equals(sbRev.reverse().toString())) {
						System.out.println(i + "," + j);
					}
				}
			}
		}

	}

}
