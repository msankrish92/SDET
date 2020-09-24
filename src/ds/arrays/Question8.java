package ds.arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.Test;

public class Question8 {

	/*
	 * Given an array of integers, a lucky integer is an integer which has a
	 * frequency in the array equal to its value. Aadhithya Return a lucky integer
	 * in the array. If there are multiple lucky integers return the largest of
	 * them. If there is no lucky integer return -1.
	 * 
	 * Input: [1,2,2,3,3,4,4,4,4,5] Output: 4 Explanation: 1, 2 and 4 are all lucky
	 * numbers, but 4 is the largest
	 */

//	@Test // Positive values
//	public void example1() {
//		int arr[] = { 1, 2, 2, 3, 3, 4, 4, 4, 4, 5 };
//		System.out.println(luckyInteger(arr));
//
//	}

	@Test // Positive and negative values
	public void example2() {
		int arr[] = { 1, -2, -2, 3, 3, 4, 4, 4, 5 };
		System.out.println(luckyInteger(arr));

	}

//	@Test // No match
//	public void example3() {
//		int arr[] = { -2, 3, 3, 4, 4, 4, 5 };
//		System.out.println(luckyInteger(arr));
//
//	}
//
//	@Test // un-ordered
//	public void example4() {
//		int arr[] = { -2, 3, 3, 5, 5, 5, 5, 5, 1 };
//		System.out.println(luckyInteger(arr));
//
//	}

	// Method 1
	private int luckyInteger(int arr[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {//O[n]
			if(arr[i]<0) {
				continue;
			}
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

//		System.out.println(map);
		
		Optional<Integer> max = map.entrySet().stream()
				.filter(a -> a.getValue()==Math.abs(a.getKey()))//O[n]
				.map(a -> a.getValue())//O[n]
				.max(Comparator.naturalOrder());
		
		if(max.isPresent()) {
			return max.get();
		}
		return -1;
		
	}

	// Method 2
//	private int luckyInteger(int arr[]) {
//		
////		int arr[] = { 1, 2, 2, 3, 3, 4, 4, 4, 4, 5 };
//		int key = 0;
//		int value = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			int temp = 0;
//			int selectValue = arr[i];
//			if(selectValue<0) {
//				continue;
//			}
//			for (int j = 0; j < arr.length; j++) {
//				if (selectValue == arr[j]) {
//					temp++;
//				}
//			}
//			if (Math.abs(selectValue) == temp && value < temp) {
//				key = arr[i];
//				value = temp;
//			}
//		}
//		
//		return key;
//	}

}
