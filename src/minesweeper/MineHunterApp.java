/**
* 
*/
package minesweeper;

import java.util.Scanner;

/**
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
		char[][] userBoard = null;
		char[][] answerBoard = null;
		int size = 0;
		String again = null;
		
		System.out.println("Welcome to the MineHunter game!");
		System.out.println();
		//userInput asking for difficulty level
		do {
		String sizeInput = Validator.getString(scan, "Please enter the level of difficulty (easy, medium, hard): ");
		System.out.println();
		// Outputting board from Functionality class and generateBoard methods based on
		// level of difficulty selected
		
		if (sizeInput.equalsIgnoreCase("easy")) {
			size = 5;
				// test System.out.println(Board.generateMineArray(size));
			answerBoard = Board.generateEasyBoard();
			userBoard = Board.generateUserBoard(size);
			// Setting max number of mines for a win scenario
			maxMines = Board.maxMinesEasy();
			Board.formatBoard(userBoard);

		} else if (sizeInput.equalsIgnoreCase("medium")) {
			size = 6;
			answerBoard = Board.generateMediumBoard();
			userBoard = Board.generateUserBoard(size);
			// Setting max number of mines for a win scenario
			maxMines = Board.maxMinesMedium();
			Board.formatBoard(userBoard);
		} else if (sizeInput.equalsIgnoreCase("hard")) {
			size = 7;
			answerBoard = Board.generateHardBoard();
			userBoard = Board.generateUserBoard(size);
			// Setting max number of mines for a win scenario
			maxMines = Board.maxMinesHard();
			Board.formatBoard(userBoard);
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
				// winLose is the method for if they click a bomb
					System.out.println(loser(answerBoard, row, column));
					userBoard = BoardFunctionality.checkCell(answerBoard, userBoard, row, column);
				Board.formatBoard(userBoard);
				
			} else if (userAction.equals("flag")) {
					userBoard = BoardFunctionality.flagCell(answerBoard, userBoard, row, column);
				Board.formatBoard(userBoard);
					if (answerBoard[row][column] == '*') {
					mineCount++;

				}
				

			} else if (userAction.equals("unflag")) {
					userBoard = BoardFunctionality.unFlagCell(answerBoard, userBoard, row, column);
				Board.formatBoard(userBoard);
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
		System.out.println("Would you like to play again? Yes or No");
		again = scan.next();

		} while (again.equalsIgnoreCase("Yes"));
	



		scan.close();
	}
	
	// method displaying screen if the user clicks a bomb
	public static String loser(char[][] answerBoard, int x, int y) {
		if (answerBoard[x][y] == '*') {

			return "Sorry, you lose!";

		}
		return "";

	}

}
