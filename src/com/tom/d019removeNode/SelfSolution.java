package com.tom.d019removeNode;

import com.tom.common.ListNode;

public class SelfSolution {

	/*
	 * question:Remove Nth Node From End of List
	 * author:tom
	 * time:2016-12-1 09:09:14
	 */
	public static ListNode removeNthFromEnd(ListNode head, int n) {
//		//����˼·����������ڵ㣬���n����λ��
//		ListNode curNode;
//		ListNode nextNode;
//		curNode = head;
//		int cout=0;
//		while(curNode!=null){//����һ�飬���ж��ٸ��ڵ�
//			cout++;
//			curNode=curNode.next;
//		}
//		int i = 0;
//		curNode=head;
//		while (curNode != null && i < cout - n-1) { //�ҵ�Ҫɾ����ǰһ���ڵ�
//			curNode = curNode.next;
//			i++;
//		}
//		nextNode = curNode.next.next;
//		curNode.next = nextNode;
//		return head;
		
		//����˼·����һ��ͷ���dummy����ʹ��˫ָ��p1��p2��p1����ǰ�ƶ�n���ڵ㣬Ȼ��p1��p2ͬʱ�ƶ�����p1.next==Noneʱ����ʱp2.nextָ�ľ�����Ҫɾ���Ľڵ�
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
		//frontNode.next����Ҫɾ���Ľڵ�
		frontNode.next=frontNode.next.next;
		
		return header.next;
		
	}
	
}
