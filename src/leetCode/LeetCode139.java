package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class LeetCode139 {

	@Test
	public void example1() {
		String s = "leetcode";
		List<String> wordDict = Arrays.asList(new String[] {"leet", "code"} );
		System.out.println(wordBreak(s,wordDict));
	}
	
	@Test
	public void example2() {
		String s = "cars";
		List<String> wordDict = Arrays.asList("car", "ca", "rs");
		System.out.println(wordBreak(s,wordDict));
	}
	
	 public boolean wordBreak(String s, List<String> wordDict) {
		    Set<String> dict = new HashSet<>(wordDict);
		    // important: we use a non-primitive because indices' values are initialized to null
		    // this allows us to memoize optimal solutions for subproblems
		    Boolean[] val = new Boolean[s.length()];
	        return recFun(s, wordDict, 0,val);
		  }
		  
	 public boolean recFun(String s, List<String> wordDict, int start, Boolean val[]) {
			
			if (start == s.length()) {
				return true;
			}
	        if(val[start]!=null) {
				return val[start];
			}
			for (int i = start; i <= s.length(); i++) {
				if (wordDict.contains(s.substring(start, i)) && recFun(s, wordDict, i,val)) {
					val[start] = true;
					return true;
				}
			}
			val[start] = false;
			return false;
		}
	
}
