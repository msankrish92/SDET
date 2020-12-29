package leetCode;

import org.junit.Test;

public class LeetCode8 {
//	https://leetcode.com/problems/string-to-integer-atoi/

//	@Test
//	public void example1() {
//		String input = "42";
//		System.out.println(stringToInt(input));
//	}
//
//	@Test
//	public void example2() {
//		String input = "W42";
//		System.out.println(stringToInt(input));
//	}
//
//	@Test
//	public void example3() {
//		String input = "42 w";
//		System.out.println(stringToInt(input));
//	}
//
//	@Test
//	public void example4() {
//		String input = "42 ";
//		System.out.println(stringToInt(input));
//	}
//
//	@Test
//	public void example5() {
//		String input = "-42 ";
//		System.out.println(stringToInt(input));
//	}
//
//	@Test
//	public void example6() {
//		String input = "00000-42a1234";
//		System.out.println(stringToInt(input));
//	}
//	
//	@Test
//	public void example7() {
//		String input = "21474836482";
//		System.out.println(stringToInt(input));
//	}
//	
//	@Test
//	public void example7() {
//		String input = "   +0 123";
//		System.out.println(stringToInt(input));
//	}
	
	@Test
	public void example7() {
		String input = "-2147483648";
		System.out.println(stringToInt2(input));
	}

	/**
	 * Pseudo Create a stringBuilder Variable Create a boolean variable Loop through
	 * the given String if it is a digit -> add it to the StringBuilder else if it
	 * is a (-) -> Make boolean true else it if is a white space -> continue else
	 * break if stringBuilder variable length == 0 return 0 if boolean variable is
	 * true return -> 42 - (42*2) return str
	 */

//	private int stringToInt(String input) {
//		StringBuilder str = new StringBuilder();
//		boolean negative = false;
//		for (int i = 0; i < input.length(); i++) {
//			if (Character.isDigit(input.charAt(i))) {
//				str.append(input.charAt(i));
//			} else if (input.charAt(i) == '-' && i<input.length()-1) {
//				if(str.length()>0) 
//					break;
//                if (input.charAt(i + 1) == '-')
//					break;
//				if (input.charAt(i + 1) == '+')
//					break;
//				if (input.charAt(i + 1) == ' ')
//					break;
//				negative = true;
//			} else if (input.charAt(i) == ' ') {
//				if(str.length()>0) 
//					break;
//				continue;
//			} else if (input.charAt(i) == '+' && i<input.length()-1) {
//				if(str.length()>0) 
//					break;
//                if (input.charAt(i + 1) == '+')
//					break;
//				if (input.charAt(i + 1) == '-')
//					break;
//				if (input.charAt(i + 1) == ' ')
//					break;
//			} else {
//				break;
//			}
//		}
//		
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == '0') {
//				str.deleteCharAt(i);
//				i--;
//			}else {
//				break;
//			}
//		}
//		Integer.parseInt(""+Integer.MIN_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		if (str.length() == 0)
//			return 0;
//		if (negative) {
//			if(str.length()>10) {
//				return Integer.MIN_VALUE;
//			}
//			if (Integer.parseInt(str.toString()) - (Long.parseLong(str.toString()) * 2) < Integer.MIN_VALUE)
//				return Integer.MIN_VALUE;
//		} else {
//			if(str.length()>10) {
//				return Integer.MAX_VALUE;
//			}
//			if (Long.parseLong(str.toString()) > Integer.MAX_VALUE)
//				return Integer.MAX_VALUE;
//		}
//
//		if (negative)
//			return Integer.parseInt(str.toString()) - (Integer.parseInt(str.toString()) * 2);
//		return Integer.parseInt(str.toString());
//	}
	
	private int stringToInt2(String str) {
		 int i = 0;
	        int sign = 1;
	        int result = 0;
	        if (str.length() == 0) return 0;

	        //Discard whitespaces in the beginning
	        while (i < str.length() && str.charAt(i) == ' ')
	            i++;

	        // Check if optional sign if it exists
	        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-'))
	            sign = (str.charAt(i++) == '-') ? -1 : 1;

	        // Build the result and check for overflow/underflow condition
	        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
	            if (result > Integer.MAX_VALUE / 10 ||
	                    (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
	                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	            }
	            result = result * 10 + (str.charAt(i++) - '0');
	        }
	        return result * sign;
	    }
	}
	
