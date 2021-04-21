package leetCode;

import org.junit.Test;

public class LeetCode152 {

//	@Test
//	public void example1() {
//		int arr[] = { -2, 3, -4 };
//		System.out.println(method1(arr));
//	}
//
//	@Test
//	public void example2() {
//		int arr[] = { -2, 3, -5, -4 };
//		System.out.println(method1(arr));
//	}
//
//	@Test
//	public void example3() {
//		int arr[] = { 2, -3, -5, 1 };
//		System.out.println(method1(arr));
//	}
//	
//	@Test
//	public void example4() {
//		int arr[] = { -2,-3,7 };
//		System.out.println(method1(arr));
//	}
//
//	@Test
//	public void example5() {
//		int arr[] = { 2, 3, -2, 4 };
//		System.out.println(method1(arr));
//	}
//
//	@Test
//	public void example6() {
//		int arr[] = { 2, -5, -2, -4, 3 };
//		System.out.println(method1(arr));
//	}
//
//	@Test
//	public void example7() {
//		int arr[] = { 1, 0, -1, 2, 3, -5, -2 };
//		System.out.println(method2(arr));
//	}
	
	@Test
	public void example8() {
		int arr[] = { 1, 2, 10, 2, 3, -5, -2 };
		System.out.println(method2(arr));
	}

	/*
	 * Declare a variables
	 * max, negative count
	 * loop through the array and find the number of negative numbers and store in negative count
	 * and find the max as well
	 * if negative count is a odd number reduce its value by one
	 * Declare neg variable to hold current products negative value
	 * if arr[0] increment neg
	 * loop through and find the first non zero element
	 * store it to i
	 * Declare j = i + 1
	 * while i < array length - 1
	 * 	if i < arr.length && j < arr.length and arr[j] == 0
	 * 		while i<j-1
	 * 			find the currentMax and if it is greater than max update max
	 * 	Increment j
	 * 	i = j
	 * 		while arr[i] == 0
	 * 			increment i
	 * 		if i = array length -> break
	 * 	update current max = arr[i]
	 * 		if arr[i] is negative update neg to 1 else neg to 0
	 *  else if j < array length and arr[j] * current max >= max || neg<=negative count
	 *  	current max = arr[j] * current max
	 *  	if arr[j] is negative value increment neg
	 *  	Increment j
	 *  else
	 *  	if arr[i] is negative decrement neg
	 *  	if arr[i] is not equal to zero update current max
	 *  	increment i
	 *  max = maximum of max and current max
	 *  
	 *  Outside the loop return max
	 */
	
	private int method1(int arr[]) {
		int max = arr[0];
		int negativeCount = 0;
		for (int a : arr) {
			if (a < 0)
				negativeCount++;
			max = Math.max(max, a);
		}
		if (negativeCount % 2 != 0) {
			negativeCount--;
		}

		int i = 0;
		while (arr[i] == 0) {
			i++;
		}
		int j = i + 1;
		int currentMax = arr[i];
		int neg = 0;
		if (arr[i] < 0)
			neg = 1;
		while (i < arr.length-1) {
			if (j < arr.length-1 && arr[j] == 0) {
				if (i < arr.length-1 && j < arr.length-1) {
                   while(i<j-1) {
						currentMax = currentMax / arr[i++];
						max = Math.max(max, currentMax);
					}
					j++;
					i = j;
                    while (i<arr.length && arr[i] == 0) {
						i++;
					}
					if(i == arr.length) break; // For cases like [1,0,0,0]
					j = i + 1;
					currentMax = arr[i];
					if (arr[i] < 0)
						neg = 1;
					else
						neg = 0;
				}
			} else if (j < arr.length && (arr[j] * currentMax >= max || neg <= negativeCount)) {
				currentMax = arr[j] * currentMax;
				if (arr[j] < 0)
					neg++;
				j++;
			} else {
				if (arr[i] < 0)
					neg--;
				if (arr[i] != 0)
					currentMax = currentMax / arr[i];
				i++;
			}
			max = Math.max(max, currentMax);
		}
		return max;
    }
	
	/*
	 * Declare Three Variables
	 * min = first element of the array
	 * max = first element of the array
	 * maxProd = first element of the array
	 * Iteration starts from 1st index
	 * We have three choices
	 * choice one -> current element into min value
	 * choice two -> current element into max value
	 * choice three -> you can choose the current element itself
	 * min = minimum of choice one, choice two and current element
	 * max = maximum of choice one, choice two and current element
	 * maxProd = maximum of max, min and maxProd
	 * 
	 * Outside the loop
	 * return max product
	 */
	
	private int method2(int arr[]) {
		int min = arr[0];
		int max = arr[0];
		int maxProd = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int choice1 = arr[i] * min;
			int choice2 = arr[i] * max;
			min = Math.min(arr[i], Math.min(choice1, choice2));
			max = Math.max(arr[i], Math.max(choice1, choice2));
			maxProd = Math.max(Math.max(min, max),maxProd);
		}
		
		return maxProd;
		
		
	}

}
