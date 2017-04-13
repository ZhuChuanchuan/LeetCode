package com.tom.d009Palindrome;

public class SelfSolution {
	/*
	 * 分析：求数的翻转，再比较是否相同
	 */
	public static boolean isPalindrome(int x) {
        if(x<0){
        	return false;
        }
        //��ת��,���ж��Ƿ����
        int result=0;
        int num=x;
        while(num!=0){
        	result*=10;
        	result+=(num%10);
        	num=num/10;
        }
        if(result==x){
        	return true;
        }else{
        	return false;
        }
    }
}
