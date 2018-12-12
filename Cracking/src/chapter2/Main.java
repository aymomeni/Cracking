package chapter2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list = new ListNode(1);
		
		for(int i = 2; i < 10; i++){
			list.appendToTail(i);
		}
		
		while(list.next != null){
			System.out.println(list.data);
			list = list.next;
		}
	}

}
