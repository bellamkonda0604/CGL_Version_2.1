package cgl_package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunitRectangularGrid2_D {
	
	@Test
	public void TestJunitRectangularGrid2_DOne() {
		int[][] liveCount = {{2,4}};
		RectangualrGrid2_D board = new RectangualrGrid2_D();
		board.CreateBoard(5, liveCount);
//		NextGeneration next = new NextGeneration(b);
		board.NextGeneration(board);
		System.out.println("==========TESTCASE ONE PASSED==========");
		Assertions.assertEquals(".....\n.....\n.....\n.....\n.....", b.liveCount);
	}
	
	@Test
	public void TestJunitRectangularGrid2_DTwo() {
		int liveCount[][] = {{2,4}};
		CreateBoard b = new CreateBoard(5,liveCount);
		NextGeneration next = new NextGeneration(b);
		System.out.println("==========TESTCASE TWO PASSED==========");
		Assertions.assertEquals(".....\n.....\n.....\n.....\n.....", b.liveCount);
	}
}
