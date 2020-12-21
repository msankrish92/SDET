package ds.arrays;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;

public class Question37 {

	@Test
	public void example1() {
		String input1 = "amazon";
		String input2 = "india";
		nonMatching(input1, input2);
	}

	@Test
	public void example2() {
		String input1 = "amazon";
		String input2 = "bill";
		nonMatching(input1, input2);
	}

	@Test
	public void example3() {
		String input1 = "amazon";
		String input2 = "amazon";
		nonMatching(input1, input2);
	}

	@After
	public void after() {
		System.out.println("==========");
	}

//	private void nonMatching(String inp1, String inp2) {
//		char input1[] = inp1.toCharArray();
//		char input2[] = inp2.toCharArray();
//		int count = 0;
//
//		for (int i = 0; i < input1.length; i++) {
//			count = 0;
//			for (int j = 0; j < input2.length; j++) {
//				if (input1[i] == input2[j]) {
//					count++;
//				}
//			}
//			if (count == 0) {
//				System.out.print(input1[i] + " ");
//			}
//
//		}
//
//		for (int i = 0; i < input2.length; i++) {
//			count = 0;
//			for (int j = 0; j < input1.length; j++) {
//				if (input2[i] == input1[j]) {
//					count++;
//				}
//			}
//			if (count == 0) {
//				System.out.print(input2[i] + " ");
//			}
//		}
//
//	}
	
	private void nonMatching(String inp1, String inp2) {
		
	}

}
