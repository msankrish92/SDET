package ds.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Test;

public class Question33 {

	/* In a given string, find the second least repeating character */
	
	@Test
	public void testData1() {	
		System.out.println("TestData1");
//		String input = "Teammate";
		String input = "paypal";
		repeatingCharacter(input);
	}


//	@Test
//	public void testData2() {
//		System.out.println("TestData2");
//		String input = "Te@m";
//		repeatingCharacter(input);
//	}
//
//	@Test
//	public void testData3() {
//		System.out.println("TestData3");
//		String input = "aaabbc";
//		repeatingCharacter(input);
//	}
//
//	@Test
//	public void testData4() {
//		System.out.println("TestData4");
//		String input = "paypalindia";
//		repeatingCharacter(input);
//	}
//
//	@Test
//	public void testData5() {
//		System.out.println("TestData5");
//		String input = "tata";
//		repeatingCharacter(input);
//	}
//
	/**
	 * Should we pick
	 */
//	@Test
//	public void testData6() {
//		System.out.println("TestData6");
//		String input = "Milk was hot";
//		repeatingCharacter(input);
//	}

	@After
	public void afterMethod() {
		System.out.println("-----------------------------------");
	}
//	Method 1 (Time Complexity O[n])
	private void repeatingCharacter(String input) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		//O[n]
		for (int i = 0; i < input.length(); i++) {
			map.put(input.charAt(i),map.getOrDefault(input.charAt(i), 0)+1);
		}
		//o[n]
		int max = Collections.max(map.values());
		int secondMax = 0;
		char output = 0;
		//o[n]
		for(Map.Entry<Character, Integer> a : map.entrySet()) {
			if(a.getValue()<max && a.getValue()>secondMax) {
				secondMax = a.getValue();
				output = a.getKey();
			}
		}
		if(!(secondMax == max)) {
			System.out.println(output);
		}else {
			System.out.println("");
		}
	}
	
	
	
}
