package classRoomAssignment;

import java.util.Arrays;

import org.junit.Test;

public class RemoveGivenNumber {

//	Declare a variable to get the given number count
//	use for loop to iterate over the array and get the count of the given number
//	Minus it with the array length to get the length without it
	
	@Test
	public void example1() {
		int arr[] = {0,1,2,2,3,0,4,2};
		int n = 2;
		System.out.println(removeGivenNumber(arr, n));
	}
	
	@Test
	public void example2() {
		int arr[] = {0,1,2,2,3,0,4,2};
		int n = 7;
		System.out.println(removeGivenNumber(arr, n));
	}
	
	@Test
	public void example3() {
		int arr[] = {0,1,2,2,3,0,4,2};
		int n = 0;
		System.out.println(removeGivenNumber(arr, n));
	}
	
	//BruteForce
	public int removeGivenNumber(int arr[], int n) {
		
		int out[] = new int[arr.length];
		int index = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != n) {
				out[index++] = arr[i];
			}
		}
		int output[] = new int[index];
		output = Arrays.copyOf(out, index);
		System.out.println(Arrays.toString(output));
		
		return output.length;
	}
	
	
	
}
