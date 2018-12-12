package chapter2;

public class KthToLast {

	public ListNode kThToLast(ListNode head, int k) {
		
		ListNode current = head;
		ListNode kthNode = null;
		int count = 0; // one or zero based?
		
		while(current != null) {
			current = current.next;
			
			
			if(count != k) {
				count++;
			} else {
				
				if(kthNode == null) {
					kthNode = head;
				}
				
				kthNode = kthNode.next;
			}
		}

		return count == k ? kthNode : null;
	}
}
