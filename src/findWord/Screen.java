package findWord;

import java.awt.Window;
import java.util.List;
import java.util.Random;

public class Screen {

	private int column = 20;
	private int row = 20;

	char[][] window = new char[row][column];
	int wordCounter = 0;

	public Screen() {

		Random random = new Random();

		Place place = new Place();

		List<String> words = place.readWordsFromFile("C:\\Users\\Admin\\Desktop\\words.txt");

		wordCounter = words.size();
		System.out.println(wordCounter + " " + "word is placed in window");
		System.out.println("**********************");

		place.placeRandomWords(window, words);

		place.fillEmptyCells(window);

	}

	public void showWindow() {

		for (int i = 0; i < window.length; i++) {

			for (int j = 0; j < window[i].length; j++) {

				System.out.print(window[i][j] + " ");

			}
			System.out.println();

		}
	}

}