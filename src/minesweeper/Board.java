/**
 * 
 */
package minesweeper;

/**
 * @author juliadart
 * @author matthewrhadigan
 * @author Cheo Rowzee
 * @author Jacob Quickert
 *
 */
public abstract class Board {

	
	// Generates blank userBoard with hash symbols for un-clicked spots
	public static char[][] generateUserBoard(int size) {

		char[][] userBoard = new char[size][size];
		// Loops through array of specified size to generate hashes at each index
		for(int i = 0; i<userBoard.length; i++)
		    for(int j = 0; j<userBoard[i].length; j++)
		        userBoard[i][j] = '#';
		
		return userBoard;
	}

	// Formats board with coordinate labels and spacing. Embeds the userBoard in the
	// formatted grid
	public static void formatBoard(char [][] arr) {

		System.out.print("      ");
		for (int a = 1; a <= arr.length; ++a) {
			if (a < 10) {
				System.out.print(" " + a);
				System.out.print(" |");
			}else {
				System.out.print(" " + a);
				System.out.print("|");
			}
		}
		System.out.println("");

		System.out.println(" ");

		for(int i = 0; i<arr.length; i++) {
			if(i < 9 ) {
				System.out.print((i + 1) + " " + "||");
			} else {
				System.out.print((i + 1) + "||");
			}
			
		    for(int j = 0; j<arr[i].length; j++) {
		    	
		    	System.out.format("%4s" , arr[i][j]); 
		    }
		    System.out.println("");
		}
		
	}

	// generates easy answerBoard - 5x5, mines = 3
	public static char[][] generateEasyBoard() {
		char[][] userBoard1 = { { '1', '1', '1', '-', '-' }, { '1', '*', '1', '-', '-' }, { '1', '1', '1', '1', '1' },
				{ '-', '1', '1', '2', '*' }, { '-', '1', '*', '2', '1' } };

		return userBoard1;
	}

	// generates max mines for easy board
	public static int maxMinesEasy() {

		return 3;
	}

	// generates medium answerBoard - 6x6 mines = 6
	public static char[][] generateMediumBoard() {

		char[][] userBoard2 = { { '-', '-', '-', '1', '*', '2' }, { '1', '1', '1', '2', '3', '*' },
				{ '*', '1', '1', '*', '2', '1' }, { '1', '1', '1', '2', '2', '1' }, { '-', '-', '-', '2', '*', '2' },
				{ '-', '-', '-', '2', '*', '2' } };
		return userBoard2;
	}

	// sets max mines for medium board
	public static int maxMinesMedium() {

		return 6;
	}

	// generates hard answerBoard -7x7 mines = 7
	public static char[][] generateHardBoard() {
		char[][] userBoard3 = { { '1', '1', '1', '-', '1', '1', '1' }, { '1', '*', '2', '2', '2', '*', '1' },
				{ '1', '2', '*', '2', '*', '2', '1' }, { '-', '2', '2', '4', '2', '2', '-' },
				{ '-', '1', '*', '2', '*', '1', '-' }, { '-', '1', '1', '2', '1', '2', '1' },
				{ '-', '-', '-', '-', '-', '1', '*' } };
		return userBoard3;
	}

	// Sets max mines for hard board
	public static int maxMinesHard() {

		return 7;
	}


}
