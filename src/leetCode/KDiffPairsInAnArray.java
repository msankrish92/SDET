package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class KDiffPairsInAnArray {

	@Test
	public void example1() {
		int[] nums = { 3, 1, 4, 1, 5 };
		int k = 2;
		method1(nums, k);
	}

//	@Test
	public void example2() {
		int[] nums = { 1, 2, 3, 4, 5 };
		int k = 1;
		method1(nums, k);
	}

//	@Test
	public void example3() {
		int[] nums = { 1, 2, 4, 4, 3, 3, 0, 9, 2, 3 };
		int k = 3;
		method1(nums, k);
	}
	
	@Test
	public void example4() {
		int[] nums = {6,2,9,3,9,6,7,7,6,4 };
		int k = 3;
		method1(nums, k);
	}
	
	@Test
	public void example5() {
		int[] nums = {1,3,1,5,4};
		int k = 0;
		method1(nums, k);
	}

	/*
	 * public void method1(int nums[], int k) {
	 * 
	 * List<Integer[]> comList = new ArrayList<>();
	 * 
	 * Arrays.sort(nums); for (int i = 0; i < nums.length; i++) { for (int j = 0; j
	 * < nums.length; j++) { if (i != j) { if (Math.abs(nums[i] - nums[j]) == k) {
	 * comList.add(new Integer[2]); comList.get(comList.size() - 1)[0] = nums[i];
	 * comList.get(comList.size() - 1)[1] = nums[j]; } } } }
	 * 
	 * 
	 * for (int i = 0; i < comList.size(); i++) { Arrays.sort(comList.get(i)); }
	 * 
	 * for(int i = 0; i<comList.size(); i++) { int va1 = comList.get(i)[0]; int va2
	 * = comList.get(i)[1]; for (int j = i+1; j < comList.size(); j++) {
	 * if(comList.get(j)[0] == va1 && comList.get(j)[1]==va2) { comList.remove(j);
	 * j--; } } }
	 * 
	 * 
	 * for(int i = 0; i<comList.size(); i++) { int va1 = comList.get(i)[0]; int va2
	 * = comList.get(i)[1]; for (int j = i+1; j < comList.size(); j++) {
	 * if(comList.get(j)[0] == va1 && comList.get(j)[1]==va2) { comList.remove(j); }
	 * } }
	 * 
	 * int counter = 0;
	 * 
	 * if(comList.size()>0){ int val1 = comList.get(0)[0]; int val2 =
	 * comList.get(0)[1]; counter = 1; for (int i = 1; i < comList.size(); i++) {
	 * 
	 * System.out.println(Arrays.toString(comList.get(i))); if (val1 !=
	 * comList.get(i)[0] && val2 != comList.get(i)[1]) { val1 = comList.get(i)[0];
	 * val2 = comList.get(i)[1]; counter++; } } }
	 * 
	 * 
	 * System.out.println(counter); }
	 */
	
	public void method1(int nums[], int k) {
		Arrays.sort(nums);
		
		int i = 0;
		int j = 1;
		int counter = 0;
		
		while(j<nums.length) {
			if(Math.abs(nums[i] - nums[j]) > k) {
				i++;
			}
			
			
			if(Math.abs(nums[i] - nums[j]) == k) {
				counter++;
				i++;
				while(nums[i] == nums[i-1]) {
					i++;
					j++;
				}
			}
			j++;
			
		}
		
		System.out.println(counter);
		
		
	}
	
}
