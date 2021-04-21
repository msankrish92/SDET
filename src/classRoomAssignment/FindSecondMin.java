package classRoomAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

public class FindSecondMin {

	@Test
	public void example1() {
		int arr[] = { 2, 4, 1, 3, 7, 11, -1};
		method2(arr);
	}

//	@Test
//	public void example2() {
//		int arr[] = { 10, 4, 1, 3, 7, 11, -1 };
//		method2(arr);
//	}
//	
//	@Test
//	public void example3() {
//		int arr[] = { 9, 4, 1, 3, 7, 11, 10 };
//		method2(arr);
//	}
//	
//	@Test
//	public void example4() {
//		int arr[] = { 9, 4, 1, 3, 7, 11, 11 };
//		method2(arr);
//	}

	private void method1(int arr[]) {
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secMax = max;
				max = arr[i];
			} else if (arr[i] < max && arr[i] > secMax) {
				secMax = arr[i];
			}
		}
		System.out.println(secMax);
	}
	
	private void method2(int arr[]) {
		Set<Integer> st = new HashSet<Integer>();
		for(int a : arr)
			st.add(a);
		List<Integer> lst = new ArrayList<>(st);
		Collections.sort(lst);
		System.out.println(lst.get(lst.size()-2));
	}

}
