package com.tom.d026removeDuplicates;

public class SelfSolution {
/*
 * question:Remove Duplicates from Sorted Array
 * author:tom
 * time:2016-12-2 09:32:33
 */
public int removeDuplicates(int[] nums) {
		if(nums.length==0)
			return 0;
		
		int index=0;
		nums[index]=nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[index]!=nums[i]){
				nums[++index]=nums[i];
			}
		}
		return index+1;
    }
}
