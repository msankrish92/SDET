package dynamicProgramming;

import org.junit.Test;

public class Fib {

	@Test
	public void example1() {
//		System.out.println(fib(40));
		System.out.println(fibMemo(30,new int[31]));
	}
	@Test
	public void example2() {
//		System.out.println(fib(6));
		System.out.println(fibMemo(6,new int[7]));
	}
	@Test
	public void example3() {
//		System.out.println(fib(6));
		System.out.println(fibMemo(40,new int[41]));
	}

	private int fib(int input) {
		if (input <= 2)
			return 1;
		return fib(input - 1) + fib(input - 2);
	}

	private int fibMemo(int input, int memo[]) {
		if (memo[input] != 0) {
			return memo[input];
		}
		if (input <= 2) {
			return memo[input] = 1;
		}

		return memo[input] = fibMemo(input - 1, memo) + fibMemo(input - 2, memo);

	}

}
