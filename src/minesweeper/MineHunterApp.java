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
		int size;
		
		
		System.out.println("Welcome to the MineHunter game!");
		
		System.out.println("Please enter the level of difficulty. (easy, intermediate, difficult) ");
		String sizeInput = scan.nextLine();
		
		
		// Outputting board from Functionality class and generateBoard methods based on level of difficulty selected
        if (sizeInput.equalsIgnoreCase("easy")) {
            BoardFunctionality.generateEasyBoard();
        } else if (sizeInput.equalsIgnoreCase("intermediate")) {
            BoardFunctionality.generateMediumBoard();
        } else if (sizeInput.equalsIgnoreCase("difficult")) {
            BoardFunctionality.generateHardBoard();
        }
        //Functionality2.testPrint(Functionality2.generateEasyBoard());
		
		
		
		// Outprint of board
		
		System.out.println("Please choose a square! (x coordinate)");
		int userX = scan.nextInt();
		
		System.out.println("Please choose a square! (y coordinate)");
		int userY = scan.nextInt();
		
		System.out.println("What would you like to do with this spot? (click, flag, unflag)");
		String userAction = scan.nextLine();
		
		// reference check cell to check user input 
		
		if (check.equals == "bomb") {
			System.out.println("You Lose!");
			// display answer board
		}
		else if (check.equals == "number") {
			// update board method
			// uncover AllToNums
			// redisplaying new Board
		}
		else if (check.equals == "number") {
			// uncoverNum
			// redisplay board
		}
		else if (check.equals == "last flag") {
			System.out.println("You Win!");
			// display answer
		}
		
		
		
		
		
		
		
	}

}
