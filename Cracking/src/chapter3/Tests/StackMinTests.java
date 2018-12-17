package chapter3.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter3.StackMin;

public class StackMinTests {

	@Test
	public void test() {
		StackMin sMin = new StackMin();
		
		sMin.push(5);
		assertEquals(5, sMin.min());
		sMin.push(6);
		assertEquals(5, sMin.min());
		sMin.push(3);
		assertEquals(3, sMin.min());
		sMin.push(7);
		assertEquals(3, sMin.min());
		sMin.pop(); // pops 7
		sMin.pop(); // pops 3
		assertEquals(5, sMin.min()); // {6, 5} min 5
	}

}
