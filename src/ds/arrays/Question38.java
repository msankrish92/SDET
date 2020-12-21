package ds.arrays;

import org.junit.After;
import org.junit.Test;

public class Question38 {

	@Test
	public void example1() {
		int input[] = {3,4,2,7,1,2,4,5};
		leader(input);
	}
	
	@Test
	public void example2() {
		int input[] = {5,6,7,8};
		leader(input);
	}
	
	@Test
	public void example3() {
		int input[] = {-4,-5,2,7,1,2,4,5};
		leader(input);
	}
	
	@After
	public void after() {
		System.out.println("====");
	}
	
//	private void leader(int arr[]) {
//		boolean flag = false;
//		for (int i = 0; i < arr.length-1; i++) {
//			flag = false;
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i]>arr[j] && j ==arr.length-1) {
//					flag = true;
//				}
//			}
//			if(flag) {
//				System.out.println(arr[i]);
//			}
//		}
//		System.out.println(arr[arr.length-1]);
//	}
	
	
	private void leader(int arr[]) {
		int max = 0;
		for (int i = arr.length-1; i > 0; i--) {
			if(max<arr[i]) {
				max = arr[i];
				System.out.println(arr[i]);
			}
		}
	}
}
