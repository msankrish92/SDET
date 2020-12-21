package ds.arrays;

import org.junit.After;
import org.junit.Test;

public class Question13 {
	
	/*Given an array nums of n integers where n > 1,  
	 * return an array output such that output[i] is equal to the product 
	 * of all the elements of nums except nums[i].
		Input:  [1,2,3,4]
		Output: [24,12,8,6]
		*/
	
	@Test
	public void example1() {
		int arr[] = {1,2,3,4};
		productAllElement(arr);
	}	
	
	@Test
	public void example2() {
		int arr[] = {1};
		productAllElement(arr);
	}
	
	@Test
	public void example3() {
		int arr[] = {1,2,-2,-4};
		productAllElement(arr);
	}
	
	@After
	public void after() {
		System.out.println("----------");
	}
	
	private void productAllElement(int arr[]) {
		int temp = 1;
		int output[] = new int[arr.length];
		if(arr.length==1) {
			System.out.println("Array is of length one");
		}else {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(i!=j) {
						temp = temp * arr[j];
					}
				}
				output[i] = temp;
				temp = 1;
			}
		}
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
