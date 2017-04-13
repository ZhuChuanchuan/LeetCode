package com.tom.d131PalindromePartition;

import java.util.ArrayList;
import java.util.List;

public class SelfSolution {
/*
 * 分析：substring截取子串，sb.reverse判断是否为回文
 */
public static List<List<String>> partition(String s) {
        int len=s.length();
        List<List<String>> list= new ArrayList<List<String>>();
        if(len==1){
        	List<String> li=new ArrayList<String>();
        	li.add(s);
        	list.add(li);
        	return list;
        }
        int i=0;
        while(i<len){
        	int j=i+1;
        	while(j<len){
        		String tempStr=s.substring(i, j);
        		if(isPalindrome(tempStr)){ //判断回文
        			List<String> li=new ArrayList<String>();
        			String[] tempArr=tempStr.split("");
        			for(String ss : tempArr){ //分割字符串到list
        				li.add(ss);
        			}
        			list.add(li);
        		}
        		j++;
        	}
        	i++;
        }
        return list;
    }
 private static boolean isPalindrome(String s){
	 return new StringBuilder(s).reverse().toString().equals(s);
 }
}
