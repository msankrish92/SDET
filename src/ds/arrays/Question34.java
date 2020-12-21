package ds.arrays;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class Question34 {
	
	/* Find the longest palindrome in a given string */

	@Test//Even length
	public void example1() {
		String input = "aaaabbaaaa";
		palindrome(input);
	}
//
//	@Test//two word
//	public void example2() {
//		String input = "aabc";
//		palindrome(input);
//	}
//
//	@Test//single word 
//	public void example3() {
//		String input = "abc";
//		palindrome(input);
//	}
//
//	@Test//single word
//	public void example4() {
//		String input = "paypal";
//		palindrome(input);
//	}

	@Test//odd length
	public void example5() {
		String input = "racecar";
		palindrome(input);
	}

	/*
	 * Method 1 Time Complexity O[N^3] private void palindrome(String str) { int
	 * index = 0; List<String> out = new ArrayList<String>(); for (int i = 0; i <
	 * str.length(); i++) { for (int j = 0; j < str.length() - i; j++) { String temp
	 * = str.substring(j, j + 1 + i);
	 * 
	 * StringBuilder string = new StringBuilder(temp); String string2 =
	 * string.reverse().toString();
	 * 
	 * if (temp.equals(string2)) { out.add(temp); } } } System.out.println(out); int
	 * max = 0; String output = new String(); for (int i = 0; i < out.size(); i++) {
	 * if(out.get(i).length()>max) { output = out.get(i); } }
	 * System.out.println(output); }
	 */

	/*
	 * private void palindrome(String input) {
	 * 
	 * boolean isCharAdded = false; //if the string is even introduce a middle
	 * character if ((input.length() % 2) == 0) { String str1 = input.substring(0,
	 * input.length() / 2); String str2 = input.substring(input.length() / 2,
	 * input.length()); String add = "$"; input = str1.concat(add).concat(str2);
	 * isCharAdded = true; }
	 * 
	 * if (input.length() == 0) {
	 * System.out.println("Input is empty hence no Longest Palindrome"); } else if
	 * (input.length() == 1) {
	 * System.out.println("Longest Palindrome for given input is : " +
	 * input.charAt(0)); } else if (input.length() == 2) { if (input.charAt(0) ==
	 * input.charAt(1))
	 * System.out.println("Longest Palindrome for given input is : " + input); else
	 * System.out.println("Longest Palindrome for given input is : " +
	 * input.charAt(0)); } else { // collecting the unique palindrome from the given
	 * string HashSet<String> uniquePalindrome = new HashSet<String>(); for (int i =
	 * 0; i < input.length(); i++) { int leftIndex = i - 1, rightIndex = i + 1; //
	 * printing the single character
	 * uniquePalindrome.add(String.valueOf(input.charAt(i))); // checking with right
	 * index if (i != input.length() - 1) { if (input.charAt(i) ==
	 * input.charAt(rightIndex)) { uniquePalindrome.add(input.substring(i, i + 2));
	 * // leftIndex=i; } } // checking right and left index while (leftIndex >= 0 &&
	 * rightIndex < input.length()) { if (input.charAt(leftIndex) !=
	 * input.charAt(rightIndex)) break;
	 * uniquePalindrome.add(input.substring(leftIndex, rightIndex + 1));
	 * leftIndex--; rightIndex++; } }
	 * 
	 * String longestPalindrome = ""; Iterator<String>
	 * uniquePalindromHashSetIterator = uniquePalindrome.iterator(); while
	 * (uniquePalindromHashSetIterator.hasNext()) { String currentPalindrome =
	 * String.valueOf(uniquePalindromHashSetIterator.next()); if
	 * (longestPalindrome.length() < currentPalindrome.length()) longestPalindrome =
	 * currentPalindrome; } if (isCharAdded) { longestPalindrome =
	 * longestPalindrome.replace("$", ""); }
	 * System.out.println("Longest Palindrome for given input is : " +
	 * longestPalindrome.length()); }
	 * 
	 * }
	 */
	
	public void palindrome(String input) {
		List<String> palinList = new ArrayList<String>();
		int left = 0;
		int right = 0;
		
		if(input.length()%2==0) {
			input = input.substring(0, input.length()/2) + "$" + input.substring(input.length()/2, input.length());
		}
		
		for (int i = 0; i < input.length(); i++) {
			left = i-1;
			right = i + 1;
			palinList.add(input.substring(i,i+1));
			if(left>=0 && input.charAt(left) == input.charAt(i)) {
				palinList.add(input.substring(left, i+1).replace("$", ""));
			}
			if(right<input.length() && input.charAt(right) == input.charAt(i)) {
				palinList.add(input.substring(i, right+1).replace("$", ""));
			}
			while(left>=0 && right<input.length()  && input.charAt(left)==input.charAt(right)) {
				palinList.add(input.substring(left, right+1).replace("$", ""));
				left--;
				right++;
			}
		}
		System.out.println(palinList);
	
	}

}
