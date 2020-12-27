package leetCode;

import org.junit.Test;

public class LeetCode12 {

//	https://leetcode.com/problems/integer-to-roman/

	String[] ones = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

	String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX","LXX", "LXXX",  "XC" };

	String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC","DCCC","CM", "M" };
	
	String[] thousand = { "", "M", "MM", "MMM" };

	@Test
	public void example1() {
		int input = 2100;
		String intToRoman = intToRoman2(input);
		System.out.println(intToRoman);
	}

//	@Test
	public void example2() {
		int input = 2000;
		String intToRoman = intToRoman(input);
		System.out.println(intToRoman);
	}
	
//	@Test
	public void example3() {
		int input = 200;
		String intToRoman = intToRoman(input);
		System.out.println(intToRoman);
	}
	
//	@Test
	public void example4() {
		int input = 50;
		String intToRoman = intToRoman(input);
		System.out.println(intToRoman);
	}
	
	private String intToRoman(int input) {
		int quotient = 0;
		int remainder = 0;
		
		if (input >= 1000 && input <= 9999) {
			quotient = input / 1000;
			remainder = input % 1000;
			return thousand[quotient] + intToRoman(remainder);
		}

		if (input >= 100 && input <= 999) {
			quotient = input / 100;
			remainder = input % 100;
			return hundreds[quotient] + intToRoman(remainder);
		}

		if (input >= 10 && input <= 99) {
			quotient = input / 10;
			remainder = input % 10;	
			return tens[quotient] + intToRoman(remainder);
		}

		return ones[input];

	}
	
	private String intToRoman2(int num) {
		 return thousand[num/1000] + hundreds[(num%1000)/100]+ tens[(num%100)/10] + ones[num%10];
	}		
}
