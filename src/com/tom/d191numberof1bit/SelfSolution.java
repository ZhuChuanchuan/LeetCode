package com.tom.d191numberof1bit;
/*
 * @ question:leetcode -191 Number of 1 Bits
 * @ author:tom
 * @ time:2017-2-12 22:04:11
 */
public class SelfSolution {

	public int hammingWeight(int n) {
        int count=0;
		 //n为32位无符号整形
		 for(int i=0;i<32;i++){
			 if((n&1)==1){
				 count++;
				 n=n>>1;
			 }else{
				 
				 n=n>>1;
			 }
		 }
		 return count;
    }
}
