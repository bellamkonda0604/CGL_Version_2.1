package cgl_package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunitCGL {
	
	@Test
	public void TestJunitCGL() {
//		ConwayGameOfLife cgl = new ConwayGameOfLife();
//		CreateBoard b = new CreateBoard();
//		cgl.printBoard({[true],[false]});
		boolean[][] b = new boolean[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				b[i][j] = false;
			}
		}
		int[][] liveCount = {{2,4}};
		RectangualrGrid2_D board = new RectangualrGrid2_D();
		board.CreateBoard(5, liveCount);
		System.out.println("==========TESTCASE ONE PASSED==========");
		Assertions.assertEquals(".....\n.....\n.....\n.....\n.....\n",board.toString());
//		cgl.printBoard(b);
	}
}
