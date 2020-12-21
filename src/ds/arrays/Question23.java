package ds.arrays;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Question23 {
	
	/*
	 * Given two strings s1 and s2, write a function to return true if s2 contains
	 * the permutation of s1. In other words, one of the first string's permutations
	 * is the substring of the second string.
	 */

	@Test
	public void example1() {
		String str1 = "ab";
		String str2 = "eidbaooo";
		System.out.println(permutationMatch(str1, str2));
		
	}
	
//	@Test
//	public void example2() {
//		String str1 = "ab";
//		String str2 = "eidbcaooo";
//		System.out.println(permutationMatch(str1, str2));
//		
//	}
//	
//	@Test
//	public void example3() {
//		String str1 = "abcdefg";
//		String str2 = "eidbc";
//		System.out.println(permutationMatch(str1, str2));
//		
//	}
//	
//	@Test
//	public void example4() {
//		String str1 = "abcd";
//		String str2 = "eidbcacdb";
//		System.out.println(permutationMatch(str1, str2));
//		
//	}

	// Method 1 
//	private boolean permutationMatch(String str, String str1) {
//	int ns = str.length();
//	int np = str1.length();
//	//if String 1 length is greater than string 2 throw exception
//	if (ns > np) {
//		throw new RuntimeException("The count of the perumutation is greater than string");
//	}
//
//		List<String> temp = new ArrayList<String>();
//		//To get all the permutations possible from the string
//		List<String> strPer = permute(str, 0, str.length() - 1, temp);
//		System.out.println(strPer);
//		//To find the perumation that matches with second String
//		return findPerumate(str1,strPer);
//
//	}
//
//	public static List<String> permute(String str, int l, int r, List<String> output) {
//
//		if (l == r) {
//			output.add(str);
//		} else {
//			for (int i = l; i <= r; i++) {
//				//To swap
//				str = swap(str, l, i);
//				//To Make one element fixed
//				permute(str, l + 1, r, output);
//				//return back to orignal String
//				str = swap(str, l, i);
//			}
//		}
//		return output;
//	}
//	
//	//To Swap
//	public static String swap(String str, int i, int j) {
//		char temp;
//		char[] charArray = str.toCharArray();
//		temp = charArray[i];
//		charArray[i] = charArray[j];
//		charArray[j] = temp;
//		return String.valueOf(charArray);
//	}
//	
//	//to Find perumation in the given string by comparing it against all the perumation
//	public static boolean findPerumate(String str, List<String> allPermuteList) {
//		for (int i = 0; i < allPermuteList.size(); i++) {
//			for (int j = 0; j < str.length()-allPermuteList.get(i).length(); j++) {
//				if(allPermuteList.get(i).trim().equals(str.substring(j, j+allPermuteList.get(i).length()))) {
//					
//					return true;
//				}
//			}
//		}
//		return false;
//	}

	
	//Method 2(Time Complexity O[N]
	private boolean permutationMatch(String str1, String str2) {
		int ns = str1.length();
		int np = str2.length();

		if (ns > np) {
			throw new RuntimeException("The count of the perumutation is greater than string");
		}

		Map<Character, Integer> pCount = new HashMap<Character, Integer>();
		Map<Character, Integer> sCount = new HashMap<Character, Integer>();

		char[] pchars = str1.toCharArray();
//		To store each character in map with occurrence as value
		for (int i = 0; i < pchars.length; i++) {
			pCount.put(pchars[i], pCount.getOrDefault(pchars[i], 0) + 1);
		}
		System.out.println(pCount);
//		To iterate over longer String to find the match
		for (int i = 0; i < np; i++) {
			char ch = str2.charAt(i);
			//will be added untill the length is less than str1
			sCount.put(ch, sCount.getOrDefault(ch, 0) + 1);

			//waits untill I is greater than ns i.e., size of str1
			if (i >= ns) {
				ch = str2.charAt(i-ns);
				//If that Charater has only one has a value it will be removed
				if(sCount.get(ch) == 1) {
					sCount.remove(ch);
				//Else the value will be decreased by one					
				}else {
					sCount.put(ch, sCount.get(ch)-1);
				}
			}
			//If the pcount and scount equals return it
			if(pCount.equals(sCount)) {
				return true;
			}
		}
		return false;
	}

}
