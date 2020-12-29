package assignment1;

import org.junit.Test;

public class Question4 {
	
	/**
	 * Pseudo
	 * declare int arr of 256 and stringBuilder variable 
	 * loop through and put the values in array
	 * loop through the another string and append it to stringBuilder
	 * if input string length is equal to stringBuilder length
	 * return stringBuilder value
	 * else
	 * return Character is missing in another string
	 */

	
	@Test
	public void example1() {
		String input = "abbceeeg";
		String ordString = "egbca";
		System.out.println(method1(input, ordString));
	}
	
	@Test
	public void example2() {
		String input = "utnamn";
		String ordString = "ntaum";
		System.out.println(method1(input, ordString));
	}
	
	@Test
	public void example3() {
		String input = "abbceeegd";
		String ordString = "egbca";
		System.out.println(method1(input, ordString));
	}
	
	@Test
	public void example4() {
		String input = "abbceeeg";
		String ordString = "";
		System.out.println(method1(input, ordString));
	}
	
	private String method1(String input, String ordString) {
		int arr[] = new int[256];
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			arr[input.charAt(i)]++;
		}
		
		
		for (int i = 0; i < ordString.length(); i++) {
			while(arr[ordString.charAt(i)]!=0) {
				str.append(ordString.charAt(i));
				arr[ordString.charAt(i)]--;
			}
		}
		
		if(str.length() == input.length())
			return str.toString();
		else
			return "Character is missing in another string";
	
	}
	
	
}
