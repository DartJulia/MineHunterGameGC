/**
* 
*/
package minesweeper;

import java.util.Scanner;

/**
 * 
 * @Team Chupacabra
 * 
 * @author Julia Dart
 * @author Matthew Rhadigan
 * @author Cheo Rowzee
 * @author Jacob Quickert
 * 
 *
 */
public class MineHunterApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int mineCount = 0;
		int maxMines = 0;
		int flagCount = 0;
		char[][] userBoard = null;
		char[][] answerBoard = null;
		int size = 0;
		int numMines = 0;
		String again = null;
		
		System.out.println("Welcome to the MineHunter game!");
		System.out.println();
		System.out.println("To win, flag all the mines in your field. ");
		System.out.println("Also don't die...");
		//userInput asking for difficulty level
		do {
		String sizeInput = Validator.getString(scan, "Please enter the level of difficulty (easy, medium, hard): ");
		System.out.println();
		// Outputting board from Functionality class and generateBoard methods based on
		// level of difficulty selected
		
		if (sizeInput.equalsIgnoreCase("easy")) {
			size = 5;
				numMines = 3;
				flagCount = numMines;
				// test System.out.println(Board.generateMineArray(size));
				
			// calling generateEasyBoard method from Board class and assigning to an answerBoard variable
			// creates a 5 x 5 2d array to compare against a user's action
			answerBoard = Board.generateEasyBoard();
			userBoard = Board.generateUserBoard(size);// creating array of # characters of the same size as
													  // the answerBoard for the user to manipulate
			// Setting max number of mines for a win scenario
				maxMines = numMines;
			// this method formats our userBoard with coordinates down each side for reference
			Board.formatBoard(userBoard);
			System.out.println("There are " + numMines + " mines and " + flagCount + " flags in this game.");

		} else if (sizeInput.equalsIgnoreCase("medium")) {
			size = 6;
				numMines = 6;
				flagCount = numMines;
				// calling generateMediumBoard method from Board class and assigning to an answerBoard variable
				// creates a 6 x 6 2d array to compare against a user's action
			answerBoard = Board.generateMediumBoard();
			userBoard = Board.generateUserBoard(size);// creating array of # characters of the same size as
			  										  // the answerBoard for the user to manipulate
			// Setting max number of mines for a win scenario
				maxMines = numMines;
			// this method formats our userBoard with coordinates down each side for reference
			Board.formatBoard(userBoard);
			System.out.println("There are " + numMines + " mines and " + flagCount + " flags in this game.");
		} else if (sizeInput.equalsIgnoreCase("hard")) {
			size = 7;
				numMines = 7;
				flagCount = numMines;
				// calling generateHardBoard method from Board class and assigning to an answerBoard variable
				// creates a 7 x 7 2d array to compare against a user's action
			answerBoard = Board.generateHardBoard();
			userBoard = Board.generateUserBoard(size);// creating array of # characters of the same size as
													  // the answerBoard for the user to manipulate
			// Setting max number of mines for a win scenario
				maxMines = numMines;
			// this method formats our userBoard with coordinates down each side for reference
			Board.formatBoard(userBoard);
			System.out.println("There are " + numMines + " mines and " + flagCount + " flags in this game.");
		}
			System.out.println();

		// Loop to continue entering in coordinates
		do {
				int userRow = Validator.getInt(scan, "Please choose a square! (row coordinate): ", 1, size);
			
			//adjust userX to match array indices
				int row = userRow - 1;

				int userColumn = Validator.getInt(scan, "Please choose a square! (column coordinate): ", 1, size);
			
			//adjust userX to match array indices
				int column = userColumn - 1;

			// Ask user action for chosen square
			String userAction = Validator.getString(scan,
					"What would you like to do with this spot? (click, flag, unflag): ");

		
			// based on user choice update chosen spots on board with appropriate symbol
			if (userAction.equals("click")) {
				// loser is the method for if they click a bomb
					System.out.println(loser(answerBoard, row, column));
					// reassigning userBoard to reflect user's action
					userBoard = BoardFunctionality.checkCell(answerBoard, userBoard, row, column);
				Board.formatBoard(userBoard);
				
			} else if (userAction.equals("flag")) {
				if (flagCount > 0) {	// this stops them from using more flags than the user has
					
					// reassigning userBoard to reflect user's action
					userBoard = BoardFunctionality.flagCell(answerBoard, userBoard, row, column);
					// user only has as many flags as bombs-- this counts down the flags they use
					flagCount--;
					System.out.println("You have this many flags left: " + flagCount);
				}else {
					System.out.println("Sorry, you have no more flags...");
				}
				Board.formatBoard(userBoard);
				// this updates whether the user correctly flags a mine.
					if (answerBoard[row][column] == '*') {
					mineCount++;

				}
				

			} else if (userAction.equals("unflag")) {
				if (userBoard [row][column] == '>') { //only unflag if there is really a flag at coordinates
					userBoard = BoardFunctionality.unFlagCell(answerBoard, userBoard, row, column);
					// user only has as many flags as bombs-- this counts up the flags they "un-use"
					flagCount++;
				} else {
					System.out.println("Hmm, it seems this is not a flag. How strange! ");
				}
				Board.formatBoard(userBoard);
				// this updates whether the user incorrectly unflags a mine.
					if (answerBoard[row][column] == '*') {
					mineCount--;

				}
			}

			// If user flags all mines prints out a Win screen and solution
			if (mineCount == maxMines) {
				System.out.println();
				System.out.println("You win!");

				Board.formatBoard(answerBoard);
				break;
			}

			
			//if user doesn't lose or win program loops
		} while (userBoard != answerBoard);

			System.out.println();
		System.out.println("Would you like to play again? Yes or No ");
		again = scan.next();

		} while (again.equalsIgnoreCase("Yes"));
	
		System.out.println("Thanks for playing!!! ");


		scan.close();
	}
	
	// method displaying screen if the user clicks a bomb
	public static String loser(char[][] answerBoard, int x, int y) {
		if (answerBoard[x][y] == '*') {

			return "Sorry, you lose! You are dead now. Sad.";

		}
		return "";

	}

}
