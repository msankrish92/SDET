package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ThreeSum {

//	Psuedo
//	Sort the input
//	Declare i = 0 and j = 1
//	while i < input.length-2
//	if j<input.length-1 && arr[i] + arr[j] + arr[j+1] == 0
//	 add it to list
//	if(j==input.length-1)
//		i++;
//		j=i+1;
//	else
//		j++
		
	@Test
	public void example1() {
		int nums[] = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}
//	@Test
//	public void example2() {
//		int nums[] = {-1,0,1,-1,0,1};
//		System.out.println(threeSum(nums));
//	}
	
	private List<List<Integer>> threeSum(int nums[]){
		
		Set<Set<Integer>> set = new HashSet<>();
//		Arrays.sort(nums);
		
		return new ArrayList<List<Integer>>();
		
		
	}
	
	
}
