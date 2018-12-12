package chapter2.Tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import chapter2.DeleteMiddleNode;
import chapter2.KthToLast;
import chapter2.ListNode;

public class DeleteMiddleNodeTests {

	@Test
	public void test() {
			
		ListNode list = new ListNode(0);
			
		int[] arr = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			
		for(int i = 0; i < arr.length; i++){
			list.appendToTail(arr[i]);
		}
			
			
		DeleteMiddleNode k = new DeleteMiddleNode();
			
		k.deleteMiddleNode(list);
		
		int counter = 1;
		while(list != null){
			System.out.print(list.data + " ");
			list = list.next;
			if(list != null){
				counter++;
			}
		}

		Assert.assertEquals(9, counter);
		
		System.out.println();
	}
	
	@Test
	public void test2() {
			
		ListNode list = new ListNode(1);
			
		int[] arr = new int[]{ 2, 3};
			
		for(int i = 0; i < arr.length; i++){
			list.appendToTail(arr[i]);
		}
			
			
		DeleteMiddleNode k = new DeleteMiddleNode();
			
		k.deleteMiddleNode(list);

		int counter = 1;
		while(list != null){
			System.out.print(list.data + " ");
			list = list.next;
			if(list != null){
				counter++;
			}
		}
		
		Assert.assertEquals(2, counter);
		
		
	}
}
