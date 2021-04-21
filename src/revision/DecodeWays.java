package revision;

import java.util.Stack;

import org.junit.Test;

public class DecodeWays {

//	@Test
//	public void example1() {
//		String s = "3[a]2[bc]";
//		method1(s);
//	}
	
	
	@Test
	public void example2() {
		String input = "3[a2[c]]";
		method1(input);
	}
	
	@Test
	public void example3() {
		String input = "2[abc]3[cd]ef";
		method1(input);
	}

	public void method1(String s) {
		Stack<Integer> is = new Stack<>();
		Stack<String> ss = new Stack<>();

		String curr = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				int num = 0;
				while (Character.isDigit(s.charAt(i))) {
					num = num * 10 + s.charAt(i) - '0';
					i += 1;
				}
				i -= 1;
				is.push(num);
			} else if (ch == '[') {
				ss.push(curr);
				curr = "";
			} else if (ch == ']') {
				String tmp = ss.pop();
				int count = is.pop();
				for (int c = 0; c < count; c++) {
//					tmp += curr;
					tmp = tmp + curr;
				}
				curr = tmp;
			} else {
				curr += s.charAt(i);
			}
		}

		System.out.println(curr);
	}

}
