package com.tom.d189rotateArray;

public class Main {

	public static void main(String[] args) {
		/*
		 * question:leetcode -189 Rotate Array
		 * author:tom
		 * time:2016-12-29 09:54:07
		 * 题目大意：给定一个n个长度的数组，将它向右旋转k个位置
		 */
		int[] nums={1,2,3,4,5,6,7};
		com.tom.d189rotateArray.SelfSolution.rotate(nums, 3);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
		
	}

}
