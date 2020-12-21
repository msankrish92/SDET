package ds.arrays;

import org.junit.After;
import org.junit.Test;

public class Question27 {
	
	/* Given a matrix, print it in Reverse Wave Form. */

	@Test
	public void example1() {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		reverseWaveForm(arr);
	}

	@Test
	public void example2() {
		int arr[][] = { { 1, 2, 3, 4 } };
		reverseWaveForm(arr);
	}

	@Test
	public void example3() {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		reverseWaveForm(arr);
	}
	
	@After
	public void after() {
		System.out.println();
		System.out.println("===========");
	}
	
	//Method 1 (Time Complexity O[N])
	private void reverseWaveForm(int arr[][]) {
		int direction = 0;
		for (int i = arr[0].length-1; i >= 0; i--) {
			if(direction == 0) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j][i] + ",");
				}
				direction = 1;
			}else {
				for (int j = arr.length-1; j >= 0; j--) {
					System.out.print(arr[j][i]+ ",");
				}
				direction = 0;
			}
		}
		
	}

}
