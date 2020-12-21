package leetCode;

import org.junit.Test;

public class SecondLargestNumber {

	@Test
	public void example1() {
		int arr[] = { 2, 1, 3, 5, 4, 11, 33, 26 };
		System.out.println(secondLargestNumber(arr));
	}

	@Test
	public void example2() {
		int arr[] = { 26, 1, 3, 5, 4, 11, 33 };
		System.out.println(secondLargestNumber(arr));
	}

	@Test
	public void example3() {
		int arr[] = { 33, 1, 3, 5, 4, 11, 26 };
		System.out.println(secondLargestNumber(arr));
	}

	@Test
	public void example4() {
		int arr[] = { -1, -3, -5, -4, -11, -26 };
		System.out.println(secondLargestNumber(arr));
	}

	@Test
	public void example5() {
		int arr[] = { -1, -1, -3, -5, -4, -11, -26 };
		System.out.println(secondLargestNumber(arr));
	}

	@Test
	public void example6() {
		int arr[] = { -1, -1 };
		System.out.println(secondLargestNumber(arr));
	}
	
	@Test
	public void example7() {
		int arr[] = { -1, -1, 3, 3 };
		System.out.println(secondLargestNumber(arr));
	}

	private int secondLargestNumber(int arr[]) {

		int largest = Integer.MIN_VALUE, secondLargest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest;
	}

	/*
	 * private int secondLargestNumber(int arr[]) { int firstPointer = 0,
	 * secondPointer = arr.length - 1, largest = Integer.MIN_VALUE, secondLargest =
	 * 0; while (firstPointer < secondPointer) { if (arr[firstPointer] >=
	 * arr[secondPointer]) { if (arr[firstPointer] > largest) { secondLargest =
	 * largest; largest = arr[firstPointer]; } else if (arr[firstPointer] < largest
	 * && arr[firstPointer] > secondLargest) { secondLargest = arr[firstPointer]; }
	 * firstPointer++; } else if (arr[firstPointer] < arr[secondPointer]) { if
	 * (arr[secondPointer] > largest) { secondLargest = largest; largest =
	 * arr[secondPointer]; } else if (arr[secondPointer] < largest &&
	 * arr[secondPointer] > secondLargest) { secondLargest = arr[secondPointer]; }
	 * secondPointer--; } } return secondLargest; }
	 */

	/*
	 * private int secondLargestNumber(int arr[]) { int firstPointer =
	 * 0,secondPointer = arr.length - 1, largest = Integer.MIN_VALUE, secondLargest
	 * = Integer.MIN_VALUE; // 2, 1, 3, 5, 4, 11, 33, 26
	 * while(firstPointer<secondPointer) { if(arr[firstPointer]>largest) {
	 * secondLargest = largest; largest = arr[firstPointer]; }
	 * if(arr[secondPointer]>largest) { secondLargest = largest; largest =
	 * arr[secondPointer]; } if(arr[firstPointer]<largest &&
	 * arr[firstPointer]>secondLargest) { secondLargest = arr[firstPointer]; }
	 * if(arr[secondPointer]<largest && arr[secondPointer]>secondLargest) {
	 * secondLargest = arr[secondPointer]; } firstPointer++; secondPointer--; }
	 * return secondLargest; }
	 */

}
