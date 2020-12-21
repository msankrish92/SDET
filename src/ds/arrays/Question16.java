package ds.arrays;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Question16 {

	@Test
	public void example() {
		String input = "Laptop";
		occorance(input);
	}
	
	private void reverseString(String input) {
		for (int i = input.length()-1; i >= 0; i--) {
			System.out.println(input.charAt(i));
		}
		
	}
	
	private void vowel(String input) {
		
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case 'a': 
				input = input.replace("a", "");
				break;

			default:
				break;
			}	
		}
		
	}
	
	private void occorance(String input) {
//		Laptop
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			if(!set.add(input.charAt(i))) {
				System.out.println(input.charAt(i));
			}
		}
//		input.replaceAll(regex, replacement)
	}
	
	
	private void oc(String input) {
		
	}
	
}
