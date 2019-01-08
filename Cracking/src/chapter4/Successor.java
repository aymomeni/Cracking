package chapter4;

/* find the successor of a node in a BST */
public class Successor {

	public BiTreeNode findSuccessor(BiTreeNode toBeDeleted){
		
		// no children
		// leftChild only
		// left and right Child
		// rightChild only
		BiTreeNode returnNode; 
		
		if(toBeDeleted.rightChild == null && toBeDeleted.leftChild == null){
			return null; // no successor just delete
		}
		
		if(toBeDeleted.rightChild == null){
			return toBeDeleted.leftChild;
		} else{
			// first right leftmost should be successor
			returnNode = toBeDeleted.rightChild;
			while(returnNode.leftChild != null){
				returnNode = returnNode.leftChild;
			}
		}

		return returnNode;
	}
}
