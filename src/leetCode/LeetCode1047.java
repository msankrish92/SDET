package leetCode;

import java.util.Iterator;
import java.util.Stack;

import org.testng.annotations.Test;

public class LeetCode1047 {

	@Test
	public void test1() {
		String s = "abbaca";
		System.out.println(method2(s));
	}

	@Test
	public void test2() {
		String s = "azxxzy";
		System.out.println(method2(s));
	}

	StringBuilder str;
//	public String method1(String s) {
//		str = new StringBuilder(s);
//		while(hasAdjacentDups(0, 1));
//		return str.toString();
//	}
//	
//	public boolean hasAdjacentDups(int i, int j) {
//		while(j<str.length()) {
//			if(str.charAt(i) == str.charAt(j)) {
//				str.deleteCharAt(i);
//				str.deleteCharAt(i);
//				return true;
//			}else {
//				i++;
//				j++;
//			}
//		}
//		return false;
//	}

	public String method2(String s) {
		str = new StringBuilder(s);
		int i = 0;
		int j = 1;
		while (j < str.length()) {
			if (str.charAt(i) == str.charAt(j)) {
				str.deleteCharAt(i);
				str.deleteCharAt(i);
				if (i > 0) {
					i--;
					j--;
				}
			} else {
				i++;
				j++;
			}
		}
		return str.toString();
	}

	public String method3(String s) {

		Stack<Character> stack = new Stack<>();
		for (Character character : s.toCharArray()) {
			if (stack.isEmpty()) {
				stack.push(character);
			} else {
				if (stack.peek() == stack.push(character)) {
					stack.pop();
					stack.pop();
				}
			}
		}
		s = "";
		Iterator<Character> it = stack.iterator();
		while (it.hasNext()) {
			s = s + it.next();
		}
		return s;

	}

}
