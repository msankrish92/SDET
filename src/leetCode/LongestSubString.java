	package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubString {

	@Test
	public void example1() {
		String input = "aabbcc";
		longSubString(input);
	}

//	@Test
//	public void example2() {
//		String input = "abcabcbb";
//		longSubString(input);
//	}

//	@Test
//	public void example3() {
//		String input = "aaaaaa";
//		longSubString(input);
//	}

//	Method 1[Time Complexity O[N^3]
	/*
	 * private void longSubString(String input) { List<String> lst = new
	 * ArrayList<String>();
	 * 
	 * for (int i = 0; i < input.length(); i++) {
	 * 
	 * for (int j = i + 1; j < input.length(); j++) { lst.add(input.substring(i,
	 * j)); } } System.out.println(lst); List<String> lstOut = new
	 * ArrayList<String>(); for (int i = 0; i < lst.size(); i++) { String temp =
	 * lst.get(i); boolean flag = true; for (int j = 0; j < temp.length(); j++) {
	 * int count = 0; for (int j2 = 0; j2 < temp.length(); j2++) { if
	 * (temp.charAt(j) == temp.charAt(j2)) { count++; if (count > 1) { flag = false;
	 * }
	 * 
	 * } } } if (flag) { lstOut.add(lst.get(i)); } }
	 * 
	 * int max = 0; for (int i = 0; i < lstOut.size(); i++) { if
	 * (lstOut.get(i).length() > max) { max = lstOut.get(i).length(); }
	 * 
	 * } System.out.println(lstOut); System.out.println(max); }
	 */

	// Method (Time Complexity O[N^2])
	/*
	 * private void longSubString(String input) { int max = 0; for (int i = 0; i <
	 * input.length(); i++) { Set<Character> st = new HashSet<Character>();
	 * st.add(input.charAt(i));
	 * 
	 * for (int j = i + 1; j < input.length(); j++) { if (st.add(input.charAt(j))) {
	 * st.add(input.charAt(j)); } else { if (max < st.size()) { max = st.size(); }
	 * break; } } } System.out.println(max); }
	 */

	private void longSubString(String input) {

		int[] allChar = new int[256];
		int i = 0;
		int j = 0;
		int max = 0;
		String log = new String();
		for (j = 0; j < input.length(); j++) {
			if (allChar[input.charAt(j)] + 1 < 2) {
				allChar[input.charAt(j)]++;
			} else {
				while (allChar[input.charAt(j)] + 1 >= 2) {
					int temp = j - (i + 1);
					if (temp > max) {
						max=temp;
						log = input.substring(i, j);
					}
					--allChar[input.charAt(j)];
					i++;
				}
				++allChar[input.charAt(j)];
			}
		}
		System.out.println(log);

	}

	/*
	 * private void longSubString(String input) { int a = 0; int b = 0; int max = 0;
	 * Set<Character> st = new HashSet<>();
	 * 
	 * while (b < input.length()) { if (!(st.contains(input.charAt(b)))) {
	 * st.add(input.charAt(b)); b++; max = Math.max(st.size(), max); } else {
	 * st.remove(input.charAt(a)); a++; } }
	 * 
	 * System.out.println(max);
	 * 
	 * }
	 */
}
