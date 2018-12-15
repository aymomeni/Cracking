package chapter2.Tests;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

import chapter2.ListNode;
import chapter2.LoopDetection;

public class LoopDetectionTests {

	@Test
	public void test() {
		
		LoopDetection lD = new LoopDetection();
		
		ListNode lN = new ListNode(0);
		
		for(int i = 1; i < 10; i++){
			lN.appendToTail(i);
		}
		
		lN.appendToTail(9);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		int test = lD.loopDetect(lN, hs);
		
		assertEquals(9, test);
	}

}
