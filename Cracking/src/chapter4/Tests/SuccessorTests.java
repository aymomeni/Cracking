package chapter4.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter4.BiTreeNode;
import chapter4.Successor;
import chapter4.ValidateBST;

public class SuccessorTests {

	@Test
	public void test() {
		Successor s = new Successor();
		
		BiTreeNode n = new BiTreeNode(15);
		
		n.leftChild = new BiTreeNode(7);
		
		BiTreeNode toBeDeleted = n.leftChild;
				
		n.leftChild.leftChild = new BiTreeNode(2);
		n.leftChild.rightChild = new BiTreeNode(9);
		
		n.rightChild = new BiTreeNode(17);
		n.rightChild.leftChild = new BiTreeNode(16);
		n.rightChild.rightChild = new BiTreeNode(19);
	
		
		BiTreeNode result = s.findSuccessor(toBeDeleted);
		
		assertEquals(9, result.val);
	}
	
	@Test
	public void test2() {
		Successor s = new Successor();
		
		BiTreeNode n = new BiTreeNode(15);
		
		n.leftChild = new BiTreeNode(7);
		
		BiTreeNode toBeDeleted = n.leftChild;
				
		n.leftChild.leftChild = new BiTreeNode(2);
		n.leftChild.rightChild = new BiTreeNode(9);
		n.leftChild.rightChild.leftChild = new BiTreeNode(8);
		
		n.rightChild = new BiTreeNode(17);
		n.rightChild.leftChild = new BiTreeNode(16);
		n.rightChild.rightChild = new BiTreeNode(19);
	
		
		BiTreeNode result = s.findSuccessor(toBeDeleted);
		
		assertEquals(8, result.val);
	}
	
	@Test
	public void test3() {
		Successor s = new Successor();
		
		BiTreeNode n = new BiTreeNode(15);
		
		n.leftChild = new BiTreeNode(6);
		
		BiTreeNode toBeDeleted = n.leftChild;
				
		n.leftChild.leftChild = new BiTreeNode(2);
		n.leftChild.rightChild = new BiTreeNode(9);
		n.leftChild.rightChild.leftChild = new BiTreeNode(8);
		n.leftChild.rightChild.leftChild.leftChild = new BiTreeNode(7);
		
		n.rightChild = new BiTreeNode(17);
		n.rightChild.leftChild = new BiTreeNode(16);
		n.rightChild.rightChild = new BiTreeNode(19);
	
		
		BiTreeNode result = s.findSuccessor(toBeDeleted);
		
		assertEquals(7, result.val);
	}

}
