package com.tom.d024swapNodes;

import com.tom.common.ListNode;

public class SelfSolution {
/*
 * question:Swap Nodes in Pairs
 * author:tom
 * time:2016-12-1 14:22:59
 */
public static ListNode swapPairs(ListNode head) {
        //思路：遍历一遍 记录 节点数，尾节点连接头节点
	//解决：每跳过2个输出
//		ListNode header=new ListNode(0);
//		ListNode resHead=new ListNode(0);
//		header.next=head;
//		int i=0;
//		while(header.next!=null){
//			
//			i++;
//			header=header.next;
//			System.out.println(header.val);
//		}
//		header.next=head; //首尾节点相连
//		int n=2; //跳过几个节点
//		int j=1;
//		ListNode tempNode=head;
//		ListNode resNode=resHead;
//		ListNode preNode=null;
//		while(i!=0){
//			if(j%n==0){
//				resNode.next=tempNode;
//				resNode=tempNode;
//				preNode.next=tempNode.next; //移除记录过的节点
//				System.out.print(resNode.val);
//				i--;
//			}
//			preNode=tempNode;
//			tempNode=tempNode.next;
//			j++;
//		}
//		resNode.next=null;
//		return resHead.next;
	
	ListNode cursor=new ListNode(0);
	ListNode header=cursor;
	cursor.next=head;
	ListNode tempNode=null;
	tempNode=cursor;
	if(cursor.next==null||cursor.next.next==null){
		return head;
	}
	while(cursor.next!=null&&cursor.next.next!=null){
		ListNode n1=null;
		ListNode n2=null;
		n1=tempNode.next;
		n2=tempNode.next.next;
		
		tempNode.next=n2;
		n1.next=n2.next;
		n2.next=n1;
		
		System.out.print(tempNode.next.val+" "+tempNode.next.next.val);
		cursor=cursor.next.next;
		tempNode=cursor;
	}
	return header.next;
	
    }
}
