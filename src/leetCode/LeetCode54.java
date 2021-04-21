package leetCode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LeetCode54 {

	@Test
	public void example() {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		method1(arr);
	}
	
	@Test
	public void example1() {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		method1(arr);
	}

	private void method1(int arr[][]) {
		int L = 0;
		int T = 0;
		int R = arr[0].length;
		int D = arr.length;
		List<Integer> lst = new ArrayList<Integer>();
		while(L<R && T<D) {
			int i = L;
			while(L<R && T<D && i<R) {
//				System.out.println(arr[T][i++]);
				lst.add(arr[T][i++]);
			}
			T++;
			i=T;
			while(L<R && T<D && i<D) {
//				System.out.println(arr[i++][R-1]);
				lst.add(arr[i++][R-1]);
			}
			R--;
			i=R;
			while(L<R && T<D && i>L) {
//				System.out.println(arr[D-1][--i]);
				lst.add(arr[D-1][--i]);
			}
			D--;
			i=D;
			while(L<R && T<D && i>T) {
//				System.out.println(arr[--i][L]);
				lst.add(arr[--i][L]);
			}
			L++;
		}

	}
}
