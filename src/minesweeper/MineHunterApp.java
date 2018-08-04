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
		char[][] userBoard;
		char[][] answerBoard = null;
		int size;
		
		

		System.out.println("Welcome to the MineHunter game!");

		System.out.println("Please enter the level of difficulty. (easy, intermediate, difficult) ");
		String sizeInput = scan.nextLine();

		// Outputting board from Functionality class and generateBoard methods based on
		// level of difficulty selected
		if (sizeInput.equalsIgnoreCase("easy")) {
			answerBoard = Board.generateEasyBoard();
			userBoard = Board.generateUserBoard(5);
			Board.formatBoard(userBoard);
			//BoardFunctionality.testPrint(userBoard);
		} else if (sizeInput.equalsIgnoreCase("intermediate")) {
			answerBoard = Board.generateMediumBoard();
			userBoard = Board.generateUserBoard(7);
			Board.formatBoard(userBoard);
		} else if (sizeInput.equalsIgnoreCase("difficult")) {
			answerBoard = Board.generateHardBoard();
			userBoard = Board.generateUserBoard(9);
			Board.formatBoard(userBoard);
		}
		// Functionality2.testPrint(Functionality2.generateEasyBoard());
		// checkCell c = new checkCell();
//		answerBoard = Board.generateEasyBoard();
//		System.out.println(answerBoard.toString());
		// Outprint of board
		do {
			System.out.println("Please choose a square! (x coordinate)");
			int userX = scan.nextInt();

			System.out.println("Please choose a square! (y coordinate)");
			int userY = scan.nextInt();
			scan.nextLine();

			System.out.println("What would you like to do with this spot? (click, flag, unflag)");
			String userAction = scan.nextLine();

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
