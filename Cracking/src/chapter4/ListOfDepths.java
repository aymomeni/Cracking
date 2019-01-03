package chapter4;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepths {

	// BFS approach
	public ArrayList<LinkedList<BiTreeNode>> getListOfDepths(BiTreeNode root){
		
		// check if root is null
		if(root == null){
			return null;
		}
		
		ArrayList<LinkedList<BiTreeNode>> result = new ArrayList<LinkedList<BiTreeNode>>();
		LinkedList<BiTreeNode> current = new LinkedList<BiTreeNode>();
		
		current.add(root);

		while(!current.isEmpty()){
			
			result.add(current);
			LinkedList<BiTreeNode> parents = current;
			current = new LinkedList<BiTreeNode>();
			
			for(BiTreeNode parent: parents){
				
				if(parent.leftChild != null){
					current.addLast(parent.leftChild);
				}
					
				if(parent.rightChild != null){
					current.addLast(parent.rightChild);
				} 
			}

		}		
		
		return result;
	}
}
