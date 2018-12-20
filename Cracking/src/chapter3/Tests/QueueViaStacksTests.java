package chapter3.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter3.QueueViaStacks;

public class QueueViaStacksTests {

	@Test
	public void test() {
		QueueViaStacks qS = new QueueViaStacks();
		
		for(int i = 0; i < 10; i++){
			qS.enqueue(i);
		}
		
		for(int i = 0; i < 10; i++){
			assertEquals(i, qS.dequeue());
		}
	}

}
