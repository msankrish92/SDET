package ds.arrays;

import org.junit.After;
import org.junit.Test;

public class Question29 {

	/* Given two sorted arrays A1, A2. Write a code to find median of the arrays */
	
	@Test
	public void example1() {
		int a1[] = {1,3};
		int a2[] = {2};
		median(a1, a2);
	}
	
	@Test
	public void example2() {
		int a1[] = {1,2};
		int a2[] = {3,4};
		median(a1, a2);
	}
	
	@Test
	public void example3() {
		int a1[] = {1,2};
		int a2[] = {};
		median(a1, a2);
	}
	
	@After
	public void after() {
		System.out.println("========");
	}
	
	//Method 1 (Time Complexity O[N])
	public void median(int a1[], int a2[]) {
		double total = 0;
		//Iterate over first array and get the total value
		for (int i = 0; i < a1.length; i++) {
			total += a1[i];
		}
		//Iterate over second array and get the total value
		for (int i = 0; i < a2.length; i++) {
			total += a2[i];
		}
		//Calculate median				
		System.out.println(total/(a1.length + a2.length));
	}
}
