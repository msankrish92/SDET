package assignment1;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

import org.junit.Test;

public class SubsequenceRemoval {

	@Test
	public void example1() {
		int[] arr = { 2, 1, 3, 1, 4, 1, 3 };
		method1(arr);

	}

//	@Test
//	public void example2() {
//		int arr[] = { 1, 1, 1, 3 };
//		System.out.println(method1(arr));
//	}
//
//	@Test
//	public void example3() {
//		int arr[] = { 3, 2, 2, 1, 1 };
//		System.out.println(method1(arr));
//	}

	
//pseudo
//Create a set to hold unique integer
//Create a list to hold removed subsequence
//for loop over the array
//If i am able to add it do nothing
//if not add to the list
//loop over the list
//if all the element to its left is less found the ascending subsequence
//print the lenght of the list
//if not print -1
	public void method1(int arr[]) {
		Set<Integer> st = new HashSet<Integer>();
		List<Integer> dsst = new ArrayList<Integer>();
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (!st.add(arr[i])) {
				dsst.add(arr[i]);
			}
		}
		

		for (int i = 0; i < dsst.size() - 1; i++) {
			if (!(dsst.get(i) <= dsst.get(i + 1))) {
				flag = false;
			}
		}

		if(dsst.size() == st.size() && flag) {
			
		}
		
		
	}

}
