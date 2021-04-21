package leetCode;

import org.junit.Test;

public class LeetCode29 {

//	@Test
//	public void example1() {
//		int dividend = 10;
//		int divisor = 3;
//		System.out.println(method2(dividend, divisor));
//	}
//	
//	@Test
//	public void example2() {
//		int dividend = 7;
//		int divisor = -3;
//		System.out.println(method2(dividend, divisor));
//	}
//	@Test
//	public void example3() {
//		int dividend = 1;
//		int divisor = 2;
//		System.out.println(method2(dividend, divisor));
//	}

//	@Test
//	public void example4() {
//		int dividend = -2147483648;
//		int divisor = -1;
//		System.out.println(method2(dividend, divisor));
//	}
	
	@Test
	public void example4() {
		int dividend = 36;
		int divisor = 3;
		System.out.println(method2(dividend, divisor));
	}

//	public int method1(int dividend, int divisor) {
//		int sign = 1;
//		if (divisor < 0 || dividend < 0)
//			sign = -1;
//		if (divisor < 0 && dividend < 0)
//			sign = 1;
//		if (dividend == Integer.MIN_VALUE) {
//			dividend = Integer.MAX_VALUE;
//		}
//		if (divisor == 0 || dividend == 0 || Math.abs(dividend) < Math.abs(divisor))
//			return 0;
//
//		int count = 1;
//		int temp = Math.abs(divisor);
//		while (Math.abs(dividend) >= Math.abs(divisor) + Math.abs(temp)) {
//			if (divisor == Integer.MIN_VALUE)
//				return count + 1 * sign;
//			divisor = Math.abs(divisor) + Math.abs(temp);
//
//			count++;
//		}
//		return count * sign;
//	}

	public int method2(int dividend, int divisor) {
		int sign = 1;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
			sign = -1;
		long ldividend = Math.abs((long) dividend);
		long ldivisor = Math.abs((long) divisor);
		
		//Take care the edge cases.
		if (ldivisor == 0) return Integer.MAX_VALUE;
		if ((ldividend == 0) || (ldividend < ldivisor))	return 0;
		
		long lans = ldivide(ldividend, ldivisor);
		
		int ans;
		if (lans > Integer.MAX_VALUE){ //Handle overflow.
			ans = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
		} else {
			ans = (int) (sign * lans);
		}
		return ans;
	}

	private long ldivide(long ldividend, long ldivisor) {
		// Recursion exit condition
		if (ldividend < ldivisor) return 0;
		
		//  Find the largest multiple so that (divisor * multiple <= dividend), 
		//  whereas we are moving with stride 1, 2, 4, 8, 16...2^n for performance reason.
		//  Think this as a binary search.
		long sum = ldivisor;
		long multiple = 1;
		while ((sum+sum) <= ldividend) {
			sum += sum;
			multiple += multiple;
		}
		//Look for additional value for the multiple from the reminder (dividend - sum) recursively.
		return multiple + ldivide(ldividend - sum, ldivisor);
	}
}
