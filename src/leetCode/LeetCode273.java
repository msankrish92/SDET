package leetCode;

import org.junit.Test;

public class LeetCode273 {

	String[] ones = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve",
			"thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
	String[] tens = {"","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
	
	@Test
	public void example1() {
		int input = 501;
		String intToString = intToString(input);
		System.out.println(intToString);
	}
	
	public String intToString(int input) {
		int divident = 0;
		int remainder = 0;
		if(input>=100 && input<=999) {
			divident = input/100;
			remainder = input%100;
			return intToString(divident) + " hundred " + intToString(remainder);
		}
		if(input>=20 && input <= 99) {
			divident = input/10;
			remainder = input%10;
			return tens[divident-1] +" " + intToString(remainder);
		}
//		if(input>=1 && input <= 19) {
			return ones[input];
//		}
	}
	
	
	
}
