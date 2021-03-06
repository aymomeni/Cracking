package chapter1.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.StringCompression;

public class StringCompressionTests {

	@Test
	public void test() {
		StringCompression sC = new StringCompression();
		String temp = sC.stringCompress("aabcccccaaa");
		assertEquals("a2b1c5a3", temp);
	}
	
	public void test2() {
		StringCompression sC = new StringCompression();
		String temp = sC.stringCompress("aaaaaaaa");
		assertEquals("a8", temp);
	}
	
	public void test3() {
		StringCompression sC = new StringCompression();
		String temp = sC.stringCompress("aaaaaaaabbbb");
		assertEquals("a8b4", temp);
	}
	
	public void test4() {
		StringCompression sC = new StringCompression();
		String temp = sC.stringCompress("aaaaaaaabbbbccccc");
		assertEquals("a8b4c5", temp);
	}
	
	public void test5() {
		StringCompression sC = new StringCompression();
		String temp = sC.stringCompress("abcdefg");
		assertEquals("abcdefg", temp);
	}
	
	public void test6() {
		StringCompression sC = new StringCompression();
		String temp = sC.stringCompress("abcdefggggggggggggg");
		assertEquals("abcdefg13", temp);
	}

	public void test7() {
		StringCompression sC = new StringCompression();
		String temp = sC.stringCompress("aabbccdd");
		assertEquals("aabbccdd", temp);
	}
}
