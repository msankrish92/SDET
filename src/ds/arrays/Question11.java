package ds.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

public class Question11 {

	/*
	 * Find all the missing numbers in the given array
	 * 
	 * Input: [4,3,2,7,8,2,3,1] Output: [5,6]
	 */

	@Test
	public void example1() {
		Integer arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		missingNumber(arr);
		System.out.println("---");
	}

	@Test
	public void example2() {
		Integer arr[] = { 4, 3, 2, 7, 8, 2, 3, 1, -1 };
		missingNumber(arr);
		System.out.println("---");
	}

	@Test
	public void example3() {
		Integer arr[] = { 1, 1, 1, 1 };
		missingNumber(arr);
		System.out.println("---");
	}

	@Test
	public void example4() {
		Integer arr[] = { -5, -6, -8, -1, -8, -3, -2, -2 };
		missingNumber(arr);
		System.out.println("---");
	}

	@Test
	public void example5() {
		Integer arr[] = { -5, -4, -3, -1, 1, 3, 4, 5 };
		missingNumber(arr);
		System.out.println("---");

	}

	// Method 1(Time complexity O[n])
//	private void missingNumber(Integer arr[]) {
//		Arrays.sort(arr); // O(n log(n))
//
//		for (int i = 0; i < arr.length - 1; i++) {// O[n]
////			if the current element is equal next value  or the current element value +1 is equal to next element
////			if it is a sequence, no need to get inside the loop
//			if (!(arr[i] == arr[i + 1] || arr[i] + 1 == arr[i + 1])) {
//				System.out.println(arr[i] + 1);
//				int temp = arr[i] + 1;
////				Looping through till the value is same
//				while (temp < arr[i + 1] - 1) { // O[n]
//					System.out.println(++temp);
//				}
//			}
//		}
//	}

	// Method 2(Time complexity O[n]
//	private void missingNumber(Integer arr[]) {
////		convert and sort the integer
//		List<Integer> list = Arrays.asList(arr); // O(1)
//		Collections.sort(list);// O(N*log(N))
////		This variable is to keep track of length in-case of negative values
//		int count = 0;
////		Loop continues untill i is lesser than list.size and count is lesser than list.size() 
//		for (int i = list.get(0); i < list.size() && count<list.size(); i++) { // 0[n]
//			if (list.get(0) == list.get(list.size() - 1)) {
//				break;
//			}
////			checks if list does not contains index value i and prints it
//			if (!list.contains(i)) {
//				System.out.println(i);
//			}
//			count++;
//		}
//	}

//	Method 3
	private void missingNumber(Integer[] input) {

		Arrays.sort(input);
//		IntStream -> gives int value of the given Range
//		Boxed -> convert the int value back to Integer
		Set<Integer> missingIntegersList = IntStream.range(input[0], input[input.length - 1])
				.filter(currentInputValue -> Arrays.binarySearch(input, currentInputValue) < 0 ? true : false).boxed()
				.collect(Collectors.toSet());

		if (missingIntegersList.isEmpty())
			throw new RuntimeException("No Missing integers");
		else
			System.out.println(missingIntegersList);
	}

}
