package leetCode;

import org.junit.Test;

public class LeetCode9 {

//	@Test
//	public void example1() {
//		int input = 121;
//		System.out.println(IsPalindrome(input));
//	}
//
//	@Test
//	public void example2() {
//		int input = 122;
//		System.out.println(IsPalindrome(input));
//	}
//
//	@Test
//	public void example3() {
//		int input = -122;
//		System.out.println(IsPalindrome(input));
//	}

	@Test
	public void example4() {
		int input = Integer.MAX_VALUE;
		System.out.println(IsPalindrome(input));
	}

	private boolean isPalin(int input) {
		if (input < 0) {
			return false;
		}
		int revInput = recFun(input);
		if (revInput == input)
			return true;
		else
			return false;
	}

	private int recFun(int input) {
		if (input > 999999999 && input <= Integer.MAX_VALUE) {
			return recFun(input / 10) + ((input % 10) * 1000000000);
		}else if (input > 99999999 && input <= 999999999) {
			return recFun(input / 10) + ((input % 10) * 100000000);
		} else	if (input > 9999999 && input <= 99999999) {
			return recFun(input / 10) + ((input % 10) * 10000000);
		} else if (input > 999999 && input <= 9999999) {
			return recFun(input / 10) + ((input % 10) * 1000000);
		} else if (input > 99999 && input <= 999999) {
			return recFun(input / 10) + ((input % 10) * 100000);
		} else if (input > 9999 && input <= 99999) {
			return recFun(input / 10) + ((input % 10) * 10000);
		} else if (input > 999 && input <= 9999) {
			return recFun(input / 10) + ((input % 10) * 1000);
		} else if (input > 99 && input <= 999) {
			return recFun(input / 10) + ((input % 10) * 100);
		} else if (input > 9 && input <= 99) {
			return recFun(input / 10) + ((input % 10) * 10);
		} else {
			return input;
		}

	}
	
	 public boolean IsPalindrome(int x) {
	        // Special cases:
	        // As discussed above, when x < 0, x is not a palindrome.
	        // Also if the last digit of the number is 0, in order to be a palindrome,
	        // the first digit of the number also needs to be 0.
	        // Only 0 satisfy this property.
	        if(x < 0 || (x % 10 == 0 && x != 0)) {
	            return false;
	        }

	        int revertedNumber = 0;
	        while(x > revertedNumber) {
	            revertedNumber = revertedNumber * 10 + x % 10;
	            x /= 10;
	        }

	        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
	        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
	        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
	        return x == revertedNumber || x == revertedNumber/10;
	    }

}
