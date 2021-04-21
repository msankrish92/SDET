package classRoomAssignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TwoSum {

	/*
	 * Pseudo
	 * method1 -> Brute force
	 * Method2 -> Hashing
	 */

	@Test
	public void example1() {
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(method2(nums, target)));
	}

	@Test
	public void example2() {
		int nums[] = { 3, 2, 4 };
		int target = 6;
		System.out.println(Arrays.toString(method1(nums, target)));
	}

	private int[] method1(int arr[], int k) {
		int out[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == k) {
					out[0] = i;
					out[1] = j;
					return out;
				}
			}
		}
		return out;
	}

	private int[] method2(int arr[], int k) {
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		map.put(0,0);
		int sumSoFar = 0;
		int out[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			sumSoFar+=arr[i];
			int differene = sumSoFar-k;
			if(map.containsKey(differene)) {
				out[0] = map.get(differene);
				out[1] = i;
				return out;
			}
			map.put(arr[i], i);
		}
		return out;
	}

}
