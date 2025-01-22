The WordSearch project is a console-based word puzzle game that generates a random grid of letters, places predefined words into the grid, and challenges players to find them. The project highlights the locations of correctly guessed words and calculates a score based on the player's success.

**FEATURES**

**Dynamic Word Placement**

• Words are randomly placed in the grid either horizontally or vertically.

• Remaining empty cells are filled with random letters for a complete grid.

**File-Based Word List**

• Words to be placed in the grid are read from a text file (words.txt), making the game dynamic and customizable.

**Interactive Gameplay**
 
• Players are prompted to guess words one by one.

• Correct guesses earn points, and the word's location in the grid is highlighted.

**Point-Based Scoring**
   
• Each correctly guessed word increases the player's score.

• Final total points are displayed at the end of the game.

**Grid Visualization**
    
• The game displays the grid after every guess, with correctly guessed words highlighted for better visualization.

**HOW IT WORKS**

**1. Initialization**
   
• The game initializes a 20x20 grid.

• Words are read from a file (words.txt).

• Words are placed randomly in the grid using the Place class, either horizontally or vertically, ensuring no overlap.

**2. Word Search Logic**
   
• Players are prompted to enter a word to search for.

• The Search class implements a depth-first search (DFS) algorithm to check for word existence in all four directions (up, down, left, right).

• Correct guesses are highlighted in the grid using ANSI color codes.

**3. Scoring**
   
• Each successful word match increments the player's score.

• The total score is displayed at the end of the game.

**HOW TO RUN THE GAME**

• Clone the Repository

• Set Up the Word List

• Ensure words.txt is present in the specified directory (e.g., C:\Users\Admin\Desktop\words.txt).

• Add your own words to customize the game.

• Compile and Run

• Play the Game

• Follow the on-screen instructions to guess words.

• The game ends after all words in words.txt have been guessed or attempted.
