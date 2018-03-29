package chapter1.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.OneAway;

public class OneAwayTests {

	@Test
	public void test1() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("pale", "ple");
		
		assertEquals(true, resultBool);
	}

	@Test
	public void test2() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("pales", "pale");
		
		assertEquals(true, resultBool);
	}	
	
	@Test
	public void test3() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("pale", "bale");
		
		assertEquals(true, resultBool);
	}
	
	@Test
	public void test4() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("pale", "bake");
		
		assertEquals(false, resultBool);
	}
	
}
