package ds.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class Encode {

	@Test
	public void example1() {
		String input = "3[a]2[bc]";
		method1(input);
	}

//	@Test
//	public void example2() {
//		String input = "3[a2[c]]";
//		method1(input);
//	}

	public void method1(String s) {

		Stack<Integer> count = new Stack<>();
		Stack<String> string = new Stack<>();
		StringBuilder res = new StringBuilder();
		StringBuilder out = new StringBuilder();
		int index = 0;
		while (index < s.length()) {
			if (Character.isDigit(s.charAt(index))) {
				StringBuilder str = new StringBuilder();
				str.append(s.charAt(index));
				
				int num = Integer.parseInt(str.toString());
				while (Character.isDigit(s.charAt(++index))) {
					num = Integer.parseInt(str.toString()) * 10 + Integer.parseInt(String.valueOf(s.charAt(index)));
					str.setLength(0);
					str.append(num + "");
					index++;
				}
				
				count.add(num);
				System.out.println(num);
			}else if(s.charAt(index) == '[') {
				if(res.length()>0) {
					string.add(res.toString());
					index++;
				}else {
					index++;
				}
			}else if(s.charAt(index) == ']') {
				int num = count.pop();
				String cu =  string.pop() + out;
				
				for (int i = 0; i < num; i++) {
					out.append(cu);
				}
				index++;
			}else {
				res.append(s.charAt(index));
				index++;
			}
		}

	}

}
