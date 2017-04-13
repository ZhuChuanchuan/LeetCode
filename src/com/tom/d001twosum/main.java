package com.tom.d001twosum;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  * question:leetcode -01 twosum
		  * author:tom
		  * time:2016-11-21 10:20:26
		  * 题目大意：找出数组中两个数字和为指定和
		  * input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
		  */
		int[] numbers=new int[]{1,3,5,7,4};
		int target=6;
		int[] result=SuperiorSolution.twoSum(numbers, target);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}

}
