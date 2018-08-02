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
		
		
		System.out.println("Welcome to the MineHunter game!");
		
		System.out.println("Please enter the level of difficulty. (easy, medium, hard) ");
		String sizeInput = scan.nextLine();
		
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
