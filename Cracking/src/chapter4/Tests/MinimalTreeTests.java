package chapter4.Tests;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import chapter4.BiTreeNode;
import chapter4.MinimalTree;

public class MinimalTreeTests {

	@Test
	public void test1(){
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		MinimalTree mT = new MinimalTree();
		
		BiTreeNode n = mT.createBalancedBiTree(arr);
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		inOrderTraversal(l, n);
		
		int count = 0;
		for(Integer i : l){
			assertEquals((int)i, arr[count++]);
		}
	}
	
	
	@Test
	public void test2(){
		
		int[] arr = {1, 4, 5, 6, 9};
		
		MinimalTree mT = new MinimalTree();
		
		BiTreeNode n = mT.createBalancedBiTree(arr);
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		inOrderTraversal(l, n);
		
		int count = 0;
		for(Integer i : l){
			assertEquals((int)i, arr[count++]);
		}
	}
	
	
	private void inOrderTraversal(LinkedList<Integer> l, BiTreeNode n){
		
		if(n != null){
			inOrderTraversal(l, n.leftChild);
			l.addLast(n.val);
			inOrderTraversal(l, n.rightChild);
		}			
	}
}
