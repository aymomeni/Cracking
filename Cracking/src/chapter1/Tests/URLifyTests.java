package chapter1.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.IsUnique;
import chapter1.URLify;

public class URLifyTests {

	@Test
	public void test1() {
		URLify uL = new URLify();
		String sOut = uL.urlifyString("Mr John Smith    ");
		assertEquals("Mr%20John%20Smith", sOut);
	}
}
