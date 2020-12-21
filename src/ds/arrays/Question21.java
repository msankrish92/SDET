package ds.arrays;

import java.util.Stack;

import org.junit.Test;

public class Question21 {


	/*
	 * Given an encoded string, return its decoded string.
	 * 
	 * Input: s = "3[a]2[bc]" Output: "aaabcbc"
	 * 
	 * Input: s = "3[a2[c]]" Output: "accaccacc"
	 */	

	//	@Test
	//	public void example() {
	//		String input = "3[a]2[bc]";
	//		decode(input);
	//	}

	@Test
	public void example1() {
		String input = "3[a2[c]]";
		System.out.println(decodeString(input));
	}

	//	private void decode(String input) {
	//		StringBuilder bdr = new StringBuilder();
	//		StringBuilder output = new StringBuilder();
	//		int no = 0;
	//		for (int i = input.length()-1; i > 0; i--) {
	//			if(input.charAt(i) == ']') {
	//				for (int j = i; j > 0 && input.charAt(j-1) != '['; j--) {
	//					bdr.append(input.charAt(j-1));
	//					no++;
	//				}
	//				i = i -no;
	//			}else if(input.charAt(i) == '[') {
	//
	//				int iter = Integer.parseInt(String.valueOf(input.charAt(i-1)));
	//				for (int k = 0; k < iter; k++) {
	//					output.append(bdr);
	//				}
	//				bdr = new StringBuilder();
	//				no = 0;
	//			}
	//		}
	//		System.out.println(output.reverse().toString());
	//	}

	private String decodeString(String s) {
		Stack<Integer> counts = new Stack();
		Stack<String> result = new Stack();
		String res = "";
		int index = 0;
//		String input = "3[a2[c]]";
		while(index < s.length()) {
			if(Character.isDigit(s.charAt(index))) {
				int count = 0;
				while(Character.isDigit(s.charAt(index))) {
//					char value of 0 is 48 and char value of 3 is 51, so 51-48 = 3
					count = 10 * count + (s.charAt(index)-'0');
					index += 1;
				}
				counts.push(count);
			}else if(s.charAt(index) == '[') {
				result.push(res);
				res = "";
				index +=1;
			}else if(s.charAt(index) == ']') {
				StringBuilder temp = new StringBuilder(result.pop());
				int count = counts.pop();
				for (int i = 0; i < count; i++) {
					temp.append(res);
				}
				res = temp.toString();
				index += 1;
			} else {
				res += s.charAt(index);
				index += 1;
			}
		}
		return res;


	}
}






