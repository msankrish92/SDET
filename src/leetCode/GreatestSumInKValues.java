package leetCode;

import org.junit.Test;

public class GreatestSumInKValues {

	
	@Test
	public void example1() {
		int input[] = {10,3,33,5,2,32,21,14,17,8,9};
		int k = 3;
		System.out.println(greatestSum(input, k));
	}
	
	@Test
	public void example2() {
		int input[] = {10,3,33,5,2,32,21,14,17,8,9};
		int k = 2;
		System.out.println(greatestSum(input, k));
	}
	
	@Test
	public void example3() {
		int input[] = {10,3,33,5,2,32,21,14,17,8,100};
		int k = 2;
		System.out.println(greatestSum(input, k));
	}
	
	private int greatestSum(int input[], int k) {
		if(k<input.length) {
			return -1;
		}
		int windowSum = 0;
		int maxSum = 0;
		
		for(int i = 0; i<k; i++) {
			windowSum += input[i];
		}
		maxSum = windowSum;
		
		for (int i = k; i < input.length; i++) {
			windowSum = windowSum + input[i] - input[i-k];
			if(windowSum>maxSum) {
				maxSum = windowSum;
			}
		}
		
		return maxSum;
		
	}
}
