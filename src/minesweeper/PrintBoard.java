package minesweeper;

import org.omg.Messaging.SyncScopeHelper;

public class PrintBoard {

	public static void main(String[] args) {

		int num = 1;
		int _i = 10;
		int _j = 10;
		
		for (int a = 1; a < 10; ++a) {
			System.out.print("   " + a);
			System.out.print("|");
		}
		System.out.println("");
		
		for (int c = 1; c < 4; ++c) {
			System.out.print(" ");
			System.out.print("  " + "============");
		}
		

		System.out.println(" ");

		for (int b = 1; b < 10; ++b) {
			System.out.print("");
		}
		

		String[][] array = new String[_i][_j];
		for (int i = 0; i < _i; i++) {
			for (int j = 0; j < _j; j++) {
				if (i == 0 || j == 0 || i == _i - 1 || j == _j - 1) {
					array[i][j] = "||";
					if (num < 10) {

						System.out.print(num++);

						System.out.println(array[i][j]);
						
					}
				}
			}
		}
	}

}