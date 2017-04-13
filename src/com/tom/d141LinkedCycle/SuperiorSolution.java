package com.tom.d141LinkedCycle;

import com.tom.common.ListNode;

public class SuperiorSolution {
	 public boolean hasCycle(ListNode head){
	       if(head == null || head.next == null) return false;
	       if(head.next == head) return true;
	       ListNode nextNode = head.next;
	       head.next = head;
	       boolean isCycle = hasCycle(nextNode);
	       return isCycle;
	   }
}
