package reference;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Rotation {

	@Test
	public void example1() {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		method1(arr, 3);
	}

	public void method1(int arr[], int k) {

		int visited = 0;
		Set<Integer> st = new HashSet<>();
		int curPos = 0;
		while (visited < arr.length) {
			int limit = curPos + k;
			for (int i = curPos; i < limit; i++) {

				if (curPos >= arr.length) {
					curPos = 0;
					i--;
				} else if(st.contains(arr[curPos])) {
					i--;
					curPos++;
				}else {
					curPos++;
				}

			}
			System.out.println(arr[curPos]);
			st.add(arr[curPos]);
			visited++;
		}

	}

}
