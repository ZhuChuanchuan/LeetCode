package com.tom.d203RemoveElement;

import com.tom.common.ListNode;

/*
 * @ question: leetcode -203 Remove Linked List Elements
 * @ author:tom
 * @ time:2017-2-13 10:46:33
 */
public class SelfSolution {
	 public ListNode removeElements(ListNode head, int val) {
	        ListNode header=new ListNode(0);	       
	        header.next=head;
	        ListNode p=header;
	        ListNode q=head;
	        while(q!=null){
	        	if(q.val==val){
	        		//É¾³ý
	        		p.next=q.next;	        		
	        	}else{
	        		p=p.next;
	        	}
	        	q=q.next;	        	
	        }
	        return header.next;
	    }
}
