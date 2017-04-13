package com.tom.d141LinkedCycle;

import com.tom.common.ListNode;

public class SelfSolution {
/*
 * question:leetcode -141 Linked List Cycle
 * author:tom
 * time:2016-12-14 09:34:43
 */
public boolean hasCycle(ListNode head) {
	if(head==null || head.next==null) return false;
    ListNode fast=head,slow=head;
    while(fast!=null&& fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow) return true;
    }
    return false;
    }
}
