package revision;

import java.util.Arrays;

import org.junit.Test;

public class SortThreeCharacters {
	
	/*
	 * Pseudo[DutchFlag]
	 * Declare three pointer low = 0 mid = 0 and high = input.length
	 * while mid lesser than or equal to high
	 * if(mid==A)
	 * 	swap it with low
	 * 	increment low and mid
	 * if(mid==D)
	 * 	increment mid
	 * if(mid==M)
	 * 	swap with high
	 *  decrement high
	 */

	@Test
	public void example1() {
		String input = "DDMMAA";
		method2(input);
	}
	
	@Test
	public void example2() {
		String input = "MMAAAAADD";
		method1(input);
	}
	
	@Test
	public void example3() {
		String input = "MMAAA";
		method1(input);
	}
	
	private void method1(String input) {
		
		int low = 0,mid = 0,high = input.length()-1;
		char chArr[] = input.toCharArray();
		while(mid<=high) {
			if(chArr[mid] == 'A') {
				char temp = chArr[low];
				chArr[low] = chArr[mid];
				chArr[mid] = temp;
				low++;
				mid++;
			}else if(chArr[mid] == 'D'){
				mid++;
			}else {
				char temp = chArr[mid];
				chArr[mid] = chArr[high];
				chArr[high] = temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(chArr));
		
	}
	
	private void method2(String input) {
		StringBuilder strA = new StringBuilder();
		StringBuilder strD = new StringBuilder();
		StringBuilder strM = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'A') {
				strA.append('A');
			}else if(input.charAt(i) == 'D') {
				strD.append('D');
			}else {
				strM.append('M');
			}
		}
		System.out.println(strA.toString()+strD.toString()+strM.toString());
	}
}
