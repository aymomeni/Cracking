package chapter3;

import java.util.LinkedList;
import java.util.Stack;

public class StackOfPlates {

	private final int maxPlates = 10; // how many plates can be on a stack
	
	LinkedList<Stack<Integer>> listOfStacks = null;
	
	public StackOfPlates(){
		listOfStacks = new LinkedList<Stack<Integer>>();
		listOfStacks.add(new Stack<Integer>());
	}
	
	public void push(int val){

		Stack<Integer> currentStack = listOfStacks.getLast();

		if(currentStack.size() <= maxPlates){
			currentStack.push(val);
		} else{
			currentStack = new Stack<Integer>();
			currentStack.add(val);
			listOfStacks.addLast(currentStack);
		}
	}
	
	public int pop(){
		
		Stack<Integer> currentStack = listOfStacks.getLast();
		
		if(currentStack.isEmpty() && listOfStacks.size() == 1){
			return -1;
		}
		
		int returnVal = currentStack.pop();
		
		if(currentStack.isEmpty()){
			listOfStacks.removeLast();
		}
		
		return returnVal;
	}
	
	public int peek(){
		Stack<Integer> currentStack = listOfStacks.getLast();
		return currentStack.peek();
	}
	
	public int numberOfPlateStacks(){
		return this.listOfStacks.size();
	}
}
