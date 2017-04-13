package com.tom.d006zigzag;

public class SelfSolution {
	/*
	 * question:zigzag
	 * author:tom
	 * time:2016-11-30 10:22:07
	 */
	public static class Solution {
	    public String convert(String s, int numRows) {
	        //
	        if(numRows<=1||numRows>=s.length())
	            return s;
	        int colSpan=2*(numRows-1);
	        int len=s.length();
	        StringBuilder sb=new StringBuilder();
	        for(int i=0;i<numRows;i++){//���ɶ�ά���飬�м��ж����һ�����жϼ���
	            for(int j=i;j<len;j+=colSpan){
	                sb.append(s.charAt(j));
	                int midCol=j+colSpan-2*i;//�м��еĶ����е�����
	                if(i!=0&&i!=numRows-1&&midCol<len){
	                    sb.append(s.charAt(midCol));
	                }
	            }
	        }
	        return sb.toString();
	    }
	}
}
