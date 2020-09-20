package ds.arrays;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SubArray {
	
	@Test
	public void example1() {
		int arr[] = {1,7,4,3,1,2,1,5,1};
		int desiredSum = 7;
		subArrayMatchDesValue(arr, desiredSum);
	}
	
//	@Test
//	public void example2() {
//		int arr[] = {-1,-7,-4,-3,-1,-2,-1,-5,-1};
//		int desiredSum = -7;
//	}
//	
//	@Test
//	public void example3() {
//		int arr[] = {1,7,4,3,1,2,1,5,1};
//		int desiredSum = 50;
//	}
	
	
	private void subArrayMatchDesValue(int arr[], int desiredSum) {

		Map<Integer,Integer> map = new HashMap<>();
		//To reset
//		I have seen like if a value is not present in an array and 
//		if we want the index ,it returns is -1... is this the reason 
//		why we choose -1 as index value in adding '0' ?
		map.put(0, -1);
		
		int sum_so_far = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum_so_far += arr[i];
			int diff = sum_so_far - desiredSum;
			if(map.containsKey(diff)) {
				System.out.println("Found the array: {" + (map.get(diff)+1)+ "," + i + "}");
			}
			map.put(sum_so_far, i);
		}
		
		
	}

}
