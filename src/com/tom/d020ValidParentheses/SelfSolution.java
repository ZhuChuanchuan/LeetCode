package com.tom.d020ValidParentheses;

public class SelfSolution {
	/*
	 * 分析：利用数组存入左括号，遇到右括号弹出，最后数组为空为true
	 */
	public static boolean isValid(String s) {
        if(s.length()!=0&&s.length()%2!=0)
        	return false;
		char[] c1=new char[s.length()/2];
        int len=0;
        for(int i=0;i<s.length();i++){
        	char cur=s.charAt(i);
        	if(cur=='('||cur=='{'||cur=='['){
        		c1[len]=cur;
        		len++;
        	}else if(cur==')'&&len>0){
        		if(c1[len-1]=='('){
        			len--;
        		}else{
        			return false;
        		}
        	}else if(cur=='}'&&len>0){
        		if(c1[len-1]=='{'){
        			len--;
        		}else{
        			return false;
        		}
        	}else if(cur==']'&&len>0){
        		if(c1[len-1]=='['){
        			len--;
        		}else{
        			return false;
        		}
        	}else{
        		return false;
        	}
        }
        if(len==0){
        	return true;
        }else{
        	return false;
        }
    }
}
