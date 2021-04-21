package revision;

import org.junit.Test;

public class FirstAndLastMatch {

	/*
	 * Pseudo[BruteForce][Time Complexity = O[n]][Space Complexity = O[1]]
	 * Declare first and last to -1
	 * iterate over the array to find the target
	 * 	if first is -1 and array value equal to target
	 * 		first equal to current index
	 * 	else
	 * 		secound = current index
	 * 
	 * outside the loop
	 * return first and last
	 */
	
	/*
	 * Pseudo[Two pointer][Time Complexity = O[n/2]][Space Complexity = O[1]]
	 * first pointer = 0, second pointer = arrayLength
	 * while(first<second)
	 * 	if(first == target && second == target)
	 * 		return first and last
	 * 	if(first !=target)
	 * 		first++	
	 * 	if(second != target)
	 * 		second--
	 * 
	 * Outside the loop
	 * return -1// No match
	 */
	
	/*
	 * Pseudo[Binary Search]
	 * declare a mid variable
	 * start = 0
	 * end = array length -1
	 * 
	 * firstmatch = -1
	 * secondmatch = -1
	 * 	mid = start + end / 2
	 * 		if arr[mid] lesser than target
	 * 			bs(mid+1,end,input,target)
	 * 		if arr[mid] greater than target
	 * 			bs(start, mid-1, input, target)
	 * 		if arr[mid] equal to target
	 * 			bs[start,mid,input,target)
	 * 			int first = firstMatch
	 * 			bs[mid,end,input,target)
	 * 			int second = secondMatch
	 * 			firstmatch = first;
	 * 			firstmatch = second;
	 * 
	 * bs(start, end, input, target)
	 * if(start == target)
	 * 	firstMatch = start;
	 * if(end == target)
	 * 	secondMatch = end
	 * if start and end found return
	 * bs(start,start+end/2,input,target)
	 * 
	 */
	
//	11 19 19 19 19
	@Test
	public void example1() {
		int input[] = {11,14,17,19,19,23,25};
		int target = 19;
		method1(input, target);
		method2(input, target);
	}
	
	
	@Test
	public void example3() {
		int input[] = {11,14,17,18,19,23,25};
		int target = 19;
	}
	@Test
	public void example4() {
		int input[] = {11};
		int target = 11;
	}
	
	@Test
	public void example5() {
		int input[] = {11,14,14,18,19,19};
		int target = 19;
	}
	
	private void method1(int input[],int target) {
		int firstMatch = -1;
		int secondMatch = -1;
		for (int i = 0; i < input.length; i++) {
			if(firstMatch == -1 && input[i] == target) {
				firstMatch = i;
			}else if(input[i] == target) {
				secondMatch = i;
			}
		}
		System.out.println(firstMatch +"," + secondMatch);
	}
	
	private void method2(int input[], int target) {
		int firstPointer = 0;
		int secondPointer = input.length-1;
		while(firstPointer<secondPointer) {
			if(input[firstPointer] == target && input[secondPointer] == target) {
				System.out.println(firstPointer + "," + secondPointer);
				return;
			} 
			if(input[firstPointer] != target) {
				firstPointer++;
			}
			if(input[secondPointer] != target) {
				secondPointer--;
			}
		}
		System.out.println("No match found");
	}
	
}
