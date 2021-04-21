package medtronicInterview;

import java.util.Arrays;

import org.junit.Test;

public class Question2 {

	@Test
	public void example1() {
//		1,0,3,0,0,5,8,0
//		1,3,5,8,0,0,0,0
		int inp[] = {1,0,3,0,0,0,5,8,0};
		method1(inp);

	}
	
	
	
	//Pseudo
	//Initialize two pointer i and j
	//iterate over the array if it non zero increment both i and j
	//else increment j look for non zero value and swap it.
	
	public void method1(int arr[]) {
		int i = 0;
		int j = 0;
		
		while(j<arr.length) {
			if(arr[j]!=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
				i++;
				j++;
			}else {
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
}
