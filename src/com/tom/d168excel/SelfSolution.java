package com.tom.d168excel;

public class SelfSolution {
/*
 * 分析：26进位，以A为标准加，从末尾字符开始计算
 */
public static String convertToTitle(int n) {
        String res="";
        while(n>0){
        	n--;
        	res=(char)('A'+n%26)+res; //从末尾计算字符
        	n/=26;
        }
        return res;
    }
}
