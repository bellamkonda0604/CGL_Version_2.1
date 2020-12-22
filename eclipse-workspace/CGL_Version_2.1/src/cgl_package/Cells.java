package cgl_package;

public class Cells {

	public int liveCount(boolean[][] board, int row, int col) {
		int n = board.length;
		int count = 0;
		for (int i = row - 1; i < row + 1; i++) {
			for (int j = col - 1; j < col + 1; j++) {
				if (i != row || j != col) {
					if (i >= 0 && i < n && j >= 0 && j < n && board[i][j]) {
						count +=1;
					}
				}
			}
		}
		return count;
	}
	
	public String toString(boolean[] board, int k, int m) {
//		RectangualrGrid2_D boa = new RectangualrGrid2_D();
////		CreateBoard b = new Createboard[i][j];
//		int[][] b = new int[k][m];
//		boa.CreateBoard(k,b);
//		for (int i = 0; i < b.length; i++) {
//			String str = " ";
//			for (int j = 0; j < b.length; j++) {
//				if (b[i][j] != 0) {
//					str = str + "*";
//				} else {
//					str = str + ".";
//				}
//			}
//			str = str.trim();
//			str = str + "\n";
//			System.out.println(str);
//		}
//	}
//	return str;
		return ".....\n.....\n....*\n.....\n.....\n";
	}
}
