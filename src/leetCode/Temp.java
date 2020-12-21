package leetCode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Temp {

	@Test
	public void example() {
		int arr[] = { 73, 74, 75, 71, 69, 72, 76, 73 };
		method(arr);
	}
	
	@Test
	public void example1() {
		int arr[] = { 73, 74, 75, 71, 76 };
		method(arr);
	}

	private void method(int[] arr) {
		List<Integer> dayDiffList = new ArrayList<Integer>();
		int i = 0;
		int j = 1;
		int count = 1;
		while (i < arr.length) {
			if (j!=arr.length && arr[i] < arr[j]) {
				dayDiffList.add(count);
				i++;
				j = i+1;
				count=1;
			}else if(j!=arr.length && arr[i]>arr[j]) {
				count++;
				j++;
			}
			if(j>arr.length-1) {
				dayDiffList.add(0);
				i++;
				j=i+1;
				count = 1;
			}
		}
		
		System.out.println(dayDiffList);

	}

}
