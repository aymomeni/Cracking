package chapter2;

/* Simple singly linked list */
public class ListNode {
	public ListNode next = null;
	public int data;
	
	public ListNode(int d){
		this.data = d;
	}
	
	public void appendToTail(int d){
		
		ListNode end = new ListNode(d);
		ListNode n = this;
		
		while(n.next != null){
			n = n.next;
		}
		
		n.next = end;
	}
}
