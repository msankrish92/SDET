package leetCode;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LeetCode1079 {
	
	/*
	 * Pseudo
	 * Declare a global set variable
	 * Create a recursive method with input, string builder,boolean array
	 * Boolean array -> to have track of used and unused element in the input
	 * if stringBuilder length == input length return
	 * Iterate over the input
	 * 	if flag at that character if false
	 * 		add it to stringBuilder
	 * 		and set flag to true
	 * 		call the recursive function again
	 * 		remove the last added charcter
	 * 		and set flag to false again
	 * 
	 * 
	 * In the main function
	 * 	return the global set size
	 */
	
	Set<String> st = new HashSet<String>();

	@Test
	public void example1() {
		String input = "AAB";
		letterTiles((input), new StringBuilder(), new boolean[input.length()]);
		System.out.println(st);
	}

	private void letterTiles(String input, StringBuilder str, boolean flag[]) {
		if(str.length() == input.length())
			return;
		
		for (int i = 0; i < input.length(); i++) {
			if(flag[i] == false) {
				str.append(input.charAt(i));
				st.add(str.toString());
				flag[i] = true;
				letterTiles(input, str, flag);
				str.deleteCharAt(str.length()-1);
				flag[i] = false;
			}
		}

	}

}
