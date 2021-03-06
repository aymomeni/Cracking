package chapter3;

import java.util.Arrays;

public class ThreeInOne {

	private int[] internalStack;
	private int n = 100; // the initial size of the array
	private int stackZeroNextEmptyIndex = 0; //0
	private int stackOneNextEmptyIndex = n/3; //33
	private int stackTwoNextEmptyIndex = (2*n)/3; //66
	//[ - ] inclusive
	//( - ) exclusive
	//Stack 1: [0-n/3)
	//Stack 2: [n/3-2n/3)
	//Stack 3: [2n/3-n]
	public ThreeInOne(){
		internalStack = new int[n];
		Arrays.fill(internalStack, Integer.MIN_VALUE); // more for testing purposes
	}
	
	public int getSizeOfInternalArray(){
		return n;
	}
	
	/*adds elements to the specified stack (0 based - stack 0, stack 1, stack 2*/
	public void push(int val, int stack) {
		
		if(stack >= 3){
			System.out.println("incorrect stack specifier: Stack 1 - 0, Stack 2 - 1, Stack 3 - 2");
		} 

		if(stack == 0){
			
			if(stackZeroNextEmptyIndex >= n/3){
				this.doubleInternalStack();
			} 
			internalStack[stackZeroNextEmptyIndex++] = val;
			
		} else if(stack == 1){
			
			if(stackOneNextEmptyIndex >= (2*n)/3){
				this.doubleInternalStack();
			} 
			internalStack[stackOneNextEmptyIndex++] = val;
			
		} else{
			
			if(stackTwoNextEmptyIndex >= n){
				this.doubleInternalStack();
			} 
			internalStack[stackTwoNextEmptyIndex++] = val;	
		}
	}
	
	/* doubles the size of all the stacks */
	private void doubleInternalStack() {
		int newN = n*2;
		int[] tempInternalStack = new int[newN];
		Arrays.fill(tempInternalStack, Integer.MIN_VALUE); // more for testing purposes
		
		for(int i = 0; i < n/3; i++){
			tempInternalStack[i] = internalStack[i];
		}
		
		for(int i = newN/3, j = n/3; j < (2*n)/3; i++,j++){
			tempInternalStack[i] = internalStack[j];
		}
		
		for(int i = (2*newN)/3, j = (2*n)/3; j < n; i++, j++){
			tempInternalStack[i] = internalStack[j];
		}
		
		internalStack = tempInternalStack;
		n = newN;
		
		setNewStackIndecies();

		
		return;
	}
	
	private void setNewStackIndecies(){
		boolean firstFound = false;
		boolean secondFound = false;
		boolean thirdFound = false;
		
		for(int i0 = 0, i1 = n/3, i2 = 2*n/3; i0 < n/3 && i1 < (2*n)/3 && i2 < n; i0++, i1++, i2++){
			
			if(internalStack[i0] == Integer.MIN_VALUE && !firstFound){
				stackZeroNextEmptyIndex = i0;
				firstFound = true;
			}
			
			if(internalStack[i1] == Integer.MIN_VALUE && !secondFound){
				stackOneNextEmptyIndex = i1;
				secondFound = true;
			}
			
			if(internalStack[i2] == Integer.MIN_VALUE && !thirdFound){
				stackTwoNextEmptyIndex = i2;
				thirdFound = true;
			}
			
		}
	}

	/* removes and returns the value at top of the specified stack */
	public int pop(int stack){
		
		if(stack >= 3){
			System.out.println("incorrect stack specifier: Stack 1 - 0, Stack 2 - 1, Stack 3 - 2");
		} 
		int returnVal = 0;
		
		if(stack == 0 && !this.isEmpty(stack)){
			
			returnVal = internalStack[--stackZeroNextEmptyIndex];
			internalStack[stackZeroNextEmptyIndex] = Integer.MIN_VALUE;
			return  returnVal;
			
		} else if(stack == 1 && !this.isEmpty(stack)){
		
			returnVal = internalStack[--stackOneNextEmptyIndex];
			internalStack[stackOneNextEmptyIndex] = Integer.MIN_VALUE;
			return  returnVal;
			
		} else if(stack == 2 && !this.isEmpty(stack)){

			returnVal = internalStack[--stackTwoNextEmptyIndex];
			internalStack[stackTwoNextEmptyIndex] = Integer.MIN_VALUE;
			return  returnVal;
		}
		
		return -1;
	}
	
	/* returns the value at the top of the specified stack */
	public int peek(int stack){
		
		if(stack >= 3){
			System.out.println("incorrect stack specifier: Stack 1 - 0, Stack 2 - 1, Stack 3 - 2");
		} 

		if(stack == 0){
			
			return internalStack[stackZeroNextEmptyIndex-1];
			
		} else if(stack == 1){
		
			return internalStack[stackOneNextEmptyIndex-1];
			
		} else {

			return internalStack[stackTwoNextEmptyIndex-1];	
		}
	}
	
	/* Checks if the a given stack is empty */
	public boolean isEmpty(int stack){
		
		if(stack >= 3){
			System.out.println("incorrect stack specifier: Stack 1 - 0, Stack 2 - 1, Stack 3 - 2");
		} 

		if(stack == 0 && stackZeroNextEmptyIndex == 0){
			return true;
			
		} 

		if(stack == 1 && stackOneNextEmptyIndex == n/3){
		
			return true;
			
		} 

		if(stack == 2 && stackTwoNextEmptyIndex == (2*n)/3){

			return true;	
		}
		
		return false;
	}	
	
	@Override
	public String toString(){	
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < n; i++){
			if(internalStack[i] != Integer.MIN_VALUE){
				sb.append(internalStack[i] + " ");
			} else{
				sb.append("E" + " ");
			}
		}
		return sb.toString();
	}
	
}
