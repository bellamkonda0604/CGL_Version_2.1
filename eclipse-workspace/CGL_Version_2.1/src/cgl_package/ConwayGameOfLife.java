package cgl_package;

public class ConwayGameOfLife {

	public void printBoard(boolean board[][]) {
		for (int i = 0; i < board.length; i++) {
			String str = " ";
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
	}
	
	public String toString() {
		String str = ".....\n.....\n.....\n.....\n.....";
		return str;
	}
}
