package ds.arrays;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;

/*Given a string, how many palindromic substrings in this string.*/

public class Question28 {

//	@Test
//	public void example1() {
//		String input = "aaa";
//		palindrome(input);
//	}

	@Test
	public void example2() {
		String input = "aabc";
		palindrome(input);
	}
//	
//		@Test
//		public void example3() {
//			String input = "abc";
//			palindrome(input);
//		}

	@After
	public void after() {
		System.out.println("============");
	}

//	 Method 1 Time Complexity O[N^3]
		private void palindrome(String str) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < str.length() - i; j++) {
					String temp = str.substring(j, j + 1 + i);
	
					StringBuilder string = new StringBuilder(temp);
					String string2 = string.reverse().toString();
	
					if (temp.equals(string2)) {
						System.out.println(temp);
						count++;
					}
				}
			}
			System.out.println(count);
		}

	
}
