package chapter3;

import java.util.Stack;

/* Implementing a queue with two stacks */
public class QueueViaStacks {
	
	private Stack<Integer> s1 = null;
	private Stack<Integer> s2 = null;
	
	public QueueViaStacks(){
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}
	
	// enqueue
	public void enqueue(int value){
		
		if(!s1.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			s2.push(value);
			
			while(!s2.isEmpty()){
				s1.push(s2.pop());
			}
		} else {
			s1.push(value);
		}
	}
	
	// dequeue
	public int dequeue(){		
		if(!s1.isEmpty()){
			return s1.pop();
		}
		return -1;
	}
	
	// empty?
	public boolean isEmpty(){
		return s1.isEmpty();
	}
	
	// size
	public int size(){
		return s1.size();
	}
	
}
