package ds.arrays;

import java.util.Arrays;

import org.junit.After;
import org.junit.Test;

public class Question20 {

	@Test
	public void example1() {
		String input = "I am doing great";
		stringReverse(input);

	}

	@Test
	public void example2() {
		String input = "madam";
		stringReverse(input);

	}

	@Test
	public void example3() {
		String input = " I am doing great";
		stringReverse(input);

	}

	@Test
	public void example4() {
		String input = "I am doing  great ";
		stringReverse(input);

	}

	@After
	public void after() {
		System.out.println();
	}

	// Method 1(Time complexity(0[n^2]
	// private void stringReverse(String input) {
	// int lastSpaceIndex = 0;
	// for (int i = 0; i <= input.length(); i++) {
	// if(i == input.length()) {
	// int temp = i-1;
	// while(temp >=lastSpaceIndex) {
	// System.out.print(input.charAt(temp));
	// temp--;
	// }
	// }else if (input.charAt(i) == ' ') {
	// lastSpaceIndex = i;
	// for (int j = i-1; j >=0 && input.charAt(j) != ' '; j--) {
	// System.out.print(input.charAt(j));
	// }
	// System.out.print(" ");
	// }
	// }
	// }

	//Method 2(Time complexity O[n]
	private void stringReverse(String input) {
		String[] split = input.split(" ");

		for (int j = 0; j < split.length; j++) {
			StringBuilder strbld = new StringBuilder(split[j]);
			split[j] = strbld.reverse().toString();
		}
		System.out.println(Arrays.toString(split).replaceAll(",", ""));

	}

}
