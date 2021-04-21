package leetCode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LeetCode567 {

	@Test
	public void example1() {
		String s1 = "abc";
		String s2 = "ccabc";
//		System.out.println(method1(s1, s2));
//		System.out.println(method2(s1, s2));
		System.out.println(method3(s1, s2));
	}
	
	@Test
	public void example2() {
		String s1 = "abc";
		String s2 = "eidbaoooc";
		System.out.println(method1(s1, s2));
		System.out.println(method2(s1, s2));
	}
	
	@Test
	public void example3() {
		String s1 = "adc";
		String s2 = "dcda";
		System.out.println(method1(s1, s2));
		System.out.println(method2(s1, s2));
	}
	
	private boolean method1(String s1, String s2) {
		Map<Character, Integer> s1Map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0)+1);
		}
		int k = s1.length();
		Map<Character, Integer> s2Map = new HashMap<>();
		for (int i = 0; i < k; i++) {
			s2Map.put(s2.charAt(i), s2Map.getOrDefault(s2.charAt(i), 0)+1);
		}
		if(s2Map.equals(s1Map))
			return true;
		for (int i = k; i < s2.length(); i++) {
			s2Map.put(s2.charAt(i), s2Map.getOrDefault(s2.charAt(i), 0)+1);
			if(s2Map.get(s2.charAt(i-k)) == 1){
				s2Map.remove(s2.charAt(i-k));
			}else {
				s2Map.put(s2.charAt(i-k), s2Map.get(s2.charAt(i-k))-1);
			}
			if(s2Map.equals(s1Map))
				return true;
		}
		return false;
	}
	
	private boolean method2(String s1, String s2) {
		char s1Char[] = s1.toCharArray();
		char s2Char[] = s2.toCharArray();
		Map<Character, Integer> s1Map = new HashMap<>();
		Map<Character, Integer> s2Map = new HashMap<>();
		for (int i = 0; i < s1Char.length; i++) {
			s1Map.put(s1Char[i], s1Map.getOrDefault(s1Char[i], 0)+1);
		}
		int k = s1Char.length;
		
		for (int i = 0; i < k; i++) {
			s2Map.put(s2Char[i], s2Map.getOrDefault(s2Char[i], 0)+1);
		}
		if(s2Map.equals(s1Map))
			return true;
		for (int i = k; i < s2.length(); i++) {
			s2Map.put(s2Char[i], s2Map.getOrDefault(s2Char[i], 0)+1);
			if(s2Map.get(s2Char[i-k]) == 1){
				s2Map.remove(s2Char[i-k]);
			}else {
				s2Map.put(s2Char[i-k], s2Map.get(s2Char[i-k])-1);
			}
			if(s2Map.equals(s1Map))
				return true;
		}
		return false;
	}
	
	private boolean method3(String s1, String s2) {
		if (s1.length() > s2.length())
            return false;
        int[] s1map = new int[26];
        int[] s2map = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++)
            if (s1map[i] == s2map[i])
                count++;
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            int r = s2.charAt(i + s1.length()) - 'a', l = s2.charAt(i) - 'a';
            if (count == 26)
                return true;
            s2map[r]++;
            if (s2map[r] == s1map[r])
                count++;
            else if (s2map[r] == s1map[r] + 1)
                count--;
            s2map[l]--;
            if (s2map[l] == s1map[l])
                count++;
            else if (s2map[l] == s1map[l] - 1)
                count--;
        }
        return count == 26;
	}
}
