package bingo_cards;

public class BingoCard {

	private static final int DEFAULT_GRID_SIZE = 5;	
	
	private int[][] bingoCard;
	private int customGridSize;
	
	// default constructor with default grid size
	public BingoCard() {
		bingoCard = new int[DEFAULT_GRID_SIZE][DEFAULT_GRID_SIZE];
		customGridSize = -1;
	}
	
	// constructor with custom grid size
	public BingoCard(int s) {
		customGridSize = s;
		bingoCard = new int[s][s];
	}
	
}
