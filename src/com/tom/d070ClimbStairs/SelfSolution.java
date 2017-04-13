package com.tom.d070ClimbStairs;

public class SelfSolution {
/*
 * 分析：动态规划问题，类型斐波那契
 */
public static int climbStairs(int n) {
	int[] arr=new int[n];
    if(n==1){
    	return 1;
    }
    if(n==2){
    	return 2;
    }
    arr[0]=1;
    arr[1]=2;
    for(int i=2;i<n;i++){
    	arr[i]=arr[i-1]+arr[i-2];
    }
    
    return arr[n-1];
    }
}
