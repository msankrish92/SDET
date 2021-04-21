package dynamicProgramming;

import org.junit.Test;

public class GridTraveller {

//	@Test
//	public void example1() {
//		System.out.println(gridTraveller(2,3));
//	}
	
//	@Test
//	public void example2() {
//		System.out.println(gridTraveller(3,3));
//	}
//	
//	@Test
//	public void example3() {
//		System.out.println(gridTraveller(3,2));
//	}
	
//	@Test
//	public void example4() {
//		System.out.println(gridTraveller(17,17));
////		System.out.println(gridTravellerMemo(17,17,new int[18][18]));
//	}
	
	@Test
	public void example5() {
//		System.out.println(gridTraveller(17,17));
		System.out.println(gridTravellerMemo(17,17,new int[18][18]));
	}
	
	int count = 0;
	private int gridTraveller(int r, int c) {
		if(r == 1 && c == 1) {
			return 1;
		}
		if(r == 0 || c == 0) {
			return 0;
		}
		return gridTraveller(r-1, c) + gridTraveller(r, c-1); 
	}
	

	private int gridTravellerMemo(int r, int c, int memo[][]) {
		if(memo[r][c]!=0 || memo[c][r]!=0)
			return memo[r][c];
		if(r == 1 && c == 1) {
			return 1;
		}
		if(r == 0 || c == 0) {
			return 0;
		}
		return memo[r][c] = gridTravellerMemo(r-1, c,memo) + gridTravellerMemo(r, c-1,memo); 
	}
	
	
}
