package classRoomAssignment;

import java.util.Stack;

import org.junit.Test;

public class ValidParan {

	/* '(', ')', '{', '}', '[' and ']',
	 * Pseudo
	 * Declare a stack 
	 * for loop
	 * 	if char at current index {
	 * 		add }
	 * 	if char at current index (
	 * 		add )
	 * 	if char at current index [
	 * 		add ] 
	 * 	else if
	 * 		pop == current index
	 * 
	 * true when stack is empty
	 */
	
	
	@Test
	public void example1() {
		String input = "(())";
		System.out.println(method1(input));
	}
	
	@Test
	public void example2() {
		String input = "({})";
		System.out.println(method1(input));
	}
	
	@Test
	public void example3() {
		String input = "({}";
		System.out.println(method1(input));
	}
	
	@Test
	public void example4() {
		String input = "}()";
		System.out.println(method1(input));
	}
	
	@Test
	public void example5() {
		String input = "({";
		System.out.println(method1(input));
	}
	
	@Test
	public void example6() {
		String input = "})";
		System.out.println(method1(input));
	}
	
	@Test
	public void example7() {
		String input = "({)";
		System.out.println(method1(input));
	}

	private boolean method1(String input) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '{') {
				stack.push('}');
			}else if(input.charAt(i) == '(') {
				stack.push(')');
			}else if(input.charAt(i) == '[') {
				stack.push(']');
			}else {
				if(stack.isEmpty()) {
					return false;
				}else if(stack.peek() == input.charAt(i)) {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty())
			return true;
		
		return false;
	}
	
	
}
