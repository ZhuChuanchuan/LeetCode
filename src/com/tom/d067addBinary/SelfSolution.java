package com.tom.d067addBinary;

public class SelfSolution {
/*
 * question:Add Binary
 * Given two binary strings, return their sum (also a binary string).
 * author:tom
 * time:2016-12-6 10:43:40
 */
public static String addBinary(String a, String b) {
		int shortlen,longlen;
		if(a.length()>b.length()){
			shortlen=b.length();
			longlen=a.length();
		}else{
			shortlen=a.length();
			longlen=b.length();
		}
		int i=0;
		int flag=0;
		char[] res=new char[longlen];
		while(i<longlen){
			int aLast;
			int bLast;
			if(i>=shortlen){ //有 一个为空时，赋为0参与计算
				if(a.length()<b.length()){
					aLast=0;
					bLast=b.charAt(b.length()-1-i)-'0';
				}else{
					aLast=a.charAt(a.length()-1-i)-'0';
					bLast=0;
				}
			}else{
				aLast=a.charAt(a.length()-1-i)-'0';
				bLast=b.charAt(b.length()-1-i)-'0';
			}
			
			if(flag+aLast+bLast>=2){
				res[res.length-1-i]=(char)((flag+aLast+bLast)%2+48);
				flag=1;
			}else{
				res[res.length-1-i]=(char)(flag+aLast+bLast+48);
				flag=0;
			}
			i++;
		}
		if(flag==1){//最高位进位
			char[] res2=new char[longlen+1];
			for(int j=res.length-1;j>=0;j--){
				res2[j+1]=res[j];
			}
			res2[0]='1';
			return String.valueOf(res2);
		}
		
		return String.valueOf(res);
    }
}
