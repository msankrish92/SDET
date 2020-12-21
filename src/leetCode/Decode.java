package leetCode;

import org.junit.Test;

public class Decode {
	
//	@Test
//	public void example() {
//		String s = "3[a]2[bc]";
//		method1(s);
//	}
//	
//	@Test
//	public void example1() {
//		String s = "3[a2[c]]";
//		method1(s);
//	}
	
	@Test
	public void example2() {
		String s = "abc3[cd]xyz";
		method1(s);
	}
	
	private void method1(String s) {
		int sqareCount = 0;
		StringBuilder str = new StringBuilder();
		StringBuilder out = new StringBuilder();
		for (int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) == ']') {
				sqareCount++;
			}
			if(s.charAt(i) == '[') {
				sqareCount--;
			}
			if(Character.isAlphabetic(s.charAt(i))) {
				str.append(s.charAt(i));
			}
			if(Character.isDigit(s.charAt(i))) {
				for (int j = 0; j < Integer.parseInt(s.charAt(i) + ""); j++) {
					out.append(str);
				}
				if(sqareCount == 0 ) {
					str.setLength(0);
				}else {
					str = new StringBuilder(out.toString());
					out.setLength(0);
					
				}
			}
			
		}
		System.out.println(out.reverse());
	}

}
