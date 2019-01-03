package chapter4;

import java.util.LinkedList;

public class ListOfDepths {

	// BFS approach
	public LinkedList<LinkedList<BiTreeNode>> getListOfDepths(BiTreeNode root){
		
		// check if root is null
		if(root == null){
			return null;
		}
		
		LinkedList<LinkedList<BiTreeNode>> returnList = new LinkedList<LinkedList<BiTreeNode>>();
		LinkedList<BiTreeNode> queue = new LinkedList<BiTreeNode>();
		root.marked = true;
		
		// if root doesn't have descendents
		if(root.leftChild == null && root.rightChild == null){
			LinkedList<BiTreeNode> tempList = new LinkedList<BiTreeNode>();
			tempList.add(root);
			returnList.addLast(tempList);		
			return returnList;			
		}
		
		queue.add(root);
		LinkedList<BiTreeNode> rootList = new LinkedList<BiTreeNode>();
		rootList.addLast(root);	
		returnList.addLast(rootList);
		
		while(!queue.isEmpty()){
			
			BiTreeNode node = queue.removeLast();
			
			LinkedList<BiTreeNode> levelList = new LinkedList<BiTreeNode>();
			
			if(node.leftChild != null){
				levelList.addLast(node.leftChild);
				queue.addLast(node.leftChild);
			}
			
			if(node.rightChild != null){
				levelList.addLast(node.rightChild);
				queue.addLast(node.rightChild);
			} 
			
			if(!levelList.isEmpty()){
				returnList.addLast(levelList);
			} else{
				return returnList;
			}	
		}		
		
		return null;
	}
}
