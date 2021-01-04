package leetCode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.junit.Test;

public class LeetCode239 {
//	https://leetcode.com/problems/sliding-window-maximum/

	@Test
	public void example1() {
		int nums[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		System.out.println(Arrays.toString(SlidingWindowMaximum(nums, k)));
	}
	
//	@Test
//	public void example2() {
//		int nums[] = { -7,-8,7,5,7,1,6,0 };
//		int k = 4;
//		System.out.println(Arrays.toString(SlidingWindowMaximum(nums, k)));
//	}
	
//	@Test
	public void example2() {
		int nums[] = { 1,3,1,2,0,5 };
		int k = 3;
		System.out.println(Arrays.toString(SlidingWindowMaximum(nums, k)));
	}

	/*
	 * private int[] SlidingWindowMaximum(int nums[], int k) {
	 * 
	 * if(nums.length == 0) { return new int[0]; } int counter = 0; int out[] = new
	 * int[nums.length-k+1]; TreeSet<Integer> slList = new
	 * TreeSet<>(Arrays.stream(Arrays.copyOfRange(nums, 0,
	 * k)).boxed().collect(Collectors.toSet())); out[counter++] = slList.last();
	 * HashMap<Integer, Integer> map = new HashMap<>(); for (int i = 0; i < k; i++)
	 * { map.put(nums[i], map.getOrDefault(nums[i], 0)+1); }
	 * 
	 * 
	 * for(int i = k; i<nums.length; i++) { if(map.get(nums[i-k]) == 1) {
	 * slList.remove(nums[i-k]); map.remove(nums[i-k]); }else { map.put(nums[i-k],
	 * map.get(nums[i-k])-1); } slList.add(nums[i]); map.put(nums[i],
	 * map.getOrDefault(nums[i], 0)+1); out[counter++] = slList.last(); }
	 * 
	 * return out; }
	 */
//	1, 3, -1, -3, 5, 3, 6, 7
	private int[] SlidingWindowMaximum(int a[], int k) {
		if (a == null || k <= 0) {
			return new int[0];
		}
		int n = a.length;
		int[] r = new int[n-k+1];
		int ri = 0;
		// store index
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < a.length; i++) {
			// remove numbers out of range k
			while (!q.isEmpty() && q.peek() < i - k + 1) {
				q.poll();
			}
			// remove smaller numbers in k range as they are useless
			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
				q.pollLast();
			}
			// q contains index... r contains content
			q.offer(i);
			if (i >= k - 1) {
				r[ri++] = a[q.peek()];
			}
		}
		return r;
	}
}
