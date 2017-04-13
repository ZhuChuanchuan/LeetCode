package com.tom.d083RemoveDuplicates;

import com.tom.common.ListNode;

public class SuperiorSolution {
	public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
}

}
