package medtronicInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Question1 {

	@Test
	public void example1() {
		int arr[] = { 2, 3, 3, 3, 2, 3, 2 };
		method1(arr);
	}

	// Pseudo
	// Initalize a map to get the count of value in the array.
	// Initalize a output array
	// Iterate over the map and add it to the array

	// Pseudo
	// Initalize two pointers i and j
	// Look for the largest value in the array and store it an variable
	// Iterate over the array
	// if current value is equal to highest
	// increment i and j
	// else increment j looking for high

	public void method1(int inp[]) {
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < inp.length; i++) {
			if (inp[i] == 2) {
				count1++;
			} else {
				count2++;
			}
		}

		for (int i = 0; i < inp.length; i++) {
			if (i < count2) {
				inp[i] = 3;
			}else {
				inp[i] = 2;
			}
		}

		System.out.println(Arrays.toString(inp));
	}

}
