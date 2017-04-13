package com.tom.d083RemoveDuplicates;

import com.tom.common.ListNode;

public class SelfSolution {
public ListNode deleteDuplicates(ListNode head) {
	if(head==null){
        return null;
    }
    ListNode cursor=head;
    while(cursor.next!=null){
    	if(cursor.val!=cursor.next.val){
    		cursor=cursor.next;
    	}else{
    		cursor.next=cursor.next.next;
    	}
    }
    return head;
    }
}
