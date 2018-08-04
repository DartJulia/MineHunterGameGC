package minesweeper;

//import org.omg.Messaging.SyncScopeHelper;

public class PrintBoard {

	public static void main(String[] args) {

		int num = 1;
		int _j = 10;
		int _k = 10;
		System.out.print("    ");
		for (int a = 1; a < 25; ++a) {
			System.out.print(" " + a);
			System.out.print(" |");
		}
		System.out.println("");
		
		for (int c = 1; c < 9; ++c) {
			System.out.print(" ");
			System.out.print("  " + "============");
		}
		

		System.out.println(" ");
		
		for(int i = 0; i<arr.length; i++) {
			
			String[][] array = new String[_j][_k];
			for (int j = 0; j < _j; j++) {
				for (int k = 0; k < _k; k++) {
					if (j == 0 || k == 0 || j == _j - 1 || k == _k - 1) {
						array[j][k] = "||";
						if (num < 25) {
							
							System.out.print(num++);
							
							System.out.print(array[j][k]);
							
						}
					}
				}
			}
		    for(int j = 0; j<arr[i].length; j++) {
		        System.out.format("%4s" , arr[i][j]); 
		    }
		    System.out.println("");
		}
		
		

	}


}