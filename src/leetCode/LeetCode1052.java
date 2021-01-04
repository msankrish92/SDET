package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode1052 {

	@Test
	public void example1() {
		int customers[] = { 0, 8, 0, 1, 7, 1 };
		int grumpy[] = { 0, 1, 0, 1, 0, 1 };
		int X = 3;
		System.out.println(maxSatisfied(customers, grumpy, X));
	}

	@Test
	public void example2() {
		int customers[] = { 1, 0, 1, 2, 1, 1, 7, 5 };
		int grumpy[] =    { 0, 1, 0, 1, 0, 1, 0, 1 };
		int X = 3;
		System.out.println(maxSatisfied(customers, grumpy, X));
	}

	public int maxSatisfied(int[] customers, int[] grumpy, int X) {

		int max = 0;
		for (int i = 0; i < grumpy.length; i++) {
			if (i < X) {
				max += customers[i];
			} else {
				if (grumpy[i] == 0)
					max += customers[i];
			}
		}
		int temp = max;
		for (int i = X; i < grumpy.length; i++) {
			if (grumpy[i - X] == 1) {
				temp -= customers[i - X];
			}
			if(grumpy[i] == 1) {
				temp += customers[i];
			}
			max = Math.max(max, temp);
		}
		return max;
	}
//	public int maxSatisfied(int[] customers, int[] grumpy, int X) {
//  int max = 0;
////  int temp[] = new int[grumpy.length];
////  int index = 0;
////  for(int a : grumpy) {
////  	temp[index++] = a;
////  }
//  int fill[] = new int[X];
//  Arrays.fill(fill,0);
//  for(int i = 0; i<=customers.length-X; i++){
//      int temp[] = grumpy.clone();
////      for (int j = 0; j < temp.length; j++) {
////			temp[j] = grumpy[j];
////		}
//       System.arraycopy(fill, 0, temp, i, X);
////      temp = Arrays.copyOfRange(fill,i,i+X);
//      int count = 0;
//      for(int j = 0; j<customers.length; j++){
//          if(temp[j] == 0) 
//              count += customers[j];
//      }
//      max = Math.max(count,max);
//  }
//  return max;
//}

//public int maxSatisfied(int[] customers, int[] grumpy, int X) {
//	int total = 0;
//	for(int a : customers) {
//		total+=a;
//	}
//	int max = 0;
//	for (int i = 0; i < grumpy.length; i++) {
//		int temp = total;
//		for (int j = 0; j < grumpy.length; j++) {
//			if(j>=i && j<i+X) {
//				
//			}else {
//				if(grumpy[j] == 1) temp -= customers[j];
//			}
//		}
//		max=Math.max(temp, max);
//	}
//	return max;
//}
}
