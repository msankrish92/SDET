package classRoomAssignment;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FindDups {

	/*
	 * Loop through the array
	 * try adding it to set
	 * if it fails return that
	 */
	
	
	@Test
	public void example1() {
		int arr[] = {1,2,3,4,5,5};
		System.out.println(method1(arr));
	}
	
	@Test
	public void example2() {
		int arr[] = {1,2,3,4,5};
		System.out.println(method1(arr));
	}
	
	@Test
	public void example3() {
		int arr[] = {1,2,2,4,5};
		System.out.println(method1(arr));
	}
	
	private int method1(int arr[]) {
		Set<Integer> st = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if(!st.add(arr[i])) {
				return arr[i];
			}
		}
		return -1;
	}
}
