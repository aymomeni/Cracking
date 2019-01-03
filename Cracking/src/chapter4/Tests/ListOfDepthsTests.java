package chapter4.Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

import chapter4.BiTreeNode;
import chapter4.ListOfDepths;

public class ListOfDepthsTests {

	@Test
	public void test() {
		
		int[] check = {8, 4, 10, 1, 5, 9, 12};
		BiTreeNode rootNode = new BiTreeNode(8);
		
		rootNode.leftChild = new BiTreeNode(4);
		rootNode.rightChild = new BiTreeNode(10);
		
		rootNode.leftChild.leftChild = new BiTreeNode(1);
		rootNode.leftChild.rightChild = new BiTreeNode(5);
		
		rootNode.rightChild.leftChild = new BiTreeNode(9);
		rootNode.rightChild.rightChild = new BiTreeNode(12);
		
		
		ListOfDepths lD = new ListOfDepths();
		ArrayList<LinkedList<BiTreeNode>> returnList = lD.getListOfDepths(rootNode);
		
		for(LinkedList<BiTreeNode> list : returnList){			
			for(BiTreeNode node : list){
				System.out.print(node.val + " ");
			}
			System.out.println();
		}
		
		int i = 0;
		for(LinkedList<BiTreeNode> list : returnList){
			
			for(BiTreeNode node : list){
				assertEquals(check[i++], node.val);
			}
		}
	}

}
