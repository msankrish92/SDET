package revision;

import java.util.Arrays;

import org.junit.Test;

public class RotateArray {
	
	@Test
	public void example1() {
		int arr[] = {1,2,3,4,5};
		method2(arr, "left", 1);
	}
	
	public void method1(int arr[],String direction,int no) {
		int rotation  = no;
		if(direction.equals("left")) {
			rotation = arr.length-rotation;
		}
		for (int i = 0; i < rotation; i++) {
			int temp = arr[arr.length-1];
			for (int j = arr.length-1; j > 0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void method2(int arr[], String direction, int no) {
		int rotation  = no;
		if(direction.equals("left")) {
			rotation = arr.length-rotation;
		}
		
		int right[] = Arrays.copyOfRange(arr, 0, arr.length-rotation);
		int left[] = Arrays.copyOfRange(arr, arr.length-rotation, arr.length);
		
		
		
	}

}
