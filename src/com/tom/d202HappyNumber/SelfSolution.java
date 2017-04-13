package com.tom.d202HappyNumber;

import java.util.HashMap;
import java.util.Map;

/*
 * @ question:leetcode -202 Happy Number
 * @ author:tom
 * @ time:2017-2-13 09:24:49
 */
public class SelfSolution {

	public boolean isHappy(int n) {
        //获取每次位数的乘积
		//判断是否等于1还是无线循环（map或set）
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		while(n!=1){
			int sum=count(n);
			if(map.containsKey(sum)){
				return false;
			}else{
				map.put(sum, sum);
			}
			n=sum;
		}
		return true;
    }

	private int count(int n) {
		// 计算各个数位上的平方和
		int sum=0;
		while(n>0){
			int result=n%10;
			sum+=result*result;
			n/=10;
		}
		return sum;
	}
}
