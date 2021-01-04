package classRoomAssignment;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

public class TruckSize {

	/*
	 * Pseudo
	 * Declare mobile type count
	 * sort by number of mobile
	 * iterate over the array
	 * if mobile type count < ts
	 * no of mobiles * mobile type
	 * mobile type count = ts - mobile type count
	 * else
	 */
	
//	@Test
//	public void example1() {
//		int arr[][] = {{1,3},{2,2},{3,1}};
//		int ts = 4;
//		method1(arr, ts);
//	}
//	{1,3}{2,2}{3,2} k = 4
	@Test
	public void example2() {
		int arr[][] = {{1,5},{2,2},{3,1}};
		int ts = 4;
		method1(arr, ts);
	}
	
	private void method1(int arr[][], int ts) {
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1]<o2[1]) {
					return 1;
				}else {
					return -1;
				}
			}
			
		});
		int mobileNoCount = 0;
		int mobileType = 0;
		for (int i = 0; i < arr.length; i++) {
			if(mobileType<ts) {
//				mobileNoCount += arr[0]
			}
		}
//		System.out.println(Arrays.deepToString(arr));
	}
	
}
