package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class WordToNumber {

	/**
	 * Pseudo create map with key as string representation of number and value as
	 * numeric representation return using map get function
	 */
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	@Test
	public void example1() {
		String input = "one hundred";
		System.out.println(wordToNumber(input));
	}

	@Test
	public void example2() {
		String input = "fifty six";
		System.out.println(wordToNumber(input));
	}

	@Test
	public void example3() {
		String input = "six hundred one";
		System.out.println(wordToNumber(input));
	}

	@Test
	public void example4() {
		String input = "six thousand one hundred";
		System.out.println(wordToNumber(input));
	}

	@Test
	public void example5() {
		String input = "six thousand";
		System.out.println(wordToNumber(input));
	}

	@Test
	public void example6() {
		String input = "one hundred thousand one";
		System.out.println(wordToNumber(input));
	}

	@Test
	public void example7() {
		String input = "one hundred twenty thousand four hundred";
		System.out.println(wordToNumber(input));
	}
	
	@Test
	public void example8() {
		String input = "one million two hundred four thousand";
		System.out.println(wordToNumber(input));
	}
	
	@Test
	public void example9() {
		String input = "one hundred twenty million four thousand";
		System.out.println(wordToNumber(input));
	}

	private int wordToNumber(String input) {
		map.put("zero", 0);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
		map.put("eleven", 11);
		map.put("twelve", 12);
		map.put("thirteen", 13);
		map.put("fourteen", 14);
		map.put("fifteen", 15);
		map.put("sixteen", 16);
		map.put("seventeen", 17);
		map.put("eighteen", 18);
		map.put("nineteen", 19);
		map.put("ten", 10);
		map.put("twenty", 20);
		map.put("thirty", 30);
		map.put("fourty", 40);
		map.put("fifty", 50);
		map.put("sixty", 60);
		map.put("seventy", 70);
		map.put("eighty", 80);
		map.put("ninety", 90);
//		int str = 0;
		return recursiveFunction(new ArrayList<>(Arrays.asList(input.split(" "))), 0, 0, 0);
	}

	/*
	 * // public String recursiveFunction(List<String> input, Map<String,Integer>
	 * map) { // if(input.size() == 6) { // return map.get(input.get(0)) + "" +
	 * map.get(input.get(2)) + "" + map.get(input.get(4)) + "" +
	 * map.get(input.get(5)); // } // if(input.size() == 4) { // return
	 * map.get(input.get(0)) + "" + map.get(input.get(2)) + "" +
	 * map.get(input.get(3)); // } // if(input.size() == 2) { // if(input.get(1) ==
	 * "hundred") return (map.get(input.get(0)) * 100) + ""; //
	 * System.out.println(map.get(input.get(0)) * 1000 + ""); //
	 * if(input.get(1).equals("thousand")) return (map.get(input.get(0)) * 1000 +
	 * ""); // return map.get(input.get(0)) + "" + map.get(input.get(1)); // } //
	 * return map.get(input.get(0)) + ""; // }
	 * 
	 * // public int recursiveFunction(List<String> input, Map<String, Integer> map,
	 * int out) { // // if (input.size() > 1) { // if (input.contains("million")) {
	 * // out = out + map.get(input.get(0)) * 1000000; // input.remove("million");
	 * // input.remove(input.remove(0)); // return recursiveFunction(input, map,
	 * out); //// }else if(input.contains("crore")) { //// out = out +
	 * map.get(input.get(0)) * 1000000; //// input.remove("thousand"); ////
	 * input.remove(input.remove(0)); //// return recursiveFunction(input, map,
	 * out); //// }else if(input.contains("lakhs")) { //// out = out +
	 * map.get(input.get(0)) * 1000000; //// input.remove("thousand"); ////
	 * input.remove(input.remove(0)); //// return recursiveFunction(input, map,
	 * out); // } else if (input.contains("thousand")) { // out = out +
	 * map.get(input.get(0)) * 1000; // input.remove("thousand"); //
	 * input.remove(0); // return recursiveFunction(input, map, out); // } else if
	 * (input.contains("hundred")) { // if (input.get(0).equals("hundred")) { // out
	 * *= 100; // input.remove("hundred"); // } else { // out = out +
	 * map.get(input.get(0)) * 100; // input.remove("hundred"); // input.remove(0);
	 * // } // return recursiveFunction(input, map, out); // } else { // out = out +
	 * map.get(input.get(0)); // input.remove(input.get(0)); // return
	 * recursiveFunction(input, map, out); // } // } // if (input.size() == 1) ////
	 * if (input.contains("hundred")) { //// out = out * 100; ////
	 * input.remove("hundred"); //// return recursiveFunction(input, map, out); ////
	 * } else { // out = out + map.get(input.get(0)); //// } // return out; // }
	 */

	public int recursiveFunction(List<String> input, int result, int finalResult, int index) {

		if (index == input.size()) {
			return result + finalResult;
		}
		if(input.get(index).equals("billion")) {
			result = result * 1000000000;
			finalResult = finalResult + result;
			result = 0;
			return recursiveFunction(input, result, finalResult, index + 1);
		}else if (input.get(index).equals("million")) {
			result = result * 1000000;
			finalResult = finalResult + result;
			result = 0;
			return recursiveFunction(input, result, finalResult, index + 1);
		} else if (input.get(index).equals("thousand")) {
			result = result * 1000;
			finalResult = finalResult + result;
			result = 0;
			return recursiveFunction(input, result, finalResult, index + 1);
		} else if (input.get(index).equals("hundred")) {
			result = result * 100;
			return recursiveFunction(input, result, finalResult, index + 1);
		} else {
			result = map.get(input.get(index)) + result;
			return recursiveFunction(input, result, finalResult, index + 1);
		}

	}

}
