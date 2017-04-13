package com.tom.d136singlenumber;

public class SuperiorSolution {
	public static int singleNumber(int[] nums) {
		if(nums.length==0)
			return nums[0];
		int x=nums[0];
		for(int i=1;i<nums.length;i++){
			x=x^nums[i]; //Òì»òÔËËã
		}
		return x;
	}
}
