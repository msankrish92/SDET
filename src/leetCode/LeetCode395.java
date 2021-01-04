package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LeetCode395 {

	/**
	 * Pseudo Loop through the input string Get the count of unique characters Loop
	 * through those many times with loop count as unique character count If any
	 * addition character is found start removing from the start If unquie count
	 * matches the current Unique court and countK equal to k return Max
	 */

//	@Test
//	public void example1() {
//		String input = "aabbbca";
//		int k = 3;
//		System.out.println(longestSubString(input, k));
//	}
//
//	@Test
//	public void example2() {
//		String input = "bbaaacbd";
//		int k = 3;
//		System.out.println(longestSubString(input, k));
//	}
//
//	@Test
//	public void example3() {
//		String input = "aaabbbbccccddd";
//		int k = 5;
//		System.out.println(longestSubString(input, k));
//	}
//
//	@Test
//	public void example4() {
//		String input = "ababacb";
//		int k = 3;
//		System.out.println(longestSubString(input, k));
//	}

	@Test
	public void example5() {
		String input = "aabbbcd";
		int k = 3;
		System.out.println(longestSubString(input, k));
	}

//	aabbbca
	/*
	 * public int longestSubString(String s, int k) { int uniqueCharCount[] = new
	 * int[26]; int uniqueChar = 0; for (int i = 0; i < s.length(); i++) {
	 * if(uniqueCharCount[s.charAt(i) - 'a'] == 0) { uniqueCharCount[s.charAt(i) -
	 * 'a']++; uniqueChar++; } } int max = 0; for(int currentUnique = 1;
	 * currentUnique<=uniqueChar; currentUnique++) { int charCount[] = new int[26];
	 * int unique = 0; int countTok = 0; int windowStart = 0; int windowEnd = 0;
	 * 
	 * while(windowEnd<s.length()) { if(unique<=currentUnique) {
	 * if(charCount[s.charAt(windowEnd) - 'a'] == 0) unique++;
	 * charCount[s.charAt(windowEnd) - 'a']++; if(charCount[s.charAt(windowEnd) -
	 * 'a'] == k) countTok++; windowEnd++; }else {
	 * if(charCount[s.charAt(windowStart) - 'a'] == k) countTok--;
	 * charCount[s.charAt(windowStart) - 'a']--; if(charCount[s.charAt(windowStart)
	 * - 'a'] == 0) { unique--; } windowStart++; } if(countTok == unique && unique
	 * == currentUnique) { max = Math.max(windowEnd-windowStart, max); } } } return
	 * max; }
	 */

	public int longestSubString(String s, int k) {
		return longestSubstringUtil(s, 0, s.length(), k);
	}
	public int longestSubstringUtil(String s, int start, int end, int k) {
		int ch[] = new int[26];
		for(int i = start; i < end; i++) {
			ch[s.charAt(i) - 'a']++;
		}
		for(int i = start; i<end; i++) {
			if(ch[s.charAt(i) - 'a']>=k)
				continue;
			int mid = i+1;
			while (mid < end && ch[s.charAt(mid) - 'a'] < k) 
				mid++;
			return Math.max(longestSubstringUtil(s,start, i,k), longestSubstringUtil(s, mid, end, k));
		}
		return end - start;
	}
}
