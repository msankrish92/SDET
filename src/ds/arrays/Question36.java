package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class Question36 {

	@Test
	public void example1() {
		int arr[] = {1,0,5,9,0,0,6,8};
		allZero(arr);
	}
	
	@Test
	public void example2() {
		int arr[] = {2,5,8,10};
		allZero(arr);
	}
	
//	Method 1 (Time complexity O[n])
	private void allZero(int input[]) {
		int count = 0;
		int output[] = new int[input.length];
		int outIndex = 0;
		
		for (int i = 0; i < input.length; i++) {
			if(input[i]!=0) {
				output[outIndex++] = input[i];
				count++;
			}
		}
		
		System.out.println(Arrays.toString(output));
		
	}
	
//	Method 2
//	private void allZero(int input[]) {
//		
//	}
	
}
