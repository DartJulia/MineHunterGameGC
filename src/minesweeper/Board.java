/**
 * 
 */
package minesweeper;

import java.util.ArrayList;

/**
 * @author juliadart
 *
 */
public abstract class Board {
	private ArrayList<Character> board;
	private int boardSize;
	private int numMines;

	/**
	 * @param board
	 * @param boardSize
	 * @param numMines
	 */
	public Board(ArrayList<Character> board, int boardSize, int numMines) {
		super();
		this.board = board;
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
