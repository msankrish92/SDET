package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacters {

//	@Test
//	public void example() {
//		String s = "abcabcbb";
//		method1(s);
//	}
//	@Test
//	public void example1() {
//		String s = "bbbb";
//		method1(s);
//	}

	@Test
	public void example2() {
		String s = " ";
		method1(s);
	}

//	private void method1(String s) {
//		Set<Character> set = new HashSet<>();
//		int i = 0;
//		int j = 0;
//		int maxCount = 0;
//		while (j < s.length()) {
//			if (set.add(s.charAt(j))) {
//				j++;
//			} else {
//				if (set.size() > maxCount) {
//					maxCount = set.size();
//				}
//				set.remove(s.charAt(i));
//				i++;
//			}
//		}
//
//		System.out.println(maxCount);
//	}

	/*
	 * private void method1(String s) { int charArr[] = new int[256];
	 * 
	 * int j = 0; int maxCount = 0; Arrays.fill(charArr, -1); while (j < s.length())
	 * { if (charArr[s.charAt(j)] >= 0) { int size = j - charArr[s.charAt(j)];
	 * maxCount = Math.max(maxCount, size);
	 * 
	 * } charArr[s.charAt(j)] = j; j++;
	 * 
	 * } System.out.println(maxCount); }
	 */

	private void method1(String s) {
		int i = 0;
		int j = 0;
		int max = 0;
		int charArr[] = new int[256];

		while (j < s.length()) {
			if (charArr[s.charAt(j)] == 0) {
				charArr[s.charAt(j)]++;
				j++;
			} else if (charArr[s.charAt(j)] > 0) {
				max = Math.max(max, j - i);
				charArr[s.charAt(i)]--;
				charArr[s.charAt(j)]++;
				i++;
				j++;
			}
		}
		System.out.println(max);
	}

}
