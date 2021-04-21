package dynamicProgramming;

import java.util.Arrays;

import org.junit.Test;

public class GridTravellerTab {
	@Test
	public void example1() {
		System.out.println(gridTraveller(2, 3));
	}

	@Test
	public void example2() {
		System.out.println(gridTraveller(3, 3));
	}

	@Test
	public void example3() {
		System.out.println(gridTraveller(3, 2));
	}

	@Test
	public void example4() {
		System.out.println(gridTraveller(17, 17));
	}

	@Test
	public void example5() {
		System.out.println(gridTraveller(17, 17));
	}

	private int gridTraveller(int r, int c) {
		int table[][] = new int[r + 1][c + 1];
//		Arrays.fill(table, 0);
		table[1][1] = 1;
		for (int i = 0; i <= r; i++) {
			for (int j = 0; j <= c; j++) {
//				if (j + 1 <= c && i + 1 <= r) {
//					if (table[i][j] == 1) {
						if(j+1<=c)
						table[i][j + 1] += table[i][j];
						if(i+1<=r)
						table[i + 1][j] += table[i][j];
//					}
//				}
			}
		}
		return table[r][c];
	}

}
