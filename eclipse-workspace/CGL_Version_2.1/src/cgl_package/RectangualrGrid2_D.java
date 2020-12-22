package cgl_package;

public class RectangualrGrid2_D extends ConwayGameOfLife{

	public boolean[][] CreateBoard(int n, int l[][]) {
		boolean CglBoard[][] = new boolean[n][n];
		for (int i = 0; i < l.length; i++) {
			int row = l[i][0];
			int col = l[i][1];
			CglBoard[row][col] = true;
		}
//		System.out.println("Current Generation");
		printBoard(CglBoard);
		return CglBoard;
	}
	
//	public isPossible() {
////		CurrentGeneration c = new CurrentGeneration();
////		NextGeneration next = new NextGeneration();
////		if (c == next) {
////			return c;
//		
//		}
//	}
	
	public void NextGeneration(boolean board[][]) {
		int n = board.length;
		boolean[][] newBoard = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				Cells c = new Cells();
				c.liveCount(newBoard, i, j)
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
		System.out.println("Next Generation");
		printBoard(newBoard);
//		return newBoard;
	}
}
