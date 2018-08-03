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

		int size;

		System.out.println("Welcome to the MineHunter game!");

		System.out.println("Please enter the level of difficulty. (easy, intermediate, difficult) ");
		String sizeInput = scan.nextLine();

		// Outputting board from Functionality class and generateBoard methods based on
		// level of difficulty selected
		if (sizeInput.equalsIgnoreCase("easy")) {
			BoardFunctionality.generateEasyBoard();
		} else if (sizeInput.equalsIgnoreCase("intermediate")) {
			BoardFunctionality.generateMediumBoard();
		} else if (sizeInput.equalsIgnoreCase("difficult")) {
			BoardFunctionality.generateHardBoard();
		}
		// Functionality2.testPrint(Functionality2.generateEasyBoard());

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
			//if user doesn't lose or win program loops
		} while (!check.equalsIgnoreCase("Win") || !check.equalsIgnoreCase("Lose"));

		if (check.equalsIgnoreCase("win")) {
			System.out.println("You Win!!!");
		} else if (check.equalsIgnoreCase("lose")) {
			System.out.println("You Lose!!!");
		}

		scan.close();
	}

}
