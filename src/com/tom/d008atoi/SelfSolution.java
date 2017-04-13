package com.tom.d008atoi;

public class SelfSolution {
	/*
	 * question:String to Integer(atoi)
	 * author:tom
	 * time:2016-11-30 14:10:39
	 */
	public static int myAtoi(String str) {
		if(str.length()==0){
			return 0;
		}
		String s=str;
		s=s.trim();
		boolean positive=true;
		int i=0;
		long result=0;
		//�ж����ַ�������
		if(s.charAt(0)=='-'){
			positive=false;
			i++;
		}else if(s.charAt(0)=='+'){
			i++;
		}
		while(i<s.length()&&i<12){//�����ж�integer��λ��
			if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
				result=result*10+(s.charAt(i)-'0');
			}else{
				break;
			}
			i++;
		}
		if(!positive){//���Ǹ���
			result=-result;
		}
		if(result<Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}else if(result>Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}	
		return (int)result;
    }
}
