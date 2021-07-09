package leetCode;

import org.testng.annotations.Test;

public class LeetCode1004 {

	@Test
	public void example1() {
		int input[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		System.out.println(method1(input, 2));
	}

	@Test
	public void example2() {
		int input[] = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
		System.out.println(method1(input, 3));
	}
	
	@Test
	public void example3() {
		int input[] = { 0, 0, 0, 1 };
		System.out.println(method1(input, 4));
	}
	
	@Test
	public void example4() {
		int input[] = { 1,1,1,0,0,0,1,1,1,1 };
		System.out.println(method1(input, 0));
	}

	public int method1(int input[], int k) {
		if(input.length == k) return k;
		int i = 0, j = 0;
		int max = 0;
		int zeros = 0;
		while (j < input.length) {
			if (k < zeros) {
				max = Math.max((j - i) - 1, max);
				if (input[i] != 1) {
					zeros--;
					i++;
				} else {
					i++;
				}
			} else if (input[j] == 1) {
				j++;
			} else if (input[j] == 0) {
				zeros++;
				j++;
			}

		}
		return zeros<=k?Math.max(max, j-i):Math.max(max, (j-i)-1);
	}

}
