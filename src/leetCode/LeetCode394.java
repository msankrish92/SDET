package leetCode;

import java.util.Stack;

import org.junit.Test;

public class LeetCode394 {

//	@Test
//	public void example1() {
//		String input = "3[a]2[bc]";
//		method1(input);
//	}
	
//	@Test
//	public void example2() {
//		String input = "3[a2[c]]";
//		method1(input);
//	}
	
	@Test
	public void example3() {
		String input = "2[abc]3[cd]ef";
		method1(input);
	}
	
	public void method1(String input) {
		Stack<Integer> number = new Stack<Integer>();
		Stack<String> str = new Stack<String>();
		StringBuilder out = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i))) {
				int dig = 0;
				int j = i;
				while(Character.isDigit(input.charAt(j))){
					dig = (dig * 10) + Integer.parseInt(input.charAt(j++) + "");
				}
				number.push(dig);
				i = j-1;
			}else if(Character.isAlphabetic(input.charAt(i))) {
				StringBuilder strBld = new StringBuilder();
				int j = i;
				while(j<input.length() && Character.isAlphabetic(input.charAt(j))) {
					strBld.append(input.charAt(j++));
				}
				str.push(strBld.toString());
				i = j - 1;
			}else if(input.charAt(i) == ']') {
				String temp = str.pop();
//				out.append(temp);
				temp = temp + out;
				StringBuilder strBld = new StringBuilder();
				int count = number.pop();
				for(int j = 0; j<count; j++) {
					strBld.append(temp);
				}
				out = strBld;
			}
		}
		
		System.out.println(out);
		
		
	}
	
	
}
