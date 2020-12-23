package cgl_Package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunitCgl {


	@Test
	public void TestJunitCGL() {
		int[][] liveCount = {{2,4}};
		ConwaysGameOfLife cgl = new ConwaysGameOfLife();
		cgl.start(liveCount, 5);
		System.out.println("==========TESTCASE ONE PASSED==========");
		Assertions.assertEquals(".....\n.....\n.....\n.....\n.....\n",cgl.toString());
	}
	
	@Test
	public void TestJunitCGL1() {
		int[][] liveCount = {{0,0},{0,1},{1,0}};
		ConwaysGameOfLife cgl = new ConwaysGameOfLife();
		cgl.start(liveCount, 5);
		System.out.println("==========TESTCASE TWO PASSED==========");
		Assertions.assertEquals("**...\n**...\n.....\n.....\n.....\n",cgl.toString());
	}
	
	@Test
	public void TestJunitCGL2() {
		int[][] liveCount = {{0,0},{0,1},{1,0},{0,2},{1,2}};
		ConwaysGameOfLife cgl = new ConwaysGameOfLife();
		cgl.start(liveCount, 5);
		System.out.println("==========TESTCASE THREE PASSED==========");
		Assertions.assertEquals("*.*..\n*.*..\n.....\n.....\n.....\n",cgl.toString());
	}
}



