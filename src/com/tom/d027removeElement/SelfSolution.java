package com.tom.d027removeElement;

public class SelfSolution {
/*
 * 分析：利用原数组对不是指定的值得进行存储
 */
	public static int removeElement(int[] nums, int val) {
		if(nums.length==0)
            return 0;
		int size=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]!=val){
        		nums[size++]=nums[i];
        	}
        }
        return size++;
    }
}
