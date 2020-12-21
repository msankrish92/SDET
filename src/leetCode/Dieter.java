package leetCode;

import org.junit.Test;

public class Dieter {

	@Test
	public void example1() {
		int[] calories = {1,2,3,4,5};
		int k = 1;
		int lower = 3;
		int upper = 3;
		method1(calories, k, lower, upper);
	}
	
	@Test
	public void example2() {
		int[] calories = {3,2};
		int k = 2;
		int lower = 0;
		int upper = 1;
		method1(calories, k, lower, upper);
	}
	
	@Test
	public void example3() {
		int[] calories = {6,5,0,0};
		int k = 2;
		int lower = 1;
		int upper = 5;
		method1(calories, k, lower, upper);
	}
	
	public void method1(int cal[], int k, int lower, int upper) {
		int count = 0;
		for (int i = 0; i < cal.length; i++) {
			int totalCal = 0;
			int rept = 0;
			for (int j = i; j<cal.length && j < i+k; j++) {
				totalCal += cal[j];
				rept++;
			}
			if(rept == k && totalCal<lower) {
				count--;
			}
			if(rept == k && totalCal>upper) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
}
