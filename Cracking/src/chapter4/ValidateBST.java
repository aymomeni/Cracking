package chapter4;

import java.util.LinkedList;

public class ValidateBST {
	
	LinkedList<Integer> values = new LinkedList<Integer>();
	boolean validate = true;
	
	public boolean validateBst(BiTreeNode root){
		
		if(root != null){	
			validateBst(root.leftChild);
			//System.out.println(root.val + "LinkedListSize: " + values.size());
			if(!checkLastValue(root)){
				//System.out.println("Got here too");
				validate = false;
			}
			validateBst(root.rightChild);
		}
		
		return validate;
	}
	
	private boolean checkLastValue(BiTreeNode node){
		
		if(!values.isEmpty()){			
			int lastVal= values.getLast();
			//System.out.println(" LastValue: " + lastVal + " CurrentVal: " + node.val);
			if(lastVal < node.val){
				values.addLast(node.val);
				return true;
			} else{
				//System.out.println("Got Here");
				return false;
			}
		}
		
		values.addLast(node.val); // just for the first run
		return true;
		
	}
	
	
}
