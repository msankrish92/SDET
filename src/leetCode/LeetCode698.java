package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class LeetCode698 {
	
	/*
	 * Pseudo[Recursion]
	 * To find the target value sum of the array/num of subsets
	 * if sum of array%2 == 1
	 * 	return false
	 * Sort the array
	 * if value at the last index of the array is greater than target
	 * 	return false
	 * while value of the last index is equal to target
	 * 	decrement the subset requried by one
	 * 	and start array.length--
	 * 
	 * return search(array,rows,new int[k],target)
	 * 
	 * search(array,rows,bucket[],target)
	 * if(rows < 0)
	 * 	return true
	 * 
	 * int cv = array[rows--]
	 * for loop start from 0 to bucket length
	 * 	if(nums[i]+cv<=target)
	 * 		nums[i] = nums[i] + cv
	 * 		if(search(array,rows,bucket[],target))
	 * 			return true
	 * 		nums[i] = nums[i] - cv
	 * 	if(nums[i] == 0)
	 * 		break
	 * 
	 * outside the loop
	 * return false
	 */
	
	/*
	 * Pseudo[DP]
	 * To find the target value sum of the array/num of subsets
	 * if sum of array%2 == 1
	 * 	return false
	 * Declare a boolean array to keep track of the elements visited
	 * return search(array,target,cs,k,start,visited)
	 * 
	 * search(array,sum,cs,k,start,visited)
	 * if(k==1)
	 * 	return true
	 * if(cs==sum)
	 * 	return search(array,sum,0,k-1)
	 * for start to array length
	 * 	if(visited[i]) 
	 * 		continue
	 * 	if(cs+array[i]<=sum)
	 * 		visited[i] = true
	 * 		if(search(array,sum,cs+array[i],k,i+1,visited)
	 * 		visited[i] = false
	 * 		
	 * ouside the loop
	 * return false
	 */

	@Test
	public void example1() {
		int nums[] = { 4, 3, 2, 3, 5, 2, 1 };
		System.out.println(method2(nums, 4));
	}
////	@Test
////	public void example2() {
////		int nums[] = { 1, 2, 2, 3, 3, 4, 5 };
////		System.out.println(method2(nums, 4));
////	}
//	
////	@Test
////	public void example3() {
////		int nums[] = { 2,2,2,2,3,4,5 };
////		System.out.println(method2(nums, 4));
////	}
//	
//	@Test
//	public void example4() {
//		int nums[] = { 129,17,74,57,1421,99,92,285,1276,218,1588,215,369,117,153,22 };
//		System.out.println(method2(nums, 4));
//	}

	private boolean method1(int[] nums, int k) {

		int sum = Arrays.stream(nums).sum();
		if (sum % 2 == 1)
			return false;
		int target = sum / k;
		Arrays.sort(nums);
		int row = nums.length - 1;
		if (nums[row] > target)
			return false;
		boolean visited[] = new boolean[nums.length];
		while (nums[row] == target) {
			visited[row] = true;
			row--;
			k--;
		}
		return search(row, nums, target, new int[k], visited);
	}

	private boolean search(int row, int nums[], int target, int bucket[], boolean visited[]) {
		if (row < 0) {
			return true;
		}
		int v = nums[row--];
		for (int i = 0; i < bucket.length; i++) {
			if (bucket[i] + v <= target) {

				bucket[i] = bucket[i] + v;
				if (search(row, nums, target, bucket, visited))
					return true;
				bucket[i] = bucket[i] - v;
			}
		}
		return false;
	}

	private boolean method2(int nums[], int k) {
		if (nums.length < k)
			return false;
		int sum = (Arrays.stream(nums).sum()) / k;
		boolean used[] = new boolean[nums.length];
		return Partition(k, sum, 0, nums, used, 0);
	}

	private boolean Partition(int k, int sum, int cs, int[] nums, boolean used[], int start) {
		if (k == 1) {
			return true;
		}
		if (cs == sum) {
			return Partition(k - 1, sum, 0, nums, used, 0);
		}

		for (int i = start; i < nums.length; i++) {
			if (used[i])
				continue;
			if (!used[i] && nums[i] + cs <= sum) {

				used[i] = true;
				if (Partition(k, sum, cs + nums[i], nums, used, i + 1)) {
					return true;
				}
				used[i] = false;

			}
		}
		return false;
	}

}
