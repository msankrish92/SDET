package leetCode;

import org.junit.Test;

public class Sqroot {

//	Pseudo
//	starting from 0 until its out multiplication is greater than given value;
	
	
//	@Test
//	public void example1() {
//		int i = 7;
//		System.out.println(sqroot(i));
//	}
//	
//	@Test
//	public void example2() {
//		int i = 27;
//		System.out.println(sqroot(i));
//	}
	@Test
	public void example3() {
		int i = 2147395600;
		System.out.println(sqroot(i));
	}
	
	private int sqroot(int i) {
		double out = 0;
		double j = 0;
		
		while((j*j)<=i) {
			if(j==46340 || j==46341) {
				System.out.println(j + " " + j*j);
			}
			out = j;
			j++;
		}
		
		return (int)out;
		
	}
	
}
