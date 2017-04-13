package com.tom.d024swapNodes;

import com.tom.common.ListNode;

public class SuperiorSolution {
	public static ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }
}
