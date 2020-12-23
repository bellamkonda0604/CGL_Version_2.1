package cgl_Package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class  TestJunitCells{

	@Test
	public void TestJunitCellsOne() {

		int[][] liveCount = {{0,0},{0,1},{1,0},{0,2},{1,2}};
		ConwaysGameOfLife cgl = new ConwaysGameOfLife();
		cgl.start(liveCount, 5);
		System.out.println("==========TESTCASE ONE PASSED==========");
		Cells s =new Cells();
		Assertions.assertEquals("4",String.valueOf(s.isAlive(cgl.boardData)));
	}
	
	@Test
	public void TestJunitCellsTwo() {

		int[][] liveCount = {};
		ConwaysGameOfLife cgl = new ConwaysGameOfLife();
		cgl.start(liveCount, 5);
		System.out.println("==========TESTCASE TWO PASSED==========");
		Cells s =new Cells();
		Assertions.assertEquals("0",String.valueOf(s.isAlive(cgl.boardData)));
	}
}




