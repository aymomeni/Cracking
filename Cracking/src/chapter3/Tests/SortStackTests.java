package chapter3.Tests;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import static org.junit.Assert.*;
import chapter3.SortStack;

public class SortStackTests {

	@Test
	public void test() {
		SortStack ss = new SortStack();
		int[] correctVals = {5, 4, 3, 2, 1};
		ss.push(5);
		ss.push(4);
		ss.push(3);
		ss.push(2);
		ss.push(1);
		
		ss.sort();
		
		for(int i = 0; i < 5; i++){
			System.out.print(ss.peek() + " ");
			assertEquals(correctVals[i], ss.pop());
		}
		System.out.println();
	}
	
	@Test
	public void test2() {
		SortStack ss = new SortStack();
		int[] correctVals = {5, 4, 3, 2, 1};
		ss.push(4);
		ss.push(2);
		ss.push(3);
		ss.push(1);
		ss.push(5);
		
		ss.sort();
		
		for(int i = 0; i < 5; i++){
			System.out.print(ss.peek() + " ");
			assertEquals(correctVals[i], ss.pop());
		}
		System.out.println();
	}
	
	@Test
	public void test3() {
		SortStack ss = new SortStack();
		int[] correctVals = {5, 4, 3, 2, 1};
		ss.push(1);
		ss.push(2);
		ss.push(3);
		ss.push(4);
		ss.push(5);
		
		ss.sort();
		
		for(int i = 0; i < 5; i++){
			System.out.print(ss.peek() + " ");
			assertEquals(correctVals[i], ss.pop());
		}
		System.out.println();
	}
	
	@Test
	public void test4() {
		SortStack ss = new SortStack();
		Integer[] correctVals = new Integer[100];
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < 100; i++){
			
			int val = (int)(Math.random()*100+1);
			if(set.contains(val)){
				i--;
				continue;
			} 
			ss.push(val);
			correctVals[i] = val;
			set.add(val);
			System.out.println(val);
		}
		
		Arrays.sort(correctVals, Collections.reverseOrder());
		ss.sort();
		
		for(int i = 0; i < 100; i++){
			if(!set.contains(i)){
				System.out.println(i);
			}
			System.out.print(ss.peek() + " ");
			assertEquals((int)correctVals[i], ss.pop());
		}
		System.out.println();
	}
	
	
	

}

