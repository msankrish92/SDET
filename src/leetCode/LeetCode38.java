package leetCode;

import org.junit.Test;

public class LeetCode38 {

//	@Test
//	public void example1() {
//		int n = 2;
//		System.out.println(method(n));
//	}

	@Test
	public void example2() {
		int n = 3;
		System.out.println(method(n));
	}

//	@Test
	public void example3() {
		int n = 6;
		System.out.println(method(n));
	}

	private String method(int n) {

		int start = 0;
		StringBuilder str = new StringBuilder("1");
		while (start < n) {
			int count = 1;
			char temp = str.charAt(0);
			StringBuilder strTemp = new StringBuilder();
			for (int i = 1; i <= str.length(); i++) {
				if (i == str.length() - 1 && str.charAt(i) == temp) {
					strTemp.append(count).append(str.charAt(i));
				} else if (i == str.length() - 1 && str.charAt(i) == temp) {
					count++;
				} else {
					strTemp.append(count).append(str.charAt(i - 1));
					if (i == str.length() - 1)
						temp = str.charAt(i);
					count = 0;
				}
			}
			count = 0;
			str = strTemp;
			start++;
		}
		return str.toString();

	}

}
