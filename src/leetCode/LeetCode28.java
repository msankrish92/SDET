package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LeetCode28 {

//	@Test
//	public void example1() {
//		String s1 = "hello";
//		String s2 = "ll";
//		System.out.println(method4(s1, s2));
//	}
//	@Test
//	public void example2() {
//		String s1 = "heello";
//		String s2 = "ll";
//		System.out.println(method3(s1, s2));
//	}
//	
//	@Test
//	public void example3() {
//		String s1 = "aaa";
//		String s2 = "aaaa";
//		System.out.println(method3(s1, s2));
//	}
//	
//	@Test
//	public void example4() {
//		String s1 = "a";
//		String s2 = "a";
//		System.out.println(method3(s1, s2));
//	}
//
//	@Test
//	public void example5() {
//		String s1 = "ababcabcabababd";
//		String s2 = "ababd";
//		System.out.println(method4(s1, s2));
//	}

	@Test
	public void example6() {
		String s1 = "aabaaabaaac";
		String s2 = "aabaaac";
		System.out.println(method4(s1, s2));
		System.out.println(KMP(s1.toCharArray(), s2.toCharArray()));
	}

	// Time Complexity O[N^2]
	public int method2(String s1, String s2) {
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		if (s2.isEmpty())
			return 0;
		if (s1.isEmpty() && s2.length() > 0)
			return -1;
		if (s1.length() < s2.length())
			return -1;
		for (char ch : s2.toCharArray())
			str2.append(ch);// O[N]
		for (int i = 0; i < s2.length(); i++) {
			str1.append(s1.charAt(i));
		}
		if (str1.toString().equals(str2.toString()))
			return 0;
		for (int i = s2.length(); i < s1.length(); i++) {// O[N]
			str1.deleteCharAt(0);
			str1.append(s1.charAt(i));
			if (str1.toString().equals(str2.toString()))
				return i - s2.length() + 1;// O[N]
		}
		return -1;
	}

	public int method3(String s1, String s2) {
		if (s2.isEmpty())
			return 0;
		if (s1.isEmpty() && s2.length() > 0)
			return -1;
		if (s1.length() < s2.length())
			return -1;
		for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
			if (s1.charAt(i) == s2.charAt(0)) {
				if (s1.substring(i, i + s2.length()).equals(s2))
					return i;
			}
		}
		return -1;
	}
	public int method4(String s1, String s2) {

		if (s2.isEmpty())
			return 0;
		if (s1.isEmpty() && s2.length() > 0)
			return -1;
		if (s1.length() < s2.length())
			return -1;
		int arr[] = new int[s2.length()];
		int i = 0;
		int j = 1;
		while (j < s2.length()) {
			if(s2.charAt(i) == s2.charAt(j)) {
				arr[j] = i+1;
				i++;
				j++;
			}else {
				if(i!=0) {
					i = arr[i-1];
				}else {
					arr[j] = 0;
					j++;
				}
			}
		}
		i = 0;
		j = 0;
		while (i < s1.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				i++;
				j++;
			} else if (j == 0 && s1.charAt(i) != s2.charAt(j)) {
				i++;
			} else {
				j = arr[j - 1];
			}
			if (j == s2.length()) {
				return i - s2.length();
			}
		}

		return -1;
	}
	//aabaaac
	private int[] computeTemporaryArray(char pattern[]){
        int [] lps = new int[pattern.length];
        int index = 0;
        for(int i=1; i < pattern.length;){
            if(pattern[i] == pattern[index]){
                lps[i] = index + 1;
                index++;
                i++;
            }else{
                if(index != 0){
                    index = lps[index-1];
                }else{
                    lps[i] =0;
                    i++;
                }
            }
        }
        return lps;
    }
    
    /**
     * KMP algorithm of pattern matching.
     */
    public boolean KMP(char []text, char []pattern){
        
        int lps[] = computeTemporaryArray(pattern);
        int i=0;
        int j=0;
        while(i < text.length && j < pattern.length){
            if(text[i] == pattern[j]){
                i++;
                j++;
            }else{
                if(j!=0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        if(j == pattern.length){
            return true;
        }
        return false;
    }

}
