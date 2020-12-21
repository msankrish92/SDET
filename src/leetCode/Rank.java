package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Rank {

	// Pseudo

//	@Test
	public void example1() {
		Integer arr[] = { 10, 2, 1, 4, 10, 2, 5, 13, 5 }; // [1,2] or [1,3]
		System.out.println(rank(arr));
	}

//	@Test
	public void example2() {
		Integer arr[] = { 1, 2, 4, 8 }; // [1,2,4,8]
		System.out.println(rank(arr));
	}

	@Test
	public void example3() {
		Integer arr[] = { 2, 1, 2, 3, 5, 3, 3 }; // [1,2,4,8]
		System.out.println(rank(arr));
	}

	private List<Integer> rank(Integer arr[]) {
		int max = 0;
		Map<Integer, Integer> maxMap = new HashMap<>();
		for (int a : arr) {
			maxMap.put(a, maxMap.getOrDefault(a, 0) + 1);
		}

		for (int val : maxMap.values()) {
			if (val > max)
				max = val;
		}
		List<Integer> out = new ArrayList<>(Arrays.asList(arr));

		Map<Integer, Integer> map = new HashMap<>();
		int firstPointer = 0, secondPointer = 0;

		while (firstPointer < arr.length && secondPointer < arr.length) {
			map.put(arr[secondPointer], map.getOrDefault(arr[secondPointer], 0) + 1);
			while (!map.isEmpty() && map.get(arr[secondPointer]) == max && firstPointer <= secondPointer) {
				if (secondPointer - firstPointer < out.size()) {
					out = new ArrayList<>();
					for (int i = firstPointer; i <= secondPointer; i++) {
						out.add(arr[i]);
					}
				}
				if (map.get(arr[firstPointer]) == 1) {
					map.remove(arr[firstPointer]);
				} else {
					map.put(arr[firstPointer], map.getOrDefault(arr[firstPointer], 0) - 1);
				}
				firstPointer++;
			}
			secondPointer++;

		}

		return out;

	}

}