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
		String isMine;
		String inNum;
		String isLastFlag;
		String check = null;
		char[][] userBoard = null;
		char[][] answerBoard = null;
		int size = 0;
		
		System.out.println("Welcome to the MineHunter game!");

		System.out.println("Please enter the level of difficulty. (easy, intermediate, difficult) ");
		String sizeInput = scan.nextLine();

		// Outputting board from Functionality class and generateBoard methods based on
		// level of difficulty selected
		if (sizeInput.equalsIgnoreCase("easy")) {
			size = 5;
			answerBoard = Board.generateEasyBoard();
			userBoard = Board.generateUserBoard(size);
			Board.formatBoard(userBoard);
		} else if (sizeInput.equalsIgnoreCase("intermediate")) {
			size = 6;
			answerBoard = Board.generateMediumBoard();
			userBoard = Board.generateUserBoard(size);
			Board.formatBoard(userBoard);
		} else if (sizeInput.equalsIgnoreCase("difficult")) {
			size = 7;
			answerBoard = Board.generateHardBoard();
			userBoard = Board.generateUserBoard(size);
			Board.formatBoard(userBoard);
		}

		// Outprint of board
		do {
			int userX = Validator.getInt(scan, "Please choose a square! (x coordinate)", 1, size);
			
			//adjust userX to match array indices
			int x = userX - 1;

			int userY = Validator.getInt(scan, "Please choose a square! (y coordinate)", 1, size);
			
			//adjust userX to match array indices
			int y = userY - 1;

			String userAction =  Validator.getString(scan, "What would you like to do with this spot? (click, flag, unflag)");
			System.out.println(userAction);
			
			if(userAction == "click")	{
				userBoard = BoardFunctionality.checkCell(answerBoard, userBoard, x, y);
				
			}else if(userAction == "flag")  {
				userBoard = BoardFunctionality.flagCell(answerBoard, userBoard, x, y);  					
				
			}else if(userAction == "unflag")  {
				userBoard = BoardFunctionality.unFlagCell(answerBoard, userBoard, x, y);
			}
			
			
			// new updated board
			// until they either win or lose
			check = scan.next();
			winLose(answerBoard, userX, userY);
			//if user doesn't lose or win program loops
		} while (!check.equalsIgnoreCase("Win") || !check.equalsIgnoreCase("Lose"));

		if (check.equalsIgnoreCase("win")) {
			System.out.println("You Win!!!");
		} else if (check.equalsIgnoreCase("lose")) {
			System.out.println("You Lose!!!");
		}

		scan.close();
	}
	
	public static String winLose(char[][] answerBoard, int x, int y) {
		if (answerBoard[x][y] == '*') {

			return "Sorry, you lose!";
		}
		return "";
	}

}
