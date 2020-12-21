package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class PaintHouse {

	@Test
	public void example1() {
		int[][] arr = { {17,2,17}, {16,16,5}, {14,3,9} };
		paintHouse(arr);
	}
	
	@Test
	public void example3() {
		int[][] arr = { {17,2,17}, {16,16,5}, {14,9} };
		paintHouse(arr);
	}
	
	@Test
	public void example2() {
		int[][] arr = {{}};
		paintHouse(arr);
	}
	
	private void paintHouse(int arr[][]) {
		int previousIndex = -1;
		int totalCost = 0;
		for(int i = 0; i<arr.length; i++) {
			int min = Integer.MAX_VALUE;
			for(int j = 0; j<arr[i].length; j++) {
				if(arr[i][j]<min && previousIndex != j) {
					min = arr[i][j];
					previousIndex = j;
				}
			}
			totalCost += min; 
		}
		System.out.println(totalCost);
	}

}
