package com.tom.test;

public class SelfSolution {

	public static int[] twoSum(int[] nums, int target) {
        int []a=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length&&j!=i;j++){
                if(nums[i]+nums[j]==target){
                        a[0]=j;
                        a[1]=i; 
                }
            }
        }
        return a;
    }
}
