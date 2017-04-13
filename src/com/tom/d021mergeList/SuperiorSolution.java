package com.tom.d021mergeList;

import com.tom.common.ListNode;

public class SuperiorSolution {
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        if(l1 == null){
	            return l2;
	        }
	        if(l2 == null){
	            return l1;
	        }
	        
	        ListNode mergeHead;
	        if(l1.val < l2.val){
	            mergeHead = l1;
	            mergeHead.next = mergeTwoLists(l1.next, l2);
	        }
	        else{
	            mergeHead = l2;
	            mergeHead.next = mergeTwoLists(l1, l2.next);
	        }
	        return mergeHead;
	    }
}
