package com.tom.d088Merge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * question:Merge Sorted Array
		 * author:tom
		 * time:2016-12-6 15:22:41
		 * 题目大意：排序好的数组A和B，将B合并到A中，并保持有序
		 */
		int[] A=new int[3];//{8,7,3,1};
		A[0]=0;
		A[1]=2;
////		A[2]=7;
////		A[3]=8;
		int[] B=new int[1];
		B[0]=1;
		SuperiorSolution.merge(A, 2, B, 1);
		for(int i=0;i<A.length;i++){
			System.out.println(A[i]);
		}
		
	}

}
