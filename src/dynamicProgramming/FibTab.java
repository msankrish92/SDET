package dynamicProgramming;

import java.util.Arrays;

import org.junit.Test;

public class FibTab {

	@Test
	public void example1() {
		System.out.println(fib(40));
//		System.out.println(fibMemo(30,new int[31]));
	}

	@Test
	public void example2() {
		System.out.println(fib(6));
//		System.out.println(fibMemo(6,new int[7]));
	}

	@Test
	public void example3() {
		System.out.println(fib(7));
//		System.out.println(fibMemo(40,new int[41]));
	}

	private int fib(int input) {
		int arr[] = new int[input + 1];
		Arrays.fill(arr, 0);
		arr[1] = 1;

		for (int i = 0; i <= input; i++) {
			if (i + 1 <= input)
				arr[i + 1] += arr[i];
			if (i + 2 <= input)
				arr[i + 2] += arr[i];
		}

		return arr[input];
	}

}
