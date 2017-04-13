package com.tom.d019removeNode;

import com.tom.common.ListNode;

public class SelfSolution {

	/*
	 * question:Remove Nth Node From End of List
	 * author:tom
	 * time:2016-12-1 09:09:14
	 */
	public static ListNode removeNthFromEnd(ListNode head, int n) {
//		//解题思路：遍历多个节点，算出n所在位置
//		ListNode curNode;
//		ListNode nextNode;
//		curNode = head;
//		int cout=0;
//		while(curNode!=null){//遍历一遍，共有多少个节点
//			cout++;
//			curNode=curNode.next;
//		}
//		int i = 0;
//		curNode=head;
//		while (curNode != null && i < cout - n-1) { //找到要删除的前一个节点
//			curNode = curNode.next;
//			i++;
//		}
//		nextNode = curNode.next.next;
//		curNode.next = nextNode;
//		return head;
		
		//解题思路：加一个头结点dummy，并使用双指针p1和p2。p1先向前移动n个节点，然后p1和p2同时移动，当p1.next==None时，此时p2.next指的就是需要删除的节点
		ListNode header = new ListNode(0);
		header.next=head;
		ListNode frontNode=header;
		ListNode backNode=header;
		int i=0;
		while(backNode.next!=null){
			if(i<n){
				backNode=backNode.next;
				i++;
			}else{
				backNode=backNode.next;
				frontNode=frontNode.next;
			}
		}
		//frontNode.next即是要删除的节点
		frontNode.next=frontNode.next.next;
		
		return header.next;
		
	}
	
}
