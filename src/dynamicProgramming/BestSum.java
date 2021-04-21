package dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.OutputDeviceAssigned;

import org.junit.Test;

public class BestSum {
	@Test
	public void example1() {
//		bestSum(7, new int[] { 5, 3, 4, 7 }, 0, new ArrayList<Integer>());
////		System.out.println(lst);
		System.out.println(
				bs(7, new int[] { 5, 3, 4 }, new ArrayList<Integer>(), new HashMap<Integer, List<Integer>>()));
	}
//
////	@Test
//	public void example2() {
////		bestSum(7, new int[] { 2, 4 }, 0, new ArrayList<Integer>());
////		System.out.println(lst);
//		System.out.println(bs(7, new int[] { 2, 4 }, new ArrayList<Integer>(), new HashMap<Integer, List<Integer>>()));
//	}
//
//
//	@Test
//	public void example3() {
////		bestSum(7, new int[] { 2, 3 }, 0, new ArrayList<Integer>());
////		System.out.println(lst);
//		System.out.println(
//				bs(7, new int[] { 2, 3 }, new ArrayList<Integer>(), new HashMap<Integer, List<Integer>>()));
//	}
//
//	@Test
//	public void example4() {
////		bestSum(8, new int[] { 2, 3, 5 }, 0, new ArrayList<Integer>());
////		System.out.println(lst);
//		System.out.println(
//				bs(8, new int[] { 2, 3, 5 }, new ArrayList<Integer>(), new HashMap<Integer, List<Integer>>()));
//	}

//	@Test
//	public void example5() {
////		bestSum(300, new int[] { 7, 14 }, 0, new ArrayList<Integer>());
////		System.out.println(lst);
//		System.out
//				.println(bs(300, new int[] { 7, 14 }, new ArrayList<Integer>(), new HashMap<Integer, List<Integer>>()));
//	}

//
//	@Test
//	public void example6() {
////		bestSum(50, new int[] { 7, 4 }, 0, new ArrayList<Integer>());
////		System.out.println(lst);
//		System.out.println(
//				bs(50, new int[] { 7, 4, 50 }, new ArrayList<Integer>(), new HashMap<Integer, List<Integer>>()));
//	}

	@Test
	public void example7() {
//		bestSum(100, new int[] { 1, 2, 5, 25 }, 0, new ArrayList<Integer>());
//		System.out.println(lst);
		System.out.println(
				bs(100, new int[] { 1, 2, 5, 25 }, new ArrayList<Integer>(), new HashMap<Integer, List<Integer>>()));

	}

	List<Integer> lst = null;

	private void bestSum(int target, int arr[], int cs, List<Integer> out) {

		if (target == cs) {
			if (lst == null) {
				lst = new ArrayList<Integer>(out);
			} else {
				if (out.size() < lst.size()) {
					lst = new ArrayList<Integer>(out);
				}
			}
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			cs = cs + arr[i];
			if (cs <= target) {
				out.add(arr[i]);
				bestSum(target, arr, cs, out);
				out.remove(out.size() - 1);
			}
			cs = cs - arr[i];
		}

	}

	private List<Integer> bs(int target, int arr[], List<Integer> out, Map<Integer, List<Integer>> map) {
		if (map.containsKey(target))
			if (map.get(target).size() < out.size())
				return map.get(target);
		if (target == 0)
			return out;
		if (target < 0)
			return null;
		List<Integer> ouput = null;
		
		for (int i = 0; i < arr.length; i++) {
			int remainder = target - arr[i];
			out.add(arr[i]);
			List<Integer> lst = bs(remainder, arr, out, map);
			if (lst != null) {
				if (ouput == null || out.size() < ouput.size()) {
//					map.put(target, new ArrayList<>(lst));
					ouput = new ArrayList<>(lst);
				}
			}
			out.remove(out.size() - 1);
		}
		if (ouput != null)
			map.put(target, new ArrayList<>(ouput));
		else
			map.put(target, null);
		return ouput;
	}

}
