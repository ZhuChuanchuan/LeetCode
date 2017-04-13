package com.tom.d066plusone;

public class SelfSolution {
/*
 * 分析：从最低位开始，加1进位判断，不需要进位则返回。最后如果最高位也需要进位，则创建一个新的数组
 */
public static int[] plusOne(int[] digits) {
	int i=digits.length-1;
	for(;i>=0;i--){
		if(digits[i]+1==10){
			digits[i]=0;
			continue;
		}else{
			digits[i]=digits[i]+1;
			break;
		}
	}
	if(i<0){ //说明最高位也为9
		int[] res=new int[digits.length+1]; //新创建一个大于原始数组一个长度的数组，最高位赋值为1
		res[0]=1;
		return res;
	}
	return digits;
    }
}
