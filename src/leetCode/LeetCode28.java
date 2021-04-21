package leetCode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LeetCode28 {
	
	@Test
	public void example1() {
		String s1 = "hello";
		String s2 = "ll";
		System.out.println(method3(s1, s2));
	}
	@Test
	public void example2() {
		String s1 = "heello";
		String s2 = "ll";
		System.out.println(method3(s1, s2));
	}
	
	@Test
	public void example3() {
		String s1 = "aaa";
		String s2 = "aaaa";
		System.out.println(method3(s1, s2));
	}
	
	@Test
	public void example4() {
		String s1 = "a";
		String s2 = "a";
		System.out.println(method3(s1, s2));
	}
	
	//Time Complexity O[N^2]
	public int method2(String s1, String s2) { 
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		if(s2.isEmpty()) return 0;
        if(s1.isEmpty() && s2.length()>0) return -1;
        if(s1.length()<s2.length()) return -1;
        for(char ch : s2.toCharArray()) str2.append(ch);//O[N]
        for(int i = 0; i<s2.length(); i++) {
        	str1.append(s1.charAt(i));
        }
        if(str1.toString().equals(str2.toString())) return 0;
        for(int i = s2.length(); i<s1.length(); i++) {//O[N]
        	str1.deleteCharAt(0);
        	str1.append(s1.charAt(i));
        	if(str1.toString().equals(str2.toString())) return i-s2.length()+1;//O[N]
        }
        return -1;
	}
	
	public int method3(String s1, String s2) {
		if(s2.isEmpty()) return 0;
        if(s1.isEmpty() && s2.length()>0) return -1;
        if(s1.length()<s2.length()) return -1;
		for(int i = 0; i<s1.length()-s2.length()+1; i++) {
			if(s1.charAt(i) == s2.charAt(0)) {
				if(s1.substring(i, i+s2.length()).equals(s2))
					return i;
			}
		}
		return -1;
	}

}
