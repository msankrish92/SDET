package revision;

import org.junit.Test;

public class Rev {

	@Test
	public void example1() {
		String input = "abcabcbb";
		method1(input);
		
	}
	
	@Test
	public void example2() {
		String input = "bbbbb";
		method1(input);
		
	}
	
	@Test
	public void example3() {
		String input = "pwwkew";
		method1(input);
		
	}
	
	public void method1(String input) {
		int i = 0;
		int j = 0;
		int maxLength = 0;
		int arr[] = new int[256];
		while(j<input.length()) {
			if(arr[input.charAt(j)] == 0) {
				arr[input.charAt(j)]++;
				j++;
			}else if(arr[input.charAt(j)] == 1){
				maxLength = Math.max(maxLength, j-i);
				arr[input.charAt(i)]--;
				i++;
			}
		}
		System.out.println(maxLength);
	}
	
}
