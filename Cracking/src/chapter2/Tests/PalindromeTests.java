package chapter2.Tests;

import junit.framework.Assert;

import org.junit.Test;

import chapter2.ListNode;
import chapter2.Palindrome;

public class PalindromeTests {

	@SuppressWarnings("deprecation")
	@Test
	public void test(){
		
		Palindrome p = new Palindrome();
		
		int[] arr = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
		
		ListNode lN = new ListNode(arr[0]);
		for(int i = 1; i < arr.length; i++){
			lN.appendToTail(i);
			lN = lN.next;
		}
		
		Assert.assertTrue(p.isPalindrome(lN));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test1(){
		
		Palindrome p = new Palindrome();
		
		int[] arr = {1, 2, 3, 4, 5, 5, 4,3, 2};
		
		ListNode head;
		ListNode lN = new ListNode(arr[0]);
		head = lN;
		for(int i = 1; i < arr.length; i++){
			lN.appendToTail(arr[i]);
		}
		Assert.assertFalse(p.isPalindrome(head));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test3(){
		
		Palindrome p = new Palindrome();
		
		int[] arr = {1, 2, 1};
		
		ListNode head;
		ListNode lN = new ListNode(arr[0]);
		head = lN;
		for(int i = 1; i < arr.length; i++){
			lN.appendToTail(arr[i]);
		}
		Assert.assertTrue(p.isPalindrome(head));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test4(){
		
		Palindrome p = new Palindrome();
		
		int[] arr = {1, 2, 3, 2, 1};
		
		ListNode head;
		ListNode lN = new ListNode(arr[0]);
		head = lN;
		for(int i = 1; i < arr.length; i++){
			lN.appendToTail(arr[i]);
		}
		Assert.assertTrue(p.isPalindrome(head));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test5(){
		
		Palindrome p = new Palindrome();
		
		int[] arr = {1, 2, 3, 4, 2, 1};
		
		ListNode head;
		ListNode lN = new ListNode(arr[0]);
		head = lN;
		for(int i = 1; i < arr.length; i++){
			lN.appendToTail(arr[i]);
		}
		Assert.assertFalse(p.isPalindrome(head));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test6(){
		
		Palindrome p = new Palindrome();

		ListNode lN = null;

		Assert.assertFalse(p.isPalindrome(lN));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test7(){
		
		Palindrome p = new Palindrome();
		
		int[] arr = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
		
		ListNode head;
		ListNode lN = new ListNode(arr[0]);
		head = lN;
		for(int i = 1; i < arr.length; i++){
			lN.appendToTail(arr[i]);
		}
		Assert.assertTrue(p.isPalindrome(head));
	}
	
}
