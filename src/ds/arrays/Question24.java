package ds.arrays;

import java.util.Arrays;

import org.junit.After;
import org.junit.Test;

public class Question24 {
	
	/* Rotate an image */

	@Test
	public void example1() {
		int arr[][] = {{1,2,3}, 
					   {4,5,6},
					   {7,8,9}};
		rotateImage(arr);
	}
	
	@Test
	public void example2() {
		int arr[][] = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
		rotateImage(arr);
	}
	
	@After
	public void after() {
		System.out.println("---------");
	}
	
	
//	Method 1(Time Complexity O[N])
	private void rotateImage(int arr[][]) {
		int out[][] = new int[arr[0].length][arr.length];
		
		for (int i = 0; i < arr[0].length; i++) {
			int k = 0;
			for(int j = arr.length-1; j>=0; j--) {
				System.out.println("I am here");
				out[i][k] = arr[j][i];
				k++;
			}
		}
		
//		for (int i = 0; i < out.length; i++) {
//			for (int j = 0; j < out[i].length; j++) {
//				System.out.print(out[i][j] + ",");
//			}
//			System.out.println();
//		}
		
		System.out.println(Arrays.deepToString(out));
		
	}
	
}
