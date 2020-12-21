package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MinimumWindowSubstring {

//	@Test
//	public void example1() {
//		String input = "ADOBECODEBANC";
//		String target = "ABC";
//		minimumWindowSubstring(input, target);
//	}
	@Test
	public void example1() {
		String input = "YZBCAF";
		String target = "AB";
		minimumWindowSubstring(input, target);
	}

//	@Test
//	public void example2() {
//		String input = "Sanjay";
//		String target = "aajy";
//		minimumWindowSubstring(input, target);
//	}
//	
//	@Test
//	public void example3() {
//		String input = "Sanjay";
//		String target = "xzy";
//		minimumWindowSubstring(input, target);
//	}
//	Method 1(Time Complexity O[N^2]

	/*
	 * private void minimumWindowSubstring(String input, String target) { int min =
	 * Integer.MAX_VALUE; int index = 0; List<String> list = new
	 * ArrayList<String>(); list.add(""); for (int i = 0; i < input.length(); i++) {
	 * list.add(input.substring(i, i + 1)); for (int j = i + 1; j < input.length();
	 * j++) { list.add(input.substring(i, j + 1)); } }
	 * 
	 * System.out.println(list);
	 * 
	 * for (int i = 0; i < list.size(); i++) { String temp = list.get(i); int count
	 * = 0; for (int j = 0; j < target.length(); j++) { if
	 * (temp.contains(target.substring(j, j + 1))) { temp =
	 * temp.replaceFirst(target.substring(j, j + 1), ""); count++; } } if (count ==
	 * target.length()) { if (min > temp.length()) { min = temp.length(); index = i;
	 * } } }
	 * 
	 * System.out.println(list.get(index)); }
	 */

	/*
	 * private void minimumWindowSubstring(String input, String target) {
	 * 
	 * int[] charAtLocation = new int[256]; for (int i = 0; i < target.length();
	 * i++) { charAtLocation[target.charAt(i)]++; }
	 * 
	 * int i = 0; int j = 0; int min = Integer.MAX_VALUE; int count = 0; String
	 * minString = new String(); for (j = 0; j < input.length(); j++) { if
	 * (--charAtLocation[input.charAt(j)] >= 0) { count++; } while (count ==
	 * target.length()) { int temp = j - (i - 1); if (min > temp) { min = temp;
	 * minString = input.substring(i, j + 1); } if
	 * (++charAtLocation[input.charAt(i)] > 0) { count--;
	 * 
	 * } i++; } }
	 * 
	 * System.out.println(min); System.out.println(minString);
	 * 
	 * }
	 */

	private void minimumWindowSubstring(String input, String target) {
		int[] charAtLocation = new int[256];
		for (int i = 0; i < target.length(); i++) {
			charAtLocation[target.charAt(i)]++;
		}

		int i = 0;
		int j = 0;
		int min = Integer.MAX_VALUE;
		int count = 0;
		String minString = new String();
		for (j = 0; j < input.length(); j++) {
			
			
			if (--charAtLocation[input.charAt(j)] >= 0) {
				count++;
			}
			while (count == target.length()) {
				int temp = j - (i - 1);
				if (min > temp) {
					min = temp;
					minString = input.substring(i, j + 1);
				}
				if (++charAtLocation[input.charAt(i)] > 0) {
					count--;

				}
				i++;
			}
		}

		System.out.println(min);
		System.out.println(minString);
	}

}