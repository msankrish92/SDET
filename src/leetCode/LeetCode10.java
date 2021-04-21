package leetCode;

import org.junit.Test;

public class LeetCode10 {

//	@Test
//	public void example1() {
//		String s = "mississippi";
//		String p = "mis*is*ip*.";
//		System.out.println(isMatch(s, p));
//	}
//	
//	@Test
//	public void example2() {
//		String s = "aa";
//		String p = "a*";
//		System.out.println(isMatch(s, p));
//	}
	
//	@Test
//	public void example3() {
//		String s = "ab";
//		String p = ".*";
//		System.out.println(isMatch(s, p));
//	}
	
//	@Test
//	public void example4() {
//		String s = "ab";
//		String p = ".*c";
//		System.out.println(isMatch(s, p));
//	}
	
	@Test
	public void example5() {
		String s = "aaa";
//		s.sub
//		String p = "a*a";
//		System.out.println(isMatch(s, p));
	}
	
	public boolean isMatch(String s, String p) {
        int firstPointer = 0;
        int secondPointer = 0;
        
        while(firstPointer<s.length() || secondPointer<p.length()){
            if(secondPointer > p.length()-1 || firstPointer>s.length()-1){
                return false;
            }else if(p.charAt(secondPointer) == '.'){
                firstPointer++;
                secondPointer++;
            }else if(s.charAt(firstPointer) == p.charAt(secondPointer)){
                firstPointer++;
                secondPointer++;
            }else if(p.charAt(secondPointer) == '*'){
                char prev = p.charAt(secondPointer-1);
                if(prev == '.'){
                    prev = s.charAt(firstPointer);
                }
                while(firstPointer<s.length() && s.charAt(firstPointer) == prev)
                	firstPointer++;
                secondPointer++;
            }else if(s.charAt(firstPointer)!=p.charAt(secondPointer)){
                if(p.charAt(++secondPointer) == '*'){
                    secondPointer++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
	
}
