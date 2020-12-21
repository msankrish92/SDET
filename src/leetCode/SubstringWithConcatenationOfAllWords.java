package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {

	public static void main(String[] args) {
		String s = "barfoothefoobarman";
		String[] words = { "foo", "bar" };
		findSubstring(s,words);
	}

	public static List<Integer> findSubstring(String s, String[] words) {
		StringBuilder concat = new StringBuilder(Arrays.toString(words));
		int lengthOfWords = concat.length();
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < s.length() && i + lengthOfWords < s.length(); i++) {
			boolean flag = false;
			String temp = s.substring(i, lengthOfWords + 1);
			if (temp.equals(concat.toString()) || temp.equals(concat.reverse().toString()))
				flag = true;
			if (flag) {
				lst.add(i);
			}
		}
		return lst;
	}
}
