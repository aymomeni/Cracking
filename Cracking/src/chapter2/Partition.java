package chapter2;

/*tested by leetcode */
public class Partition {

	
	public ListNode partition(ListNode head, int x) {
   
		ListNode itrSmaller = head;
        ListNode itrLarger = head;
		ListNode retList = new ListNode(Integer.MIN_VALUE); // temp value that will be deleted later
        ListNode retHead = retList;
				
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
