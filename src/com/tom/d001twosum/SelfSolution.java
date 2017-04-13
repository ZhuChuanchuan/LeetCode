package com.tom.d001twosum;

public class SelfSolution {
	/*
	  * 思路分析：通过双重循环遍历数组中所有元素的两两组合，当出现符合的和时返回两个元素的下标
	  */
	public static int[] twoSum(int[] nums, int target) {
		int []a=new int[2];
		if(nums.length<2){
        	return a;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                        a[0]=i+1;
                        a[1]=j+1; 
                        return a;
                }
            }
        }
        return a;
    }
}
