package chapter2;

import java.util.Stack;

public class SumOfLists {

// the following uses stacks to solve it but it's not very efficient
// 
// N + N + N + N = 4N with 2N extra space but i'm sure this can pretty much be solved at N speed without extra space
//
//	public int sumOfLists(ListNode l1, ListNode l2){
//		
//		Stack<Integer> s1 = new Stack<Integer>(); 
//		while(l1 != null){
//			s1.push(l1.data);
//			l1 = l1.next;
//		}
//		
//		Stack<Integer> s2 = new Stack<Integer>(); 
//		while(l2 != null){
//			s2.push(l2.data);
//			l2 = l2.next;
//		}
//		
//		int decimal1 = s1.size();
//		int firstVal = 0;
//		for(int i = decimal1; i > 0; i++){
//			firstVal = s1.pop() * (int)Math.pow(10, i) + firstVal;
//		}
//		
//		int decimal2 = s2.size();
//		int secondVal = 0;
//		for(int i = decimal2; i > 0; i++){
//			secondVal = s2.pop() * (int)Math.pow(10, i) + secondVal;
//		}
//		
//		
//		return firstVal + secondVal;
//	}
	
	public ListNode sumOfLists(ListNode l1, ListNode l2){
	

		ListNode ResultListNode = new ListNode(-1); // temp value to satisfy constructor
		ListNode runner = ResultListNode;
		int remainder = 0;
		
		while(l2 != null || l1 != null){
			
			if(l2 != null && l1 != null){
				runner.appendToTail((l2.data + l1.data + remainder)%10);			
				
				if(l2.data + l1.data + remainder == 10){
					remainder = 1;
				} else {
					remainder = (l2.data + l1.data + remainder)/10;
				}
				l2 = l2.next;
				l1 = l1.next;
				
			} else if(l2 != null){
				runner.appendToTail((l2.data + remainder)%10);
				
				if(l2.data + remainder == 10){
					remainder = 1;
				} else {
					remainder = (l2.data + remainder)/10;
				}
				
				l2 = l2.next;
				
			} else if(l1 != null){
				runner.appendToTail((l1.data + remainder)%10);
				
				if(l2.data + remainder == 10){
					remainder = 1;
				} else {
					remainder = (l2.data + remainder)/10;
				}
				l1 = l1.next;
			}
		}
		
		if(remainder != 0){
			runner.appendToTail(remainder);
		} 

		return ResultListNode.next;
	}
}
