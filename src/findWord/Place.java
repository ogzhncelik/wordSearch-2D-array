package findWord;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Place {

	Random RANDOM = new Random();

	public List<String> readWordsFromFile(String fileName) {
		List<String> words = new ArrayList<>();
		try {
			words = Files.readAllLines(Paths.get(fileName));
		} catch (IOException e) {
			System.err.println("Error reading words file: " + e.getMessage());
		}
		return words;
	}

	public void placeRandomWords(char[][] grid, List<String> words) {

		for (String word : words) {
			boolean placed = false;
			while (!placed) {
				int direction = RANDOM.nextInt(2); // 0: horizontal, 1: vertical, 2: diagonal
				int row = RANDOM.nextInt(grid.length);
				int col = RANDOM.nextInt(grid.length);
				int wordLength = word.length();

				if (direction == 0 && col + wordLength <= grid.length) { // horizontal
					if (canPlaceWord(grid, word, row, col, 0, 1)) {
						for (int i = 0; i < wordLength; i++) {
							grid[row][col + i] = word.charAt(i);
						}
						placed = true;
					}
				} else if (direction == 1 && row + wordLength <= grid.length) { // vertical
					if (canPlaceWord(grid, word, row, col, 1, 0)) {
						for (int i = 0; i < wordLength; i++) {
							grid[row + i][col] = word.charAt(i);
						}
						placed = true;
					}
				} 

			}

		}

	}

	public boolean canPlaceWord(char[][] grid, String word, int row, int col, int rowIncrement, int colIncrement) {
		int wordLength = word.length();
		for (int i = 0; i < wordLength; i++) {
			if (row + i * rowIncrement >= grid.length || col + i * colIncrement >= grid.length
					|| grid[row + i * rowIncrement][col + i * colIncrement] != '\0') {
				return false;
			}
		}
		return true;
	}

	public void fillEmptyCells(char[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j] == '\0') {
					grid[i][j] = (char) ('A' + RANDOM.nextInt(26));
				}
			}
		}
	}

}
