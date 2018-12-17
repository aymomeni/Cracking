package chapter3;

import java.util.Stack;

/* An ordenary stack with min() that returns the min value currently in the stack*/
// approach: using a tuple that wraps the current min with each value in the stack
public class StackMin {
	
	Stack<Tuple> s = null;
	int currentMin = Integer.MAX_VALUE;
	
	public StackMin(){
		s = new Stack<Tuple>();
	}
	
	public void push(int val){
		
		if(val < currentMin){
			s.push(new Tuple(val, val));
			currentMin = val;
		} else{
			s.push(new Tuple(val, currentMin));
		}	
	}
	
	public int pop(){
		Tuple returnVal = s.pop();
		currentMin = s.peek().getMin();
		return returnVal.getVal();
	}
	
	public int peek(){
		return s.peek().getVal();
	}
	
	public int min(){
		return s.peek().getMin();
	}
	
	private class Tuple{
		
		private int val;
		private int min;
		public Tuple(int val, int min){
			this.val = val;
			this.min = min;
		}
		
		public int getVal(){
			return this.val;
		}
		
		public int getMin(){
			return this.min;
		}
	}
	
}
