package com.tom.d171excelnum;

public class SelfSolution {
/*
 * 分析：26进制转10进制，从尾至头
 */
public int titleToNumber(String s) {
		int res=0;
		int temp=0;
        for(int i=0;i<s.length();i++){
        	temp=s.charAt(i)-'A'+1;
        	res=res*26+temp;
        }
        return res;
    }
}
