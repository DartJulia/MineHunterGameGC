package minesweeper;

public class BoardFunctionality {
	// private static char[][]answerBoard = {
	// {'1','1','1','1','*','1','-','-','-'},
	// {'2','*','1','1','2','2','2','1','1'},
	// {'*','3','1','-','1','*','3','*','2'},
	// {'*','2','1','1','2','1','3','*','2'},
	// {'1','1','1','*','2','1','2','1','1'},
	// {'-','-','1','1','3','*','3','1','-'},
	// {'2','2','1','-','3','*','*','1','-'},
	// {'*','*','2','-','2','*','3','1','-'},
	// {'3','*','2','-','1','1','1','-','-'}
	// };
	private static char[][]userBoard = new char[9][9];

	public static char[][] initializeUserBoard(){

		for(int i = 0; i<userBoard.length; i++)
		    for(int j = 0; j<userBoard[i].length; j++)
		        userBoard[i][j] = '#';
		
		return userBoard;
		}
	

	public static char [][] checkCell(char[][] answerBoard, char[][] userBoard, int x, int y) {
		char check = answerBoard[x][y];
		if (check == '*') {
			return answerBoard;
		} else if (check == '1' || check == '2' || check == '3' || check == '4' || check == '5' || check == '6'
				|| check == '7' || check == '8') {
			return	updateNumberCell(answerBoard, userBoard, x, y);
		} else if (check == '-') {
			return updateEmptyCell(answerBoard, userBoard, x, y);
		}
		return null;

	}
	public static char[][] updateBombCell(char[][] answerBoard) {
		
		return answerBoard;
	}


	public static char[][] updateNumberCell(char[][] answerBoard, char[][] userBoard, int x, int y) {
		char check = answerBoard[x][y];
		if (check == '1' || check == '2' || check == '3') {
			userBoard[x][y] = check;
			return userBoard;
		}
		return userBoard;
	}

	public static char[][] updateEmptyCell(char[][] answerBoard, char[][] userBoard, int x, int y) {
		char check = answerBoard[x][y];
		if (check == '-') {
			userBoard[x][y] = check;
			return userBoard;
		}
		return userBoard;
	}
	public static boolean pressUnpress(char[][] answerBoard, char[][] userBoard, int x, int y) {
		//char press = answerBoard[x][y];
		
		if(userBoard[x][y] == '#' && answerBoard[x][y] == '-') {
			return true;
		}
		else {
			return false;
		}
	}
	
	// public static boolean outOfBounds(int x, int y) {
	// int [][] arr = new int [9][9];
	// if(x < 0 && x > 8 && y < 0 && y > 8) {
	// return true;
	// }else if(x > 0 && x < 8 && y > 0 && y < 8) {
	// return false;
	// }
	// return true;
	// }


	public static char[][] flagCell(char[][] answerBoard, char[][] userBoard, int x, int y) {
		// char check = answerBoard[x][y];
		char flag = '>';
			userBoard[x][y] = flag;
			return userBoard;

	}

	public static char[][] unFlagCell(char[][] answerBoard, char[][] userBoard, int x, int y) {
		// char check = answerBoard[x][y];
		char hash = '#';
			userBoard[x][y] = hash;
			return userBoard;

	}
	



}
