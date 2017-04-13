package com.tom.d160Intersection;

import com.tom.common.ListNode;

public class SelfSolution {
/*
 * question��Leetcode -160 Intersection of Two Linked Lists
 * author��tom
 * time��2016-12-21 09:57:08
 */
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la=0,lb=0;
        ListNode p=headA,q=headB;
        while(p!=null){
        	la++;
        	p=p.next;
        }
        while(q!=null){
        	lb++;
        	q=q.next;
        }
        ListNode nodeA=headA,nodeB=headB;
        if(la>lb){
        	int dif=la-lb;
        	while(dif>0){
        		nodeA=nodeA.next;
        		dif--;
        	}
        }else{
        	int dif=lb-la;
        	while(dif>0){
        		nodeB=nodeB.next;
        		dif--;
        	}
        }
        while(nodeA!=null&&nodeB!=null){
        	if(nodeA.val==nodeB.val)
        		return nodeA;
        }
        return null;
    }
}
