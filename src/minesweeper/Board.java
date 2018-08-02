/**
 * 
 */
package minesweeper;

/**
 * @author juliadart
 *
 */
public abstract class Board {

	private int boardSize;
	private int numMines;

	public static char[][] generateEasyBoard() {
		return null;
	}

	public static char[][] generateMediumBoard() {
		return null;
	}

	public static char[][] generateHardBoard() {
		return null;
	}

	public abstract String checkCell(int x, int y);

	public abstract void updateBoard(int x, int y);
	/**
	 * @param boardSize
	 * @param numMines
	 */
	public Board() {

	}

	public Board(int boardSize, int numMines) {
		super();
		this.boardSize = boardSize;
		this.numMines = numMines;
	}

	/**
	 * @return the boardSize
	 */
	public int getBoardSize() {
		return boardSize;
	}
	/**
	 * @param boardSize
	 *            the boardSize to set
	 */
	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

	/**
	 * @return the numMines
	 */
	public int getNumMines() {
		return numMines;
	}

	/**
	 * @param numMines
	 *            the numMines to set
	 */
	public void setNumMines(int numMines) {
		this.numMines = numMines;
	}

}
