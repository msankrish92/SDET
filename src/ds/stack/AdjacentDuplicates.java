package ds.stack;

import java.util.Iterator;
import java.util.Stack;

import org.junit.Test;

public class AdjacentDuplicates {

	@Test
	public void example1() {
		String input = "abbaca";
		System.out.println(method1(input));
	}

	/*
	 * public String method1(String input) {
	 * 
	 * Stack<Character> stack = new Stack<Character>();
	 * 
	 * for (Character character : input.toCharArray()) { if (stack.isEmpty()) {
	 * stack.push(character); } else { System.out.println(stack.peek());
	 * if(stack.peek() == stack.push(character)) { stack.pop(); stack.pop(); }
	 * 
	 * }
	 * 
	 * }
	 * 
	 * System.out.println(stack.toString());
	 * 
	 * StringBuilder str = new StringBuilder(); Iterator<Character> iterator =
	 * stack.iterator(); while(iterator.hasNext()) { str.append(iterator.next()); }
	 * return str.toString(); }
	 */
	
	 public String method1(String input) {
		 
		 StringBuilder str = new StringBuilder(input);
		 
		 int i = 0;
		 int j = 1;
		 while(j<str.length()) {
			 if(str.substring(i, j).equals(str.substring(j, j+1))) {
				 str.deleteCharAt(i);
				 str.deleteCharAt(i);
				 if(i>0) {
				 i--;
				 j--;
				 }
			 }else {
				 i++;
				 j++;
			 }
			 
		 }
		 
		 return str.toString();
	 }

}
