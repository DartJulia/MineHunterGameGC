package minesweeper;

public class BoardFunctionality {

	//private static char[][]userBoard = new char[9][9];

	
	
//	public static char[][] initializeUserBoard(){
//
//		for(int i = 0; i<userBoard.length; i++)
//		    for(int j = 0; j<userBoard[i].length; j++)
//		        userBoard[i][j] = '#';
//		
//		return userBoard;
//		}
	
	// Checks user coordinates in reference to the answer board, and responds accordingly 
	public static char [][] checkCell(char[][] answerBoard, char[][] userBoard, int x, int y) {
		char check = answerBoard[x][y];
		// if check is equal to a mine, returns answerBoard
		if (check == '*') {
			return answerBoard;
		// if check is equal to a number, calls updateNumberCell method and returns an updated userBoard 
		// with the number revealed
		} else if (check == '1' || check == '2' || check == '3' || check == '4' || check == '5' || check == '6'
				|| check == '7' || check == '8') {
			return	updateNumberCell(answerBoard, userBoard, x, y);
		// if check is equal to an empty, calls updateEmptyCell method and returns an updated userBoard 
		// with the "-" revealed
		} else if (check == '-') {
			return recurEmptyCell(answerBoard, userBoard, x, y);
		}
		return null;
	}
	
	// Updates number of bombs to the userBoard
	public static char[][] updateBombCell(char[][] answerBoard) {
		
		return answerBoard;
	}

	// update the number to print if there is a bomb next to it
	public static char[][] updateNumberCell(char[][] answerBoard, char[][] userBoard, int x, int y) {
		char check = answerBoard[x][y];
		// the only numbers that will print out next to the bomb is a 1, 2, or 3
		if (check == '1' || check == '2' || check == '3') {
			userBoard[x][y] = check;
			return userBoard;
		}
		return userBoard;
	}

	// If a cell is empty then it adds a "-" to signify an empty spot
	public static char[][] updateEmptyCell(char[][] answerBoard, char[][] userBoard, int x, int y) {
		char check = answerBoard[x][y];
		if (check == '-') {
			userBoard[x][y] = check;
			return userBoard;
		}
		return userBoard;
	}
	public static char[][] recurEmptyCell(char[][] answerBoard, char[][] userBoard, int x, int y) {

		if (x < 0 || x > userBoard.length - 1 || y < 0 || y > userBoard.length - 1)
			return userBoard; // check for bounds

		if (answerBoard[x][y] == '-' && userBoard[x][y] == '#') {// answerBoard is blank & userBoard is unpressed

			userBoard[x][y] = answerBoard[x][y];

			recurEmptyCell(answerBoard, userBoard, x + 1, y);
			recurEmptyCell(answerBoard, userBoard, x - 1, y);
			recurEmptyCell(answerBoard, userBoard, x, y - 1);
			recurEmptyCell(answerBoard, userBoard, x, y + 1);

		} else {
			return userBoard;
		}
		return userBoard;
	}

//	public static boolean pressUnpress(char[][] answerBoard, char[][] userBoard, int x, int y) {
//		//char press = answerBoard[x][y];
//		
//		if(userBoard[x][y] == '#' && answerBoard[x][y] == '-') {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	
	// this will flag a spot if the user chooses flag
	public static char[][] flagCell(char[][] answerBoard, char[][] userBoard, int x, int y) {
		// changes user coordinates to a flag symbol,returns updated userBoard
		if (userBoard[x][y] == '-' || userBoard[x][y] == '1' || userBoard[x][y] == '2' || userBoard[x][y] == '3') {
			return userBoard;
		} else {
		char flag = '>';
			userBoard[x][y] = flag;
			return userBoard;
		}

	}
	// this will un-flag a spot if the user chooses un-flag
	public static char[][] unFlagCell(char[][] answerBoard, char[][] userBoard, int x, int y) {
		// reverses flag method, returns updated userBoard
		char hash = '#';
			userBoard[x][y] = hash;
			return userBoard;

	}
	



}
