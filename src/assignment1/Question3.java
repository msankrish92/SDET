package assignment1;

import org.junit.Test;

public class Question3 {

	/**
	 * Split the input to char Array if the input is less than 0 Iterate over it if
	 * the current value is greater than adding value we need to add it at frong
	 * else move untill you find one or add it at the end else if the current value
	 * is lesser than adding vale we need to add it at front else move untill you
	 * find one or add it at the end
	 */

	@Test
	public void example1() {
		int n = 1234;
		int k = 5;
		System.out.println(method1(n,k));
	}

	@Test
	public void example2() {
		int n = 7643;
		int k = 5;
		System.out.println(method1(n,k));
	}

	@Test
	public void example3() {
		int n = -661;
		int k = 5;
		System.out.println(method1(n,k));
	}
	
	@Test
	public void example4() {
		int n = -444;
		int k = 5;
		System.out.println(method1(n,k));
	}

	private int method1(int input, int k) {
		char chr[] = (input + "").toCharArray();
		StringBuilder str = new StringBuilder();
		boolean flag = true;
		if (input > 0) {
			for (int i = 0; i < chr.length; i++) {
				if (Integer.parseInt(chr[i] + "") < k && flag) {
					str.append(k);
					flag =false;
				}
				str.append(chr[i]);
			}
		} else {
			for (int i = 1; i < chr.length; i++) {
				if (Integer.parseInt(chr[i] + "") > k && flag) {
					str.append(k);
					flag =false;
				}
				str.append(chr[i]);
			}
			if(flag) {
				str.append(k);
			}
		}
		
		if(input<0) {
			return Integer.parseInt(str.toString()) - (Integer.parseInt(str.toString()) * 2);
		}
		
		return Integer.parseInt(str.toString());
	}
	
	private int method2(int input, int k) {
		
		int neg = 1;
//		
//		if(input)
		
		
		
		
		
		
		
		
		
		return 0;
	}
}
