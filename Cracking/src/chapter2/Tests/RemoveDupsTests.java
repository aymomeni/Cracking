package chapter2.Tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import chapter2.Node;
import chapter2.RemoveDups;

public class RemoveDupsTests {

	@Test
	public void test() {
		
		Node list = new Node(0);
		
		int[] arr = new int[]{ 1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 7};
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
			list.appendToTail(arr[i]);
		}
		
		Node head = list;
		while(list != null){
			System.out.print(list.data + " ");
			list = list.next;
		}
		
		System.out.println();
		
		RemoveDups rm = new RemoveDups();
		
		Node head2 = head;
		rm.removeDups(head2);
		
		int i = 0;
		int[] outputArr = new int[8];
		while(head.next != null){
			System.out.print(head.data + " ");
			head = head.next;
			outputArr[i++] = head.data;
			
		}
		
		System.out.println();
		Assert.assertEquals(8, outputArr.length);
	}

}