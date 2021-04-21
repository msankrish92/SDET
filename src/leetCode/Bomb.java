package leetCode;

import org.junit.Test;

public class Bomb {

//	@Test
//	public void example1() {
//		char inp[][] = {{'O','E','O','O'},{'E','O','W','E'},{'O','E','O','O'}};
//		method1(inp);
//	}

//	@Test
//	public void example2() {
//		char inp[][] = {{'O','W','E','O'},{'O','W','O','W'}, {'E','O','E','O'}, {'W','E','O','E'}};
//		method1(inp);
//	}

	@Test
	public void example3() {
		char inp[][] = { { 'O', 'W', 'E', 'W' }, 
						{ 'W', 'W', 'W', 'W' }, 
						{ 'E', 'E', 'W', 'E' },
						{ 'W', 'E', 'W', 'E' } };
		method1(inp);
	}

	// Pseudo
	// Declare a global variable noOfEnemies
	// Go to a position
	// check on the right side
	// if it is E add 1 to noOfEnemies and move right further
	// if it is 0 continue move right further
	// if it is wall stop
	// repeat this for the remaining sides

	int noOfEnemies = Integer.MIN_VALUE;
	int temp;

	public void method1(char inp[][]) {
		for (int i = 0; i < inp.length; i++) {

			for (int j = 0; j < inp[i].length; j++) {
				if (inp[i][j] == 'O') {
					temp = 0;
					checkRight(inp, i, j + 1);
					checkDown(inp, i + 1, j);
					checkLeft(inp, i, j - 1);
					checkUp(inp, i - 1, j);
					noOfEnemies = Math.max(noOfEnemies, temp);
				}
			}

		}
		System.out.println(noOfEnemies);
	}

	public void checkRight(char[][] inp, int x, int y) {
		if (y < inp[x].length && inp[x][y] != 'W') {
			if (inp[x][y] == 'E') {
				temp++;
				checkRight(inp, x, ++y);
			} else if (inp[x][y] == 'O') {
				checkRight(inp, x, ++y);
			}
		} else {
			return;
		}
	}

	public void checkDown(char[][] inp, int x, int y) {
		if (x < inp.length && inp[x][y] != 'W') {
			if (inp[x][y] == 'E') {
				temp++;
				checkDown(inp, ++x, y);
			} else if (inp[x][y] == 'O') {
				checkDown(inp, ++x, y);
			}
		} else {
			return;
		}
	}

	public void checkLeft(char[][] inp, int x, int y) {
		if (y >= 0 && inp[x][y] != 'W') {
			if (inp[x][y] == 'E') {
				temp++;
				checkLeft(inp, x, --y);
			} else if (inp[x][y] == 'O') {
				checkLeft(inp, x, --y);
			}
		} else {
			return;
		}
	}

	public void checkUp(char[][] inp, int x, int y) {
		if (x >= 0 && inp[x][y] != 'W') {
			if (inp[x][y] == 'E') {
				temp++;
				checkUp(inp, --x, y);
			} else if (inp[x][y] == 'O') {
				checkUp(inp, --x, y);
			}
		} else {
			return;
		}
	}
}
