package com.tom.d189rotateArray;

public class SelfSolution {
/*
 * 分析：数组全部翻转，两个部分分别翻转
 */
	
public static void rotate(int[] nums, int k) {
       for(int i=0,j=nums.length-1;i<j;i++,j--){
    	   int temp=nums[i];
    	   nums[i]=nums[j];
    	   nums[j]=temp;
       }
       for(int i=0,j=k-1;i<j;i++,j--){ // 翻转第1个到第k个
    	   int temp=nums[i];
    	   nums[i]=nums[j];
    	   nums[j]=temp;
       }
       for(int i=k,j=nums.length-1;i<j;i++,j--){ //翻转第k+1个到最后
    	   int temp=nums[i];
    	   nums[i]=nums[j];
    	   nums[j]=temp;
       }
    }
}
