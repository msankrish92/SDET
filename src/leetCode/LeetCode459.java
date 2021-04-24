package leetCode;

import org.junit.Test;

public class LeetCode459 {

//	@Test
//	public void example1() {
//		String s = "abab";
//		System.out.println(method1(s));
//	}
//	
//	@Test
//	public void example2() {
//		String s = "aba";
//		System.out.println(method1(s));
//	}
//	
//	@Test
//	public void example3() {
//		String s = "abcabcabcabc";
//		System.out.println(method1(s));
//	}
//	
	@Test
	public void example4() {
		String s = "abaabaa";
		System.out.println(method1(s));
	}
//	
//	@Test
//	public void example5() {
//		String s = "abaababaab";
//		System.out.println(method1(s));
//	}
	
	@Test
	public void example6() {
		String s = "babbabbabbabbab";
		System.out.println(method1(s));
	}
	
	public boolean method1(String s) {
//		if(s.length()%2 != 0) return false;
		int arr[] = new int[s.length()];
		int i = 0,j = 1;
		int lastZero = 0;
		while(j<s.length()) {
			if(s.charAt(i) == s.charAt(j)) {
				arr[j] = i+1;
				i++;
				j++;
			}else {
				if(i!=0) {
					i = arr[i-1];
				}else {
					arr[j] = 0;
					lastZero = j;
					j++;
				}
			}
		}
		if(lastZero+1>arr[s.length()-1]) return false;
		if(arr[s.length()-1]%(lastZero+1) == 0) return true;
		if(s.length() % arr[s.length()-1] == 0) return true;
		
		return false;
		
	}
	
}
