package classRoomAssignment;

import org.junit.Test;

public class ReverseAString {

	@Test
	public void example1() {
		String input = "hello";
		System.out.println(method1(input));
	}
	
	@Test
	public void example2() {
		String input = "hello world";
		System.out.println(method1(input));
	}
	
	private String method1(String input) {
		if(input.length()==1) {
			return input;
		}
		String output = new String();
		output = input.charAt(input.length()-1) + method1(input.substring(0,input.length()-1));
		return output;
	}
	
}
