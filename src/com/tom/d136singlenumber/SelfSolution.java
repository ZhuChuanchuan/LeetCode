package com.tom.d136singlenumber;

import java.util.Arrays;

public class SelfSolution {
/*
 * question:leetcode -136 Single Number
 * author:tom
 * time:2016-12-13 10:26:32
 */
	 public static int singleNumber(int[] nums) {

		 Arrays.sort(nums);
		 for(int i=0;i<nums.length-1;i+=2){
			 if(nums[i+1]-nums[i]!=0){
				 return nums[i];
			 }
		 }
		 return nums[nums.length-1];
	 }
}
