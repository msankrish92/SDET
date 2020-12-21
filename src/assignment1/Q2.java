package assignment1;

import java.util.Arrays;
import java.util.List;

public class Q2 {
	public static int maxTrailing(List<Integer> arr) {
		// Write your code here
		if(arr.size() ==1)
			return -1;
		int maxTrailingValue = Integer.MIN_VALUE, temp = arr.get(0);
		for(int i =1 ; i < arr.size();i++){
			if(arr.get(i) > arr.get(i-1)){
				temp = Math.min(temp, (Integer)arr.get(i));
				maxTrailingValue = Math.max((Integer)arr.get(i)-temp, maxTrailingValue);
			}else
				temp = Math.min(temp, (int)arr.get(i));
		}
		if(maxTrailingValue == Integer.MIN_VALUE)
			return -1;
		return maxTrailingValue;
	}

	public static void main(String[] args) {

		Integer[] input= { -8,-2,0,-1,-8};
		System.out.println(maxTrailing(Arrays.asList(input)));
		
	}
}
