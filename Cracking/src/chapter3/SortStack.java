package chapter3;

import java.util.Stack;

public class SortStack {
	
	Stack<Integer> s1 = null;
	Stack<Integer> s2 = null;
	
	public SortStack(){
		s1 = new Stack<Integer>();
	}
	
	// push
	public void push(int val){
		s1.push(val);
	}
	
	// pop
	public int pop(){
		return s1.isEmpty() ? -1 : s1.pop();
	}
	
	// peek
	public int peek(){
		return s1.peek();
	}
	
	// sort
	public void sort(){
		
		s2 = new Stack<Integer>();
		int minVal = Integer.MAX_VALUE;
		int maxVal = Integer.MIN_VALUE;
		int counter = 0;
		
		// find the min
		while(!s1.isEmpty()){
			if(s1.peek() < minVal){
				minVal = s1.peek();
			}
			if(s1.peek() > maxVal){
				maxVal = s1.peek();
			}
			s2.push(s1.pop());
			counter++;
		}
		
		s1.push(minVal);
		
		while(!s2.isEmpty()){
			if(s2.peek() == minVal){
				s2.pop();
				continue;
			} else{
				s1.push(s2.pop());
			}					
		}

		int newMinVal = Integer.MAX_VALUE;
		
		while(--counter > 0){
			
			// find the min
			while(!s1.isEmpty() && s1.peek() != minVal){
				
				if(s1.peek() < newMinVal){
					newMinVal = s1.peek();
				}
				
				s2.push(s1.pop());
			}
			
			s1.push(newMinVal);
			minVal = newMinVal;
			newMinVal = Integer.MAX_VALUE;
			
			while(!s2.isEmpty()){
				if(s2.peek() == minVal){
					s2.pop();
					continue;
				} else{
					s1.push(s2.pop());
				}					
			}
		}			
	}
}
