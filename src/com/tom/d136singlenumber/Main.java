package com.tom.d136singlenumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * question:leetcode -136 Single Number
		 * author:tom
		 * time:2016-12-13 10:26:32
		 * 题目大意：给定一个整形数组，其他有一种元素只出现一次，其他都成对出现
		 * 要求：线性复杂度，不开辟额外存储空间
		 */
		int[] nums=new int[]{1};
		System.out.println(SelfSolution.singleNumber(nums));
		
	}

}
