package dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class HowSum {

	List<Integer> lst = new ArrayList<>();
	List<ArrayList<Integer>> out = new ArrayList<>();

//	@Test
//	public void example1() {
//		howSum(7,new int[] {5,3,4,7},0);
//		System.out.println(out);
//	}
//	
//	@Test
//	public void example2() {
//		System.out.println(howSum(7,new int[] {2,4},0));
//	}
//	
	@Test
	public void example3() {
		howSumMemo(7, new int[] { 2, 3 }, 0);
		System.out.println(out);
	}

//	@Test
//	public void example4() {
//		howSumMemo(8,new int[] {2,3,5},0);
//		System.out.println(out);
//	}
//	
//	@Test
//	public void example5() {
//		howSumMemo(300,new int[] {7,14},0);
//		System.out.println(out);
//	}
//	
//	@Test
//	public void example6() {
//		howSumMemo(50,new int[] {7,4},0);
//		System.out.println(out);
//	}

	private List<Integer> howSum(int target, int arr[], int cs) {
		if (cs == target) {
			out.add(new ArrayList<>(lst));
			return lst;
		}
		for (int i = 0; i < arr.length; i++) {
			cs = cs + arr[i];
			if (cs <= target) {
				lst.add(arr[i]);
				howSum(target, arr, cs);
				lst.remove(lst.size() - 1);
			}
			cs = cs - arr[i];
		}

		return lst;
	}

	Map<Integer, List<Integer>> map = new HashMap<>();

	private boolean howSumMemo(int target, int arr[], int cs) {
		if (map.containsKey(cs)) {
			out.add(new ArrayList<>(map.get(cs)));
			if (map.get(cs).isEmpty()) {
				return false;
			} else {
				return true;
			}
		}
		if (cs == target) {
			out.add(new ArrayList<>(lst));
			return true;
		}
		for (int i = 0; i < arr.length; i++) {
			cs = cs + arr[i];
			if (cs <= target) {
				lst.add(arr[i]);
				if (howSumMemo(target, arr, cs)) {
					map.put(cs, new ArrayList<Integer>(lst));
					if (lst.size() > 0)
						lst.remove(lst.size() - 1);
					return true;
				} else {
					map.put(cs, new ArrayList<Integer>());
					if (lst.size() > 0)
						lst.remove(lst.size() - 1);
				}
			}
			cs = cs - arr[i];
		}
		return false;
	}

	

}
