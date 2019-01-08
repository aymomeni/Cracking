package chapter4.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter4.BiTreeNode;
import chapter4.ValidateBST;

public class ValidateBSTTests {

	@Test
	public void test() {
		
		ValidateBST v = new ValidateBST();
		
		BiTreeNode n = new BiTreeNode(15);
		
		n.leftChild = new BiTreeNode(7);
		n.leftChild.leftChild = new BiTreeNode(2);
		n.leftChild.rightChild = new BiTreeNode(9);
		
		n.rightChild = new BiTreeNode(17);
		n.rightChild.leftChild = new BiTreeNode(16);
		n.rightChild.rightChild = new BiTreeNode(19);
	
		boolean result = v.validateBst(n);
		
		assertTrue(result);
	}
	
	@Test
	public void test2() {
		
		ValidateBST v = new ValidateBST();
		
		BiTreeNode n = new BiTreeNode(15);
		
		n.leftChild = new BiTreeNode(7);
		n.leftChild.leftChild = new BiTreeNode(2);
		n.leftChild.rightChild = new BiTreeNode(9);
		
		n.rightChild = new BiTreeNode(17);
		n.rightChild.leftChild = new BiTreeNode(16);
		n.rightChild.rightChild = new BiTreeNode(14);
	
		boolean result = v.validateBst(n);
		
		assertFalse(result);
	}
	
	@Test
	public void test3() {
		
		ValidateBST v = new ValidateBST();
		
		BiTreeNode n = new BiTreeNode(15);
		
		n.leftChild = new BiTreeNode(7);
		n.leftChild.leftChild = new BiTreeNode(2);
		n.leftChild.rightChild = new BiTreeNode(9);
		
		n.rightChild = new BiTreeNode(12);
		n.rightChild.leftChild = new BiTreeNode(16);
		n.rightChild.rightChild = new BiTreeNode(19);
	
		boolean result = v.validateBst(n);
		
		assertFalse(result);
	}
	
	@Test
	public void test4() {
		
		ValidateBST v = new ValidateBST();
		
		BiTreeNode n = new BiTreeNode(5);
		
		n.leftChild = new BiTreeNode(3);
		n.leftChild.leftChild = new BiTreeNode(2);
		n.leftChild.rightChild = new BiTreeNode(4);
		
		n.rightChild = new BiTreeNode(8);
		n.rightChild.leftChild = new BiTreeNode(9);
		n.rightChild.rightChild = new BiTreeNode(10);
	
		boolean result = v.validateBst(n);
		
		assertFalse(result);
	}

}
