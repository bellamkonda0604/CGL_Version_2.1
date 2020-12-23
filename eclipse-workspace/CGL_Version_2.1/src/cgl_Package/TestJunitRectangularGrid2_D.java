package cgl_Package;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunitRectangularGrid2_D {
	@Test
	public void TestJunitRectangularGrid2_DOne() {
		int[][] liveCount = {{2,4},{2,3},{1,2}};
		RectangularGrid2_D board = new RectangularGrid2_D();
		boolean[][] brd = board.CreateBoard(5, liveCount);
		System.out.println("==========TESTCASE ONE PASSED==========");
		Assertions.assertEquals(".....\n..*..\n...**\n.....\n.....\n", RectangularGrid2_D.printString(brd));
	}
	
	@Test
	public void TestJunitRectangularGrid2_DTwo() {
		int[][] liveCount = {{2,4},{2,3},{1,2}};
		RectangularGrid2_D board = new RectangularGrid2_D();
		board.CreateBoard(5, liveCount);
		boolean[][] boardData = board.CreateBoard(5, liveCount);
		boardData = board.NextGeneration(boardData );
		System.out.println("==========TESTCASE TWO PASSED==========");
		Assertions.assertEquals(".....\n...*.\n...*.\n.....\n.....\n", RectangularGrid2_D.printString(boardData));
	}
	
	@Test
	public void TestJunitRectangularGrid2_DThree() {
		int[][] liveCount = {{2,4},{2,3},{1,2}};
		RectangularGrid2_D board = new RectangularGrid2_D();
		board.CreateBoard(5, liveCount);
		boolean[][] boardData = board.CreateBoard(5, liveCount);
		boardData = board.NextGeneration(boardData );
		System.out.println("==========TESTCASE THREE PASSED==========");
		Assertions.assertEquals(".....\n...*.\n...*.\n.....\n.....\n", RectangularGrid2_D.printString(boardData));
	}
		
	@Test
	public void TestJunitRectangularGrid2_DFour() {
		int[][] liveCount = {{0,0},{0,1},{1,0},{0,2},{1,2}};
		ConwaysGameOfLife cgl = new ConwaysGameOfLife();
		cgl.start(liveCount, 5);
		System.out.println("==========TESTCASE FOUR PASSED==========");
		Assertions.assertEquals("*.*..\n*.*..\n.....\n.....\n.....\n",RectangularGrid2_D.printString(cgl.boardData));
	}
	
	@Test
	public void TestJunitRectangularGrid2_DFive() {
		int[][] liveCount = {{2,4},{2,3},{1,2}};
		RectangularGrid2_D board = new RectangularGrid2_D();
		board.CreateBoard(5, liveCount);
		boolean[][] boardData = board.CreateBoard(5, liveCount);
		boolean[][] nextBoardData = board.NextGeneration(boardData );
		System.out.println("==========TESTCASE FIVE PASSED==========");
		Assertions.assertEquals(false, board.isPossible(boardData, nextBoardData));
	}
		
	@Test
	public void TestJunitRectangularGrid2_DSix() {
		int[][] liveCount = {};
		RectangularGrid2_D board = new RectangularGrid2_D();
		board.CreateBoard(5, liveCount);
		boolean[][] boardData = board.CreateBoard(5, liveCount);
		boolean[][] nextBoardData = board.NextGeneration(boardData );
		System.out.println("==========TESTCASE SIX PASSED==========");
		Assertions.assertEquals(true, board.isPossible(boardData, nextBoardData));
	}
}




