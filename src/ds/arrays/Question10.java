package ds.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.Test;

public class Question10 {

	public class KthLargestElemet {

		@Test
		public void example() {
			int arr[] = {3,2,3,1,2,4,5,5,6};
			int k = 3;
			kthLargestElement(arr, k);
		}
		
		@Test
		public void example1() {
			int arr[] = {3,2,3,1,2,-4,-5,-5,-6};
			int k = 3;
			kthLargestElement(arr, k);
		}
		
		@Test
		public void example2() {
			int arr[] = {3,2,3,1,2,-4,-5,-5,-6};
			int k = 10;
			kthLargestElement(arr, k);
		}
		
		//Method 1 
//		private void kthLargestElement(int arr[], int k) {
//			if(arr.length<k) {
//				System.out.println("K is greater the array length");
//				
//			}else {
//			Arrays.sort(arr);
//			System.out.println(arr[arr.length-k]);
//			}
//		}
		
		
		//Method 2
		private void kthLargestElement(int arr[], int k) {
			
			int index = arr.length-k;
			if(arr.length<k) {
				System.out.println("K is greater the array length");
			} else {
				Integer integer = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList()).get(index);
				System.out.println(integer);
			}
		
		}
	
}
}
