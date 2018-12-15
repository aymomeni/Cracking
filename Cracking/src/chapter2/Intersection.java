package chapter2;

public class Intersection {

	public boolean isIntersecting(ListNode l1, ListNode l2){
		if(l1 == null || l2 == null){
			return false;
		} 
		
		if(l1 == l2){
			return true;
		}
		
		l1 = l1.next;
		l2 = l2.next;
		
		return isIntersecting(l1, l2);
	}
}
