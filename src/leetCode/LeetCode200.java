package leetCode;

import org.junit.Test;

public class LeetCode200 {

//	@Test
	public void example1() {
		char input[][] = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		method1(input);
	}
	
//	@Test
	public void example2() {
		char input[][] = { {'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','0'},
				{'0','0','0','1','1'} };
		method1(input);
	}
	
	@Test
	public void example3() {
		char input[][] = { {'1'}, {'1'}};
		method1(input);
	}
	
	private void method1(char input[][]) {
		int total = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if(input[i][j] == '1') {
					noOfIsland(input,i,j);
					total++;
				}
			}
		}
		System.out.println(total);
	}
	
	private void noOfIsland(char input[][],int x, int y) {
		if(x-1>=0 && input[x-1][y] == '1') {
			input[x-1][y] = '2';
			noOfIsland(input, x-1, y);
		}
		if(y-1>=0 && input[x][y-1] == '1') {
			input[x][y-1] = '2';
			noOfIsland(input, x, y-1);
		}
		if(y+1<input[x].length && input[x][y+1] == '1') {
			input[x][y+1] = '2';
			noOfIsland(input, x, y+1);
		}
		if(x+1<input.length && input[x+1][y] == '1') {
			input[x+1][y] = '2';
			noOfIsland(input, x+1, y);
		}
		return;
	}

}
