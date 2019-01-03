package chapter4;

public class MinimalTree {

	// kind like the opposite of binary search
	public BiTreeNode createBalancedBiTree(int[] sortedVals)
	{
		return createBalancedBiTreeHelper(sortedVals, 0, sortedVals.length-1);
	}
	
	private BiTreeNode createBalancedBiTreeHelper(int[] arr, int startIndex, int endIndex){
		
		if(endIndex < startIndex){
			return null;
		}
		
		int mid = (startIndex + endIndex)/2;
		
		BiTreeNode bN = new BiTreeNode(arr[mid]);
		bN.leftChild = createBalancedBiTreeHelper(arr, startIndex, mid-1);
		bN.rightChild = createBalancedBiTreeHelper(arr, mid+1, endIndex);
		
		return bN;
	}

}
