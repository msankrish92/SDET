package ds.arrays;

import org.junit.After;
import org.junit.Test;

public class Question30 {

	/*
	 * Given 2 Strings with length n and (n+1) respectively. The second String
	 * contains all the characters of first but with an extra char. Write the code
	 * to find the extra char
	 */

	@Test//Order
	public void example1() {
		String s1 = "Test";
		String s2 = "Testt";
		extraChar(s1, s2);
	}

	@Test//Jumbled
	public void example2() {
		String s1 = "Hello";
		String s2 = "lloreH";
		extraChar(s1, s2);
	}

	@After
	public void after() {
		System.out.println("===========");
	}

	//Method 1 (Time Complexity O[N^2]
//	private void extraChar(String s1, String s2) {
//		int count = 0;
//		int index = 0;
//		//to iterate over longer String
//		for (int i = 0; i < s2.length(); i++) {
//			//to iterate over small string
//			for (int j = 0; j < s1.length(); j++) {
//				//If Match count will increase
//				//Else last non matched index will be stored
//				if (s2.charAt(i) == s1.charAt(j)) {
//					count++;
//				} else {
//					index = i;
//				}
//			}
//			//If count is less than 0, there is no match, And the index
//			//will be holding last non matched index
//			if (count < 1) {
//				System.out.println(s2.charAt(index));
//			}
//			count = 0;
//		}
//	}

	
//	Method2
	private void extraChar(String s1,String s2) {
		
		
		
		int n = s2.length();
		for (int i = 0; i < n-1; i++) {
			s2 = s2.replaceFirst(s1.substring(i, i+1), "");			
		}
		
		System.out.println(s2);
		
		
	}
	
}
