package cgl_package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunitCells {
	
	@Test
	public void TestJunitCells() {
		int[][] liveCount = {{2,4}};
		RectangualrGrid2_D board = new RectangualrGrid2_D();
		board.CreateBoard(5, liveCount);
		System.out.println("==========TESTCASE ONE PASSED==========");
		Assertions.assertEquals(".....\n.....\n....*\n.....\n.....\n", board.toString());
	}
}
