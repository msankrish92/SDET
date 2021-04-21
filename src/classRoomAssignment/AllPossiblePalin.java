package classRoomAssignment;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AllPossiblePalin {

	/*
	 * Pseudo
	 * [BruteForce]
	 * Need to get all the subString And check for panlindrome
	 * 
	 * Go to the middle of the String
	 * add it to the list
	 * check if left of that is equal right of it
	 * if so add it to the list
	 * 
	 */
	
	
	@Test
	public void example1() {
		String input = "aaaa";
		method1(input);
	}
	
	private void method1(String input) {
		String inp = input;
		if(input.length()%2==0) {
			inp = input.substring(0, input.length()/2) + "@" + input.substring(input.length()/2, input.length());
		}
		List<String> lst = new ArrayList<String>();
		
		int mid = inp.length()/2;
		int left = inp.length()/2-1;
		int right = inp.length()/2+1;
//		while()
		
	}
	
	
}
