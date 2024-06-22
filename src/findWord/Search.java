package findWord;

import java.awt.Color;

public class Search {

	Color color = Color.BLACK;
	int point = 0;

	public void exist(char[][] board, String word) {
		int[][] dir = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
		boolean[][] highlighted = new boolean[board.length][board[0].length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					if (dfs(i, j, 0, word, dir, board, highlighted)) {
						printBoardWithHighlights(board, highlighted);
						point++;
						System.out.println();
						System.out.println(point + " " + "point earned");
						System.out.println();
					}

				}

			}
		}

	}

	public static boolean dfs(int i, int j, int idx, String word, int[][] dir, char[][] board,
			boolean[][] highlighted) {
		if (idx == word.length())
			return true;

		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(idx)) {
			return false;
		}

		char temp = board[i][j];
		board[i][j] = '$';
		highlighted[i][j] = true;

		boolean result = false;

		for (int d = 0; d < dir.length; d++) {
			int x = i + dir[d][0];
			int y = j + dir[d][1];

			if (dfs(x, y, idx + 1, word, dir, board, highlighted)) {
				result = true;
				break;
			}
		}

		if (!result) {
			highlighted[i][j] = false;
		}

		board[i][j] = temp;
		return result;
	}

	public void printBoardWithHighlights(char[][] board, boolean[][] highlighted) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (highlighted[i][j]) {
					System.out.print("\u001B[1;46m" + board[i][j] + "\u001B[0m "); // Red color
				} else {
					System.out.print(board[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
