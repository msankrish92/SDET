package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CountSum {

	@Test
	public void example1() {
		System.out.println(countSum(7,new int[] {5,3,4,7},0));
	}
	
	@Test
	public void example2() {
		System.out.println(countSum(7,new int[] {2,4},0));
	}
	
	@Test
	public void example3() {
		System.out.println(countSum(7,new int[] {2,3},0));
	}
	
	@Test
	public void example4() {
		System.out.println(countSum(8,new int[] {2,3,5},0));
	}
	
	@Test
	public void example5() {
		System.out.println(countSum(300,new int[] {7,14},0));
	}
	
	@Test
	public void example6() {
		System.out.println(countSum(50,new int[] {7,4},0));
	}
	
	Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
	private boolean countSum(int target, int arr[], int cs) {
		if(map.containsKey(cs)) return map.get(cs);
		if(cs==target) {
			return true;
		}
		if(cs>target) {
			return false;
		}
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if(countSum(target, arr, cs+arr[i])) {
				map.put(cs+arr[i], true);
				return true;
			}
		}
		map.put(arr[i-1]+cs, false);
		return false;
	}
	
	
}
