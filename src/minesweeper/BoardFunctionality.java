package minesweeper;

import java.util.Arrays;

public class BoardFunctionality {
	private static char[][]answerBoard = {
			{'1','1','1','1','*','1','-','-','-'},
			{'2','*','1','1','2','2','2','1','1'},
			{'*','3','1','-','1','*','3','*','2'},
			{'*','2','1','1','2','1','3','*','2'},
			{'1','1','1','*','2','1','2','1','1'},
			{'-','-','1','1','3','*','3','1','-'},
			{'2','2','1','-','3','*','*','1','-'},
			{'*','*','2','-','2','*','3','1','-'},
			{'3','*','2','-','1','1','1','-','-'}
			};
	private static char[][]userBoard = new char[9][9];

	public static char[][] initializeUserBoard(char[][] userBoard){

		for(int i = 0; i<userBoard.length; i++)
		    for(int j = 0; j<userBoard[i].length; j++)
		        userBoard[i][j] = '#';
		
		return userBoard;
		}
	
	public static void testPrint() {
		// for test printing
		int rows = 9;
		int columns = 9;
				
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<columns; j++){
				System.out.format("%4s", answerBoard[i][j]);
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(answerBoard));
	}
	public static String checkCell(char[][] answerBoard, int x, int y) {
		char check = answerBoard[x][y];
		if(check == '*') {
			return "bomb";
		}
		else if (check == '1' || check == '2' || check == '3') {
			return "num";
		}
		else if (check == '-') {
			return "empty";
		}
		return null;
	}

}
