package leetCode;

import org.junit.Test;

public class LeetCode76 {
	
//	@Test
//	public void example1() {
//		System.out.println(method1("ADOBECODEBANC", "ABC"));
//	}
	
	@Test
	public void example1() {
		System.out.println(method1("AADBC", "ABC"));
	}

	
	public String method1(String s, String t) {
		if(s.length()<t.length()){
            return "";
        }
        int chr[] = new int[128];
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
		for (int i = 0; i < t.length(); i++) {
			chr[T[i]]++;
		}
		int start = 0;
		int end = 0;
		int count = t.length();
		int startIndex = 0;
		int endIndex = 0;
		int minLength = Integer.MAX_VALUE;
		while(end<s.length()) {
			if(chr[S[end]]>0) 
				count--;
			
			chr[S[end]]--;
			end++;
			while(count == 0) {
				if(minLength>end-start) {
				startIndex = start;
				endIndex = end;
				minLength = end - start;
				}
				if(chr[S[start]] == 0) 
					count++;
				
				chr[S[start]]++;
				start++;
			}
		}
		
		return s.substring(startIndex,endIndex);
	}
	
}
