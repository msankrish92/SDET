package leetCode;

import org.junit.Test;

public class LeetCode125 {
	
	/*
	 * Pseudo[Two Pointer] -> Efficient 
	 * Initialize two variable
	 * left -> Start of the index
	 * right -> end of the index
	 * while left <= right
	 * if char at left is not digit or alphabet(method: isLetterOrDigit)
	 * 	increment left
	 * else if char at right is not digit or alphabet(method: isLetterOrDigit)
	 * 	decrement right
	 * else if char at right is not equal to char at left
	 * 	return false
	 * else
	 * 	increment left
	 * 	decrement right
	 * 
	 * outside the loop 
	 * return false
	 */
	
	/*
	 * Pseudo[Expand from center] -> as we use inbuilt methods not as efficient as above solution
	 * remove all the space and special characters from the string and convert it to lower case
	 * if string is length is even
	 * 	add a character at the center
	 * Declare two variable
	 * left and right
	 * left -> (input.length/2)-1
	 * right -> (input.length/2)+1
	 * while left >= 0 and right <= input.length-1
	 * 	if char at left is not equal to right
	 * 		return false
	 * 
	 * outside the loop
	 * return true
	 */
	
	

	@Test
	public void example1() {
		String input = "A man, a plan, a canal: Panama";
		System.out.println(method2(input));
	}

	@Test
	public void example2() {
		String input = "aba";
		System.out.println(method2(input));
	}

	@Test
	public void example3() {
		String input = "ab";
		System.out.println(method2(input));
	}

	private boolean method1(String input) {
		int i = 0;
		int j = input.length() - 1;
		while (i <= j) {
			if (!(Character.isLetterOrDigit(input.charAt(i))))
				i++;
			else if (!(Character.isLetterOrDigit(input.charAt(j))))
				j--;
			else if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j)))
				return false;
			else {
				i++;
				j--;
			}
		}
		return true;
	}

	private boolean method2(String input) {
		
		input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		if (input.length() % 2 == 0)
			input = input.substring(0, input.length()/2) + "$" + input.substring(input.length() / 2, input.length());

		int left = (input.length()/2) - 1;
		int right = (input.length()/2) + 1;
		
		while(left>=0 && right<=input.length()-1) {
			if(input.charAt(left--)!=input.charAt(right++))
				return false;
		}
		
		return true;
	}

}
