package ds.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class SolveParenthesis {

	@Test
	public void example() {
		String str = "(({}))";
		System.out.println(isValid(str));
	}
	
	@Test
	public void example1() {
		String str = "(({})";
		System.out.println(isValid(str));
	}
	
	@Test
	public void example3() {
		String str = "[{})[]";
		System.out.println(isValid(str));
	}
	
	private boolean isValid(String str) {
		
		Map<Character,Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(')', '(');
		map.put(']', '[');
		
		Stack<Character> stack = new Stack<Character>();
		
		for (Character character : str.toCharArray()) {
			if(!map.containsKey(character)) {
				stack.push(character);
			}else if(map.containsKey(character)) {
				Character pop = stack.pop();
				if(pop != map.get(character)) {
					return false;
				}
			}
		}
		
		if(stack.size() == 0) {
			return true;
		}
		return false;
	}
	
	
}
