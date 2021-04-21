package leetCode;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LeetCode647 {

//	@Test
	public void example() {
		String input = "abc";
		System.out.println(method1(input));
	}
	
	@Test
	public void example1() {
		String input = "aaa";
		System.out.println(method1(input));
	}
	
	private int method1(String input) {
		if(input.length()%2==0) {
			input = input.substring(0, input.length()/2) + "$" + input.substring(input.length()/2, input.length());
		}
		Set<String> st = new HashSet<String>();
		for(char a : input.toCharArray()) {
			st.add(a + "");
		}
		for (int i = 0; i < input.length(); i++) {
			int left = i;
			int right = i+1;
			while(left>=0 && right<=input.length()-1) {
				if(input.charAt(left)!=input.charAt(right)) {
					st.add(input.substring(left, right));
					break;
				}else {
					left--;
					right++;
				}
			}
		}
		System.out.println(st);
		return st.size();
		
	}
	
	
}
