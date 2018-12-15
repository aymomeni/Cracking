package chapter2;

import java.util.HashSet;


public class LoopDetection {

	public int loopDetect(ListNode ls, HashSet<Integer> hs){
		
		if(hs.contains(ls.data)){
			return ls.data;
		} 
		
		hs.add(ls.data);
		return loopDetect(ls.next, hs);
	}
}
