package ds.arrays;

import java.util.Arrays;



import org.junit.jupiter.api.Test;

public class SumIndices1 {

	@Test
	public void example1() {
		int[] number = {2,3,1,4,7,8};
		int target = 5;
		int[] sumIndicies = getSumIndicies(number, target);
		System.out.println(Arrays.toString(sumIndicies));
		
	}
	
	@Test
	public void example2() {
		int[] number = {1,3,1,-2,7};
		int target = 5;
		int[] sumIndicies = getSumIndicies(number, target);
		System.out.println(Arrays.toString(sumIndicies));
	}
	
	@Test
	public void examplee() {
		int[] number = {0,3,5,-2,7};
		int target = 5;
		int[] sumIndicies = getSumIndicies(number, target);
		System.out.println(Arrays.toString(sumIndicies));
	}
	
	
	
	private int[] getSumIndicies(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] + numbers[j] == target) {
//					System.out.println("The indices: " + i + "&" + j);
					return new int[] {i,j};
				}
			}
		}
		throw new RuntimeException("There is no matching indices");
	}
	
	
}
