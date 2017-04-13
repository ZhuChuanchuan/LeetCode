package com.tom.d038countsay;

public class SelfSolution {
/*
 * question:Count and Say
 * author:tom
 * time:2016-12-5 17:05:41
 */
public String countAndSay(int n) {
        String res="1";
        for(int i=1;i<n;i++){
        	char[] c=res.toCharArray(); //��ȡ�ϴ�res��ֵ
        	StringBuilder sb=new StringBuilder();
        	int cout=1;
        	for(int j=1;j<c.length;j++){//����res���¸�ֵ
        		if(c[j-1]!=c[j]){
        			sb.append(cout);
        			sb.append(c[j-1]);
        			cout=1;
        		}else{
        			cout++;
        		}
        	}
        	sb.append(cout);
        	sb.append(c[c.length-1]);
        	res=sb.toString();
        }
        return res;
    }
	
}
