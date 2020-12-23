package cgl_Package;
/**
 * 
 * 
 * @author BELLAMKONDA
 *
 * Create a RectangularGrid2_D class and 
 * add methods @isPossible()
 * 			   @createBoard()
 * 			   @nextGeneration()
 * 			   @liveCount() 
 */
public class RectangularGrid2_D {
	
	/**
	 * 
	 * @param n
	 * @param l
	 * @return
	 * 
	 */
	public boolean[][] CreateBoard(int n, int l[][]) {
//		CglBoard = ConwaysGameOfLife.printBoard(board);
		boolean CglBoard[][] = new boolean[n][n];
		for (int i = 0; i < l.length; i++) {
			int row = l[i][0];
			int col = l[i][1];
			CglBoard[row][col] = true;
		}
//		System.out.println("Current Generation");
//		printBoard(CglBoard);
		return CglBoard;
	}
	
	/**
	 * 
	 * @param currentBoard
	 * @param nextBoard
	 * @return
	 * 
	 */
	public boolean isPossible(boolean currentBoard[][], boolean nextBoard[][]) {
		String currentGeneration = printString(currentBoard);
		String nextGeneration = printString(nextBoard);
		if (currentGeneration.equals(nextGeneration)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param board
	 * @param row
	 * @param col
	 * @return
	 * 
	 */
	public static int liveCount(boolean[][] board, int row, int col) {
		int n = board.length;
		int count = 0;
		
		
		for (int i = row - 1; i < row + 2; i++) {
			for (int j = col - 1; j < col + 2; j++) {
				
				if((i>=0 && j>=0) && (i<n && j<n)) {
					
					if(!(i==row && j== col))
					{
						 if(board[i][j])
						 {
							 count++;
						 }				
					} 
				}
			}
		}
		return count;
				
//				if (i != row || j != col) {
//					if (i >= 0 && i < n && j >= 0 && j < n && board[i][j]) {
//						if(row==1 && col==3) {
//							System.out.println("ans "+i+j);
//						}
//						count +=1;
//					}
//				}
//			}
//		}
//		return count;
	}
	
	/**
	 * 
	 * @param board
	 * @return
	 * 
	 */
	public boolean[][] NextGeneration(boolean board[][]) {
		int n = board.length;
		boolean[][] newBoard = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
//				Cells c = new Cells();
//				c.liveCount(newBoard, i, j);
				int lives = liveCount(board, i, j);

				if (board[i][j]) {
					if (lives < 2) {
						newBoard[i][j] = false;
					} else if (lives > 3) {
						newBoard[i][j] = false;
					} else {
						newBoard[i][j] = true;
					}
				} else {
					if (lives == 3) {
						newBoard[i][j] = true;
					}
				}
			}
		}
		
//		System.out.println("Next Generation");
		//System.out.println(newBoard);
		ConwaysGameOfLife.printBoard(newBoard);
//		System.out.println("end");
		return newBoard;
	}

	/**
	 * 
	 * @param board
	 * @return
	 * 
	 */
	public static String printString(boolean[][] board) {
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
			System.out.println(str);
		}
		return str;
	}
	
}

