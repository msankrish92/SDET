package assignment1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Question1 {
	
	/**
	 * Pseudo
	 * Declare two variable i and j
	 * Declare a linkedList
	 * Loop until i lesser than or equal to j
	 * if it is multiple of 3 and 5 add “FizzBuzz” to the list
	 * if it is multiple of 3 add “Fizz” to the list
	 * if it is multiple of 5 add “Buzz” to the list
	 * 
	 */

	@Test
	public void example1() {
		int n = 15;
		System.out.println(method(n));
	}
	
	@Test
	public void example2() {
		int n = 2;
		System.out.println(method(n));
	}
	
	@Test
	public void example3() {
		int n = 0;
		System.out.println(method(n));
	}
	
	private List<String> method(int n) {
		int i = 1;
		List<String> lst = new ArrayList<>();
		while(i<=n) {
			if(i%3 == 0 && i%5 == 0) {
				lst.add("FizzBuzz");
			}else if(i%3==0) {
				lst.add("Fizz");
			}else if(i%5==0) {
				lst.add("Buzz");
			}else {
				lst.add(i+"");
			}
			i++;
		}
		return lst;
	}
	
	
	
}
