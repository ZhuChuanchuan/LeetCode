package com.tom.d067addBinary;

public class SelfSolution2 {
	public static String addBinary(String a, String b) {
		int maxLen=Math.max(a.length(), b.length());
		StringBuilder sb=new StringBuilder();
		int i=0;
		String rA=new StringBuilder(a).reverse().toString();
		String rB=new StringBuilder(b).reverse().toString();
		int carry=0;//进位
		while(i<maxLen){
			int ia=i<rA.length()?rA.charAt(i)-'0':0;
			int ib=i<rB.length()?rB.charAt(i)-'0':0;
			int sum=ia+ib+carry;
			if(sum>=2){ //进位
				carry=1;
				sum%=2;
			}else{
				carry=0;
			}
			sb.append(String.valueOf(sum));
			i++;
		}
		if(carry==1){
			sb.append("1");
		}
		return sb.reverse().toString();
	}
}
