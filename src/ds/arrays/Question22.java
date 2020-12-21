package ds.arrays;

import java.util.Map;
import java.util.TreeMap;

import org.junit.After;
import org.junit.Test;

public class Question22 {

	/*
	 * Given a string, check if the letters can be rearranged so that two characters
	 * that are adjacent to each other are not the same.
	 */

	@Test//Positive
	public void Example1() {
		String input = "aab";
		rearrange(input);
	}

	@Test//Negative
	public void Example2() {
		String input = "aaab";
		rearrange(input);
	}

	@Test//Positive
	public void Example3() {
		String input = "aaabbbccc";
		rearrange(input);
	}
	
	@Test//negative
	public void Example4() {
		String input = "aaabbbcccc";
		rearrange(input);
	}

	@After
	public void after() {
		System.out.println("==========");
	}

	//Method 1(Time Complexity O[n^2]
	private void rearrange(String input) {
		Map<Character, Integer> map = new TreeMap<>();
		//Adding number of character in the string
		for (int i = 0; i < input.length(); i++) {
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
		}
//		char[] a = new char[input.length()];

		StringBuilder stbld = new StringBuilder();

		//Iterate over map and print each character once and decrease the value of the character by one
		for (int i = 0; i < input.length(); i++) {
			for (Map.Entry<Character, Integer> kv : map.entrySet()) {
				if (kv.getValue() > 0) {
					stbld.append(kv.getKey());
					map.put(kv.getKey(), map.get(kv.getKey()) - 1);
				}
			}
		}

		String finalString = stbld.toString();
		boolean flag = true;
		//To check if we have any adjacent characters
		for (int i = 0; i < finalString.length() - 1; i++) {
			if (finalString.charAt(i) == finalString.charAt(i + 1)) {
				flag = false;
			}
		}

		//print
		if (flag) {
			System.out.println(finalString);

		} else {
			System.out.println("\"\"");
		}

	}

}
