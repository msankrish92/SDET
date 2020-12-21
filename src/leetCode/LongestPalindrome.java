package leetCode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LongestPalindrome {

	@Test
	public void example1() {
		String s = "babad";
		longestPalindrome(s);
	}
	@Test
	public void example2() {
		String s = "cbbd";
		longestPalindrome(s);
	}
//	@Test
//	public void example3() {
//		
//	}

	public String longestPalindrome(String s) {
		List<String> sub = new ArrayList<String>();
		sub.add(s.substring(0, 1));
		int left = 0;
		int right = 0;
		int i = 1;
		while (right < s.length()) {
			left = i-1;
			right = i+1;
			
			if (left >= 0 && s.charAt(left) == s.charAt(i)) {
				sub.add(s.substring(left, i + 1));
			}
			if (i < s.length() && right < s.length() && s.charAt(right) == s.charAt(i)) {
				sub.add(s.substring(i, right + 1));
			}
			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
				sub.add(s.substring(left, right + 1));
				left--;
				right++;
			}
			i++;
		}

		int index = 0;
		int max = 0;
		for (int j = 0; j < sub.size(); j++) {
			if(sub.get(j).length()>max) {
				max = sub.get(j).length();
				index = j;
			}
		}
		
		System.out.println(sub.get(index));
		
		return "";

	}

}
