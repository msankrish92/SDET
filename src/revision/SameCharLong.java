package revision;

import org.junit.Test;

public class SameCharLong {

	@Test
	public void example1(){
		String input = "AABAAB";
		int k = 2;
		System.out.println(method2(input, k));
	}

	@Test
	public void example2(){
		String input = "ABCDE";
		int k = 1;
		System.out.println(method2(input, k));
	}

	@Test
	public void example3(){
		String input = "AAAB";
		int k = 0;
		System.out.println(method2(input, k));
	}
//
////	@Test
//	public void example4(){
//		String input = "AAAB";
//		int k = 5;
//		System.out.println(method1(input, k));
//
//	}
//	
	@Test
	public void example5(){
		String input = "AAABBCDAAABC";
		int k = 1;
		System.out.println(method1(input, k));
	}
	
	@Test
	public void example6(){
		String input = "AABABBA";
		int k = 1;
		System.out.println(method2(input, k));
	}
	
	@Test
	public void example7(){
		String input = "ABBB";
		int k = 1;
		System.out.println(method2(input, k));
	}
	
//	AABAAB
	private int method1(String input, int k){
		boolean flag = true;
		for(int i = 1; i<input.length(); i++) {
			if(input.charAt(0) != input.charAt(i)) {
				flag = false;
				break;
			}
		}
		if(flag) {
			return input.length();
		}
		if(input.length()<=k){
			return input.length();
		}
		int max_Value = 0;
		for(int i = 0; i<input.length(); i++){
			int count = 0;
			for(int j = i+1; j<input.length(); j++){
				if(input.charAt(i) != input.charAt(j) && count <= k){
					count++;
				}else if(input.charAt(i) != input.charAt(j)) {
					break;
				}
				if(count == k) {
					max_Value = Math.max(j-i, max_Value);
				}
			}
		}
		return max_Value+1;
	}
//	AAAB
	/*
	 * Pseudo[WindowSliding/TwoPointer][Time Complexity O[N]]
	 * Declare a start, end, maxValue, maxFreq and int array of size 26
	 * While end is less than input length
	 * maxFreq is equal to max of current freq and maxFreq
	 * maxFreq plus k should be greater than end minus start
	 * if it is lesser extra character has been added so need to reduce the first char
	 * 			[Or]
	 * if end minus start plus one minus maxFreq is greater than k[Mean extra character has been added]
	 * decrement first
	 * 
	 * maxValue equal to max of maxValue and end-start+1
	 * increment end
	 * 
	 * outside the loop
	 * return maxValue;
	 */
	
	
	private int method2(String input, int k){
		int start = 0;
		int end = 0;
		int maxValue = 0;
		int maxFreq = 0;
		int chArr[] = new int[26];
		while(end<input.length()) {
			maxFreq = Math.max(maxFreq, ++chArr[input.charAt(end)-'A']);
			if(end-start+1-maxFreq>k) {
				chArr[input.charAt(start++)-'A']--;
			}
			maxValue = Math.max(maxValue, end-start+1);
			end++;
		}
		return maxValue;
	}
	
}
