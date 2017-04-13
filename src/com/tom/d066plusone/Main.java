package com.tom.d066plusone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * question:leetcode -66 Plus One
		 * author:tom
		 * time:2016-12-6 09:23:23
		 * 题目大意：给定一个由数组表示的数字，加上一，返回由数组表示的结果
		 */
		int[] arr=new int[]{9,9};
		int[] t=SuperiorSolution.plusOne(arr);
		for(int i=0;i<t.length;i++)
			System.out.println(t[i]);
		
	}

}
