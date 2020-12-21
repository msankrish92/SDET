package classRoomAssignment;

import org.junit.Test;

public class ConOccurance {

//	Declare two variable i and j
//	Declare max and char variable
//	i -> pointing to first character and j -> pointing to secound character
//	in while loop untill i is less string length
//	increment j and if it matches with char at i, increment count;
// 	when j is equal string length reset count to 0 and j to i plus one
//	And if max is greater than current max store it to max and store chat at i in char variable
// 	outside the loop return char variable
	
	
	@Test
	public void example() {
		String input = "AtoooZzz";
		conOccurance(input);
	}
	
	@Test
	public void example1() {
		String input = "Atoozzz";
		conOccurance(input);
	}
	
	@Test
	public void example3() {
		String input = "AAAAAA";
		conOccurance(input);
	}
	
	@Test
	public void example4() {
		String input = "";
		conOccurance(input);
	}
	
	public void conOccurance(String input) {
		if(input.length() == 0) {
			System.out.println("");
		}
		int i = 0;
		int j = 0;
		int max = 0;
		char chr = input.charAt(0);
		int count = 0;
		while(i<input.length()) {
			if(j<input.length() && input.charAt(i) == input.charAt(j)) {
				count++;
				j++;
			}else if(j==input.length() ||input.charAt(i) != input.charAt(j)) {
				if(count>max) {
				chr = input.charAt(i);
				}
				i++;
				j = i;
				max = Math.max(count, max);
				count = 0;
				
			}
			
		}
		System.out.println(chr);
	}
	
	
}
