package chapter4;

public class MinimalTree {

	// kind like the opposite of binary search
	public SimpleBiTree createBalancedBiTree(int[] sortedVals)
	{
		SimpleBiTree sB;
		
		if(sortedVals.length == 0){
			return null;
		} else if(sortedVals.length == 1){
			sB = new SimpleBiTree();
			sB.root.val = sortedVals[0];
			return sB;
		}
		
		// grab the middle element
		sB = new SimpleBiTree();
		sB.root.val = sortedVals[sortedVals.length/2];
		
		grabSmaller(sB.root, sB, sortedVals, sortedVals.length/4);
		grabLarger(sB.root, sB, sortedVals, (int)(sortedVals.length*3)/4);
		return null;
	}
	
	private void grabSmaller(BiTreeNode node, SimpleBiTree sB, int[] sortedVals, int smallerMiddleIndex){
		
		if(smallerMiddleIndex == 0){
			node.leftChild = new BiTreeNode();
			node.leftChild.val = sortedVals[0];
			return;
		}
		
		node.leftChild = new BiTreeNode();
		node.leftChild.val = sortedVals[smallerMiddleIndex];
		grabSmaller(node, sB, sortedVals, smallerMiddleIndex/2);
		grabLarger(node, sB, sortedVals, smallerMiddleIndex+((smallerMiddleIndex*3)/4));
		
	}
	
	private void grabLarger(BiTreeNode node, SimpleBiTree sB, int[] sortedVals, int largerMiddleIndex){
		
		if(largerMiddleIndex == sortedVals.length-1){
			node.rightChild = new BiTreeNode();
			node.rightChild.val = sortedVals[sortedVals.length-1];
			return;
		}
		
		
	}



}
