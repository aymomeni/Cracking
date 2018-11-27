package chapter1.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.RotateMatrix;

public class RotateMatrixTests {

	@Test
	public void test1() {
		RotateMatrix rM = new RotateMatrix();
		
		int[][] matrix = new int[][]{
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		
		int[][] b = rM.rotate(matrix);
		
		assertEquals(7, b[0][0]);
		assertEquals(4, b[0][1]);
		assertEquals(1, b[0][2]);
		assertEquals(8, b[1][0]);
		assertEquals(5, b[1][1]);
		assertEquals(2, b[1][2]);
		assertEquals(9, b[2][0]);
		assertEquals(6, b[2][1]);
		assertEquals(3, b[2][2]);
		
	}

}
