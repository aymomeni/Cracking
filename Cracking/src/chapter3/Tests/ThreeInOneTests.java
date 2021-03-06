package chapter3.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter3.ThreeInOne;

public class ThreeInOneTests {

	@Test
	public void test1() {
		ThreeInOne t = new ThreeInOne();
		
		for(int i = 0; i < 33; i++){
			t.push(i, 0);
			t.push(i, 1);
			t.push(i, 2);
		}
		
		t.push(33, 0);
		System.out.println("Test1: " + t.toString());
		assertEquals(200, t.getSizeOfInternalArray());
	}
	
	@Test
	public void test2() {
		ThreeInOne t = new ThreeInOne();
		
		for(int i = 0; i < 33; i++){
			t.push(i, 0);
			t.push(i, 1);
			t.push(i, 2);
		}
		
		for(int i = 0; i < 33; i++){
			t.pop(0);
			t.pop(1);
			t.pop(2);
		}
		
		System.out.println("Test2: " + t.toString());
		assertEquals(100, t.getSizeOfInternalArray());
		assertEquals(-1, t.pop(0));
		assertEquals(-1, t.pop(1));
		assertEquals(-1, t.pop(2));
	}
	
	@Test
	public void test3() {
		ThreeInOne t = new ThreeInOne();
		
		for(int i = 0; i < 10; i++){
			t.push(i, 0);
			t.push(i, 1);
			t.push(i, 2);
		}
		
		for(int i = 0; i < 3; i++){
			t.pop(0);
			t.pop(1);
			t.pop(2);
		}
		
		assertEquals(6, t.peek(0));
		assertEquals(6, t.peek(1));
		assertEquals(6, t.peek(2));
	}
	
	@Test
	public void test4() {
		ThreeInOne t = new ThreeInOne();
		
		for(int i = 0; i < 33; i++){
			t.push(i, 0);
			t.push(i, 1);
			t.push(i, 2);
		}
		
		t.push(33, 0);
		System.out.println("Test4 before pop: " + t.toString());
		for(int i = 0; i < 33; i++){
			t.pop(0);
			t.pop(1);
			t.pop(2);
		}
		
		assertEquals(false, t.isEmpty(0));
		assertEquals(true, t.isEmpty(1));
		System.out.println("Test4: " + t.toString());
		assertEquals(true, t.isEmpty(2));
		
		System.out.println("Test4: " + t.toString());
		assertEquals(200, t.getSizeOfInternalArray());
		t.pop(0);
		assertTrue(t.isEmpty(0));
	}

}
