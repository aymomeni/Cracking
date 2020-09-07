package chapter1.Tests;

import static org.junit.Assert.*;

import java.nio.CharBuffer;

import org.junit.Test;

import chapter1.URLify;

public class URLifyTests {

	@Test
	public void test1() {
		URLify uL = new URLify();
		String sOut = uL.urlifyString("Mr John Smith    ");
		assertEquals("Mr%20John%20Smith", sOut);
	}
	
	@Test
	public void test2() {
		URLify uL = new URLify();
		char[] sOut = uL.urlify(new char[]{'M','r',' ','J',' ','S',' ', ' ', ' ', ' '});
		System.out.println(sOut);
		assertEquals(CharBuffer.wrap(new char[]{'M','r','%','2','0','J','%', '2', '0', 'S'}), CharBuffer.wrap(sOut));
	}
}
