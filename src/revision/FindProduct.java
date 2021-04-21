package revision;

import java.util.Arrays;

import org.junit.Test;

public class FindProduct {
	
	/*
	 * Pseudo[BruteForce][Time Complexity O[n^2]][Space Complexity O[n]]
	 * Declare a array of length input
	 * iterate over the array
	 * int prod = 1;
	 * 	iterate over the array
	 * 		if(i != j)
	 * 			prod =* arr[j];
	 * out[i] = prod
	 * 
	 * return the output array.
	 */

	
	@Test
	public void example1() {
		int input[] = {1,5,2,3};
		method2(input);
	}
	
	@Test
	public void example2() {
		int input[] = {0,2,0};
		method2(input);
	}
	
	@Test
	public void example3() {
		int input[] = {5,2,-1};
		method2(input);
	}
	
	public void method1(int input[]) {
		int output[] = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			int prod = 1;
			for (int j = 0; j < input.length; j++) {
				if(i!=j) {
					prod*=input[j];
				}
			}
			output[i] = prod;
		}
		System.out.println(Arrays.toString(output));
	}
	
	public void method2(int input[]) {
		int left[] = new int[input.length];
		int right[] = new int[input.length];
		left[0] = 1;
		right[right.length-1] = 1;
		for (int i = 0; i < input.length-1; i++) {
			left[i+1] = left[i] * input[i];
		}
		for(int i = input.length-1;i>0;i--) {
			right[i-1] = right[i] * input[i];
		}
		for (int i = 0; i < input.length; i++) {
			input[i] = left[i] * right[i];
		}
		System.out.println(Arrays.toString(input));
		
	}
	
}
