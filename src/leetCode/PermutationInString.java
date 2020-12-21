package leetCode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class PermutationInString {

	@Test
	public void example1() {
		String s1 = "ab";
		String s2 = "eidbaooo";
		permutationInString(s2, s1);
	}

	@Test
	public void example2() {
		String s1 = "abd";
		String s2 = "eidbaooo";
		permutationInString(s2, s1);
	}

	/*
	 * private void permutationInString(String s, String t) { int windowLength =
	 * t.length();
	 * 
	 * Map<Character, Integer> compareMap = new HashMap<>(); for (int i = 0; i <
	 * t.length(); i++) { compareMap.put(t.charAt(i),
	 * compareMap.getOrDefault(t.charAt(i), 0) + 1); }
	 * 
	 * String temp = new String(); for (int i = 0; i < s.length(); i++) { temp =
	 * s.substring(i,windowLength+i); Map<Character, Integer> map = new HashMap<>();
	 * for (int j = 0; j < temp.length(); j++) {
	 * if(compareMap.containsKey(temp.charAt(j))) { map.put(temp.charAt(j),
	 * map.getOrDefault(temp.charAt(j), 0) + 1); } } if(compareMap.equals(map)) {
	 * System.out.println(temp); break; } }
	 * 
	 * }
	 */

	/*
	 * private void permutationInString(String s, String t) {
	 * 
	 * int charArr[] = new int[256];
	 * 
	 * for (int i = 0; i < t.length(); i++) { charArr[t.charAt(i)]++; }
	 * 
	 * int count = 0;
	 * 
	 * for (int i = 0; i < t.length(); i++) { if (--charArr[s.charAt(i)] >= 0) {
	 * count++; } }
	 * 
	 * int i = 0; int j = 0;
	 * 
	 * for (j = t.length() - 1; j < s.length(); j++) { ++charArr[s.charAt(i)];
	 * 
	 * i++; if (--charArr[s.charAt(j)] >= 0) { count++; } if (count == t.length()) {
	 * System.out.println(s.substring(i - 1, j + 1)); break; }
	 * 
	 * }
	 * 
	 * }
	 */

	private void permutationInString(String s, String t) {
		Map<Character, Integer> sMap = new HashMap<Character, Integer>();
		Map<Character, Integer> tMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < t.length(); i++) {
			tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
		}
		
		for (int i = 0; i < s.length(); i++) {
			sMap.put(t.charAt(i), sMap.getOrDefault(t.charAt(i), 0) + 1);
			
			if(i>=tMap.size()) {
				if(sMap.get(s.charAt(i-tMap.size())) == 1) {
					sMap.remove(s.charAt(i-tMap.size()));
				}else {
					sMap.put(s.charAt(i-tMap.size()), sMap.get(s.charAt(i-tMap.size()))-1);
				}
			}
			if(sMap.equals(tMap)) {
				System.out.println(true);
				break;
			}
		}
		
	}

}
