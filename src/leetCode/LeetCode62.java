package leetCode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LeetCode62 {

//	@Test
	public void example() {
		int m = 2;
		int n = 2;
		method1(m, n);
	}
	
	@Test
	public void example1() {
		int m = 3;
		int n = 3;
		method1(m, n);
	}

//	int count = 0;

	private void method1(int m, int n) {
		int flag[][] = new int[m][n];
		int recurFun = recurFun(m, n, 0, 0,flag);
		System.out.println(recurFun);
	}
	private int recurFun(int m, int n, int start, int end,int flag[][]) {
		if (start == m-1 && end == n-1) {
			return 1;
		}else if(start>=m || end >=n) {
			return 0;
		}else if(flag[start][end]!=0) {
			return flag[start][end];
		}else {
		flag[start][end] = recurFun(m, n, start, end + 1,flag) + recurFun(m, n, start + 1, end,flag);
		return flag[start][end];
		}
	}

}
