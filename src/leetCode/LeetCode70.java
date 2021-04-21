package leetCode;

import org.junit.Test;

public class LeetCode70 {

	@Test
	public void example1() {
		int n = 4;
		System.out.println(method2(n));
	}

	@Test
	public void example2() {
		int n = 2;
		System.out.println(method3(n));
	}

	@Test
	public void example3() {
		int n = 1;
		System.out.println(method1(n));
	}

	int counter = 0;

	/*-
	 * Pseudo[Recursion][Time Complexity O[N^2]]
	 * Create a global variable counter 
	 * Create a recursive function with currentStair, target 
	 * if(start ==end) -> counter++
	 * if(start>end) -> return; 
	 * for(start to 2) 
	 * recursiveFunction(start,end,counter)
	 * 
	 * return
	 */

	private int method1(int n) {
		noOfWays(n, 0);
		return counter;
	}

	private void noOfWays(int end, int curStep) {
		if (curStep == end) {
			counter++;
			return;
		}
		if (curStep > end)
			return;
		for (int i = 1; i <= 2; i++) {
			noOfWays(end, curStep + i);
		}
		return;
	}

	/*-
	 * Pseudo[Top Down DP Memoization][Time Complexity O[N]]
	 * Create a recursive function currentStair, target, dp array
	 * if(currentStair == target) -> return 1
	 * if(currentStair > target) -> return 0
	 * if(dp[currentStair] != 0) -> return dp[currentStair]
	 * 
	 * dp[currentStair] = recFun(currentStair +1 , target, dp) + recFun(currentStair +2 , target, dp)
	 * 
	 * return dp[currentStair]
	 * 
	 */

	private int method2(int n) {
		int dp[] = new int[n];
		return noOfWays1(0, n, dp);
	}

	private int noOfWays1(int currentStair, int target, int dp[]) {
		if (currentStair == target) {
			return 1;
		}
		if (currentStair > target) {
			return 0;
		}
		if (dp[currentStair] != 0)
			return dp[currentStair];

		dp[currentStair] = noOfWays1(currentStair + 1, target, dp) + noOfWays1(currentStair + 2, target, dp);
		return dp[currentStair];
	}

	/*-
	 * Pseudo[Bottom up approach][Time Complexity O[n]]
	 * create dp array of length n + 1
	 * base case
	 * dp[0] = 1
	 * dp[1] = 1
	 * for(2 to n)
	 * dp[i] = dp[i-1] + dp[i-2]
	 * 
	 * return dp[n]
	 * 
	 */

	private int method3(int n) {
		int dp[] = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
	
	/*-
	 * Pseudo[Fibonacci type][Time Complexity O[N]]
	 * int first = 1;
	 * int second = 1;
	 * for(2 to n)
	 * int third = first + second
	 * first = second;
	 * second = third;
	 * 
	 * 
	 * return second;
	 */

	private int method4(int n) {
		int first = 1;
		int second = 1;
		for (int i = 2; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}

}
