package findWord;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Screen screen = new Screen();
		Search search = new Search();
		Scanner scanner = new Scanner(System.in);
		screen.showWindow();

		int counter = 1;

		while (counter <= screen.wordCounter) {

			System.out.println("*********************");			
			System.out.println("Earned Point:" + " " + search.point);
			System.out.println("Write Searching Word:");			
			System.out.println("*********************");

			String word = scanner.nextLine().toUpperCase();
			
			Thread.sleep(2000);
			
			System.out.println();
			
			search.exist(screen.window, word);
			
			Thread.sleep(2000);	
			
			
			
			screen.showWindow();
			
			counter++;
		}
		System.out.println();		
		System.out.println("TOTAL POINT:" + " " + search.point);

	}
}
