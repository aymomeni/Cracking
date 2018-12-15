package chapter2.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter2.Intersection;
import chapter2.ListNode;
import chapter2.Palindrome;

public class IntersectingTests {

	@Test
	public void test() {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		ListNode l1 = new ListNode(arr[0]);
		ListNode l2 = new ListNode(arr[0]);

		for(int i = 1; i < arr.length; i++){
			if(i == arr.length/2){
				l1.appendToTail(arr[i]);
				l2.next = l1;
				l2 = l2.next;
			} else{
				l1.appendToTail(arr[i]);
				l2.appendToTail(arr[i]);
			}
		}
		
		Intersection inter = new Intersection();
		
		assertTrue(inter.isIntersecting(l1, l2));
	}
	
	@Test
	public void test2() {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		ListNode l1 = new ListNode(arr[0]);
		ListNode l2 = new ListNode(arr[0]);

		for(int i = 1; i < arr.length; i++){
				l1.appendToTail(arr[i]);
				l2.appendToTail(arr[i]);
		}
		
		Intersection inter = new Intersection();
		
		assertFalse(inter.isIntersecting(l1, l2));
	}
	
	@Test
	public void test3() {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		ListNode l1 = new ListNode(arr[0]);
		ListNode l2 = new ListNode(arr[0]);

		for(int i = 1; i < arr.length; i++){
			if(i == arr.length/2){
				l1.appendToTail(arr[i]);
				l2.next = l1;
				l2 = l2.next;
			} else{
				l1.appendToTail(arr[i]);
				l2.appendToTail(arr[i]);
			}
		}
		
		Intersection inter = new Intersection();
		
		assertTrue(inter.isIntersecting(l1, l2));
	}

}
