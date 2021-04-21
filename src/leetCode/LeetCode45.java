package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode45 {

//	@Test
//	public void example1() {
//		int arr[] = { 2, 3, 1, 1, 4 };
//		System.out.println(method3(arr));
//	}

	@Test
	public void example2() {
		int arr[] = {2,3,0,1,4};
		System.out.println(method3(arr));
	}
//
//	@Test
//	public void example3() {
//		int arr[] = { 2, 1 };
//		System.out.println(method1(arr));
//	}
//	
//	@Test
//	public void example4() {
//		int arr[] = { 2,3,1,5,4 };
//		System.out.println(method1(arr));
//	}
//	@Test
//	public void example5() {
//		int arr[] = { 5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5 };
//		System.out.println(method2(arr));
//	}

	int jumpCount = Integer.MAX_VALUE;
//	Just recursion -> Time out
	private int method1(int arr[]) {
		int jump[] = new int[arr.length];
		minJump(arr, 0, 0, jump);
		return jumpCount;
	}

//	2,3,1,1,4
	private void minJump(int arr[], int start, int count, int jump[]) {
		if (start == arr.length - 1 && jump[start] != 0) {
			jumpCount = Math.min(jumpCount, count + jump[start]);
			return;
		}
		if (start == arr.length - 1) {
			jumpCount = Math.min(jumpCount, count);
			return;
		}
		if (start > arr.length - 1 || arr[start] == 0) {
			return;
		}
		for (int i = 1; i <= arr[start]; i++) {
			count++;
			minJump(arr, start + i, count, jump);
			count--;

		}
		jump[start] = jumpCount - count;
	}

	public int method2(int[] A) {
		int minJumps[] = new int[A.length];
		Arrays.fill(minJumps, Integer.MAX_VALUE);
		minJumps[0] = 0;
		for (int i = 1; i < A.length; i++) {
			for (int j = 0; j < i; j++) {
				if(A[j]+j>=i) {
					minJumps[i] = Math.min(minJumps[i], minJumps[j]+1);
				}
			}
		}

		return minJumps[minJumps.length-1];
	}
	
	public int method3(int[] A) {
	    int sc = 0;
	    int e = 0;
	    int max = 0;
	    for(int i=0; i<A.length-1; i++) {
	        max = Math.max(max, i+A[i]);
	        if( i == e ) {
	            sc++;
	            e = max;
	        } 
	    }
	    return sc;
	}

}
