package com.tom.d202HappyNumber;

import java.util.HashSet;

public class SelfSolution2 {

	public static boolean isHappy(int n) {
		HashSet<Integer> set=new HashSet<Integer>();
		while(n!=1){
			int sum=calc(n);
			if(set.contains(sum)){//判断是否进入死循环
				return false;
			}else{
				set.add(sum);
			}
			n=sum;
		}
		return true;
	}
	private static int calc(int n){
		int sum=0;
		while(n!=0){
			int g=n%10;
			sum+=g*g;
			n/=10;
		}
		return sum;
	}
}
