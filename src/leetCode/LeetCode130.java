package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode130 {

//	@Test
	public void example1() {
		char[][] board = { { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'O', 'X' }, { 'X', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'X' } };
		method1(board);
	}

//	@Test
	public void example2() {
		char[][] board = { { 'O', 'O' }, { 'O', 'O' } };
		method1(board);
	}

	@Test
	public void example3() {
		char[][] board = { { 'O', 'O', 'O', 'O', 'X', 'X' }, { 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'O', 'X', 'O', 'X', 'O', 'O' }, { 'O', 'X', 'O', 'O', 'X', 'O' }, { 'O', 'X', 'O', 'X', 'O', 'O' },
				{ 'O', 'X', 'O', 'O', 'O', 'O' } };
		method1(board);
	}

	@Test
	public void example4() {

	}
	
	private void method1(char board[][]) {

		char copyBoard[][] = new char[board.length][];
		for (int i = 0; i < copyBoard.length; i++) {
			copyBoard[i] = new char[board[i].length];
			for (int j = 0; j < board[i].length; j++) {
				copyBoard[i][j] = board[i][j];
			}
		}
		boolean visited[][] = new boolean[board.length][];
		for (int i = 0; i < board.length; i++) {
			visited[i] = new boolean[board[i].length];
			for (int j = 0; j < visited[i].length; j++) {
				visited[i][j] = false;
			}
		}
		
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'O' && !visited[i][j]) {
					if (capture(board, i, j,visited)) {
						for (int j2 = 0; j2 < board.length; j2++) {
							copyBoard[j2] = new char[board[j2].length];
							for (int k = 0; k < board[j2].length; k++) {
								copyBoard[j2][k] = board[j2][k];
							}
						}
					} else {
						for (int j2 = 0; j2 < copyBoard.length; j2++) {
							board[j2] = new char[copyBoard[j2].length];
							for (int k = 0; k < copyBoard[j2].length; k++) {
								board[j2][k] = copyBoard[j2][k];
							}
						}
					}

				}
			}
		}

		System.out.println(Arrays.deepToString(board));
	}

	private boolean capture(char board[][], int x, int y, boolean visited[][]) {
		boolean left = true;
		boolean right = true;
		boolean up = true;
		boolean down = true;
		
		if (x < 0 || y < 0 || x >= board.length || y >= board[x].length) {
			return false;
		}
		visited[x][y] = true;
		if (board[x][y] == 'X') {
			return true;
		}
		board[x][y] = 'X';
		right = capture(board, x, y + 1,visited);
		if (!right) {
			board[x][y] = 'O';
			return false;
		}
		left = capture(board, x, y - 1,visited);
		if (!left) {
			board[x][y] = 'O';
			return false;
		}

		if (left)
			down = capture(board, x + 1, y,visited);

		if (!down) {
			board[x][y] = 'O';
			return false;
		}

		if (down)
			up = capture(board, x - 1, y,visited);

		if (!up) {
			board[x][y] = 'O';
			return false;
		}

		if (left && right && down && up)
			return true;

		return false;

	}

}
