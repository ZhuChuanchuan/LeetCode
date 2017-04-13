package com.tom.d021mergeList;

import com.tom.common.ListNode;

public class SelfSolution {
	/*
	 * question:Merge Two Sorted Lists
	 * author:tom
	 * time:2016-12-1 11:22:20
	 */
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	     if(l1==null||l2==null)
	    	 return l1==null?l2:l1;
	        ListNode head=new ListNode(0);
	        ListNode rear=null;
	        
	        rear=head;
	        while(l1!=null&&l2!=null){
	        	if(l1.val<l2.val){
	        		rear.next=l1;
	        		rear=l1;
	        		l1=l1.next;
	        	}else{
	        		rear.next=l2;
	        		rear=l2;
	        		l2=l2.next;
	        	}
	        }
	        if(l1==null){
	        	rear.next=l2;
	        }
	        if(l2==null){
	        	rear.next=l1;
	        }
	        return head.next;
	       
	    }
}
