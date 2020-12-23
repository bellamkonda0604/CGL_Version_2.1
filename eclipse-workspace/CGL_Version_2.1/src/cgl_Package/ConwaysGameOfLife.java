package cgl_Package;
/** 
 * 
 * @author BELLAMKONDA YASHWANTH AKHIL
 * 
 * */
/** 
 * Create a ConwaysGameOfLife class  
 * Add start() and PrintBoard() 
 * */
public class ConwaysGameOfLife {
	int aliveCount=0;
	RectangularGrid2_D board;
	boolean[][] boardData;
	ConwaysGameOfLife() {
		board = new RectangularGrid2_D();
	}
	
	/**
	 * Start method creates a board and updates the NextGeneration and set the aliveCount  
	 *  @param - boardSize - size of the board
	 *  @param - liveCount - count of cell lives
	 * 
	 */
	
	public void start(int[][] liveCount, int boardSize) {
		
		boardData = board.CreateBoard(boardSize, liveCount);
//		printBoard(boardData);
		boardData = board.NextGeneration(boardData);
//		printBoard(boardData);
		aliveCount = Cells.isAlive(boardData);
//		System.out.println(aliveCount);
	}
	
	/**
	 * 
	 * @param board
	 * @return
	 */
	
	public static String printBoard(boolean board[][]) {

		String str = " ";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j]) {
					str = str + "*";
				} else {
					str = str + ".";
				}
			}
			str = str.trim();
			str = str + "\n";
			
		}
//		System.out.println(str);

		return str;
	}
	
	/**
	 * 
	 * Converts board to String
	 * 
	 */
	public String toString() {
//		String str = ".....\n.....\n.....\n.....\n.....";
//		String str1 = board.toString();
		String str2 = printBoard(boardData);
//		System.out.println(str2);
		return str2;
	}
}


