package chapter2;

/*tested by leetcode */
public class Partition {

	
	public ListNode partition(ListNode head, int x) {
        // only for constructor of retList
		ListNode itrSmaller = head;
        ListNode itrLarger = head;
		ListNode retList = new ListNode(Integer.MIN_VALUE);
        ListNode retHead = retList;
		boolean firstTime = false;
				
		while(itrSmaller != null){
			if(itrSmaller.data < x){
				retList.next = new ListNode(itrSmaller.data);
                retList = retList.next;
			}
			itrSmaller = itrSmaller.next;
		}
				
		while(itrLarger != null){
			if(itrLarger.data >= x){
                retList.next = new ListNode(itrLarger.data);
                retList = retList.next;
			}
			itrLarger = itrLarger.next;
		}		
        
        
				
		return retHead = retHead.next;
    }
}
