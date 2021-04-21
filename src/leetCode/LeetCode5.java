package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class LeetCode5 {

	/*
	 * Failed Introducing a variable only in the middle will not work Because if you
	 * have Longest palindrome which is not formed with out this. Example: Input:
	 * "babaddtattarrattatddetartrateedredividerb" Output: "etartrate" Expected:
	 * "ddtattarrattatdd"
	 */

//	@Test
//	public void example() {
//		String input = "babad";
//		System.out.println(method4(input));
//	}
//
//	@Test
//	public void example2() {
//		String input = "cbbd";
//		System.out.println(method4(input));
//	}
//
//	@Test
//	public void example3() {
//		String input = "ac";
//		System.out.println(method4(input));
//	}
//
//	@Test
//	public void example4() {
//		String input = "adam";
//		System.out.println(method4(input));
//	}
//	@Test
//	public void example5() {
//		String input = "aaaa";
//		System.out.println(method4(input));
//	}
//	@Test
//	public void example6() {
//		String input = "caba";
//		System.out.println(method4(input));
//	}
//	
//	@Test
//	public void example7() {
//		String input = "eabcb";
//		System.out.println(method4(input));
//	}
	
	@Test
	public void example8() {
		String input = "abcba";
		System.out.println(method4(input));
	}

	private String method1(String input) {

		Set<String> allSubString = new HashSet<String>();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i; j < input.length(); j++) {
				str.append(input.charAt(j));
				allSubString.add(str.toString());
			}
			str.setLength(0);
		}
		Set<String> palinList = new HashSet<String>();
		Iterator<String> it = allSubString.iterator();
		while (it.hasNext()) {
			String temp = it.next();
			if (temp.equals(new StringBuilder(temp).reverse().toString())) {
				palinList.add(temp);
			}
		}
//		System.out.println(allSubString);
//		System.out.println(palinList);
		return Collections.max(palinList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});
	}

	private String method2(String input) {

		int start = 0;
		int end = 0;
		int length = 0;
		for (int i = 0; i < input.length(); i++) {
			int length1 = expandAroundCenter(input, i, i);
			int length2 = expandAroundCenter(input, i, i + 1);
			length = Math.max(length1, length2);
			if (length > end - start) {
				start = i - (length / 2);
				end = i + length / 2;
			}
		}
		return input.substring(start, end + 1);
	}

	private int expandAroundCenter(String input, int l, int r) {

		while (l >= 0 && r < input.length() && input.charAt(l) == input.charAt(r)) {
			l--;
			r++;
		}

		return r - l - 1;
	}

	private String method3(String input) {
		int maxLength = 0;
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < input.length() - i; j++) {
				String temp = isPalin(input.substring(j, j + i + 1));
				if (maxLength < temp.length()) {
					maxLength = temp.length();
					output = temp;
				}
			}
		}
		return output;
	}

	private String isPalin(String input) {
		if (input.length() % 2 == 0) {
			input = input.substring(0, input.length() / 2) + "$" + input.substring(input.length() / 2, input.length());
		}
		boolean flag = true;
		int left = input.length() / 2 - 1;
		int right = input.length() / 2 + 1;
		while (left >= 0) {
			if (input.charAt(left--) != input.charAt(right++)) {
				flag = false;
				break;
			}
		}

		if (flag) {
			if (input.contains("$")) {
				input = input.replace("$", "");
			}
			return input;
		}
		return "";
	}

	private String method4(String input) {
//		int maxLength = 0;
		String output = "";
		int table[][] = new int[input.length()][input.length()];
		for (int i = 0; i < table.length; i++) {
			table[i][i] = 1;
			output = input.substring(i,i+1);
		}

		for (int i = 0; i < table.length-1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				table[i][i + 1] = 1;
				output = input.substring(i, i+2);
			}
		}
//		abcba
		for (int i = 2; i < table.length; i++) {
			for (int j = 0; j < table.length - i; j++) {
				String temp = "";
				boolean flag = true;
				if (input.charAt(j) == input.charAt(j+i)) {
					int left = j;
					int right = i+j;
//					while (++left < --right) {
						if (table[left][right] != 1) {
							flag = false;
							temp = "";
							break;
//						}
					}
				}else {
					flag = false;
				}
				if(flag) {
					temp = input.substring(j,i+j+1);
					if(temp.length()>output.length()) {
						output = temp;
					}
					table[j][i+j] = 1;
				}
			}
		}

		return output;
	}

}
