package com.tom.d190ReverseBits;

public class SuperiorSolution {

	 public int reverseBits(int n) {  
		 int value=0;
		 //n为32位无符号整形
		 for(int i=0;i<32;i++){
			 if((n&1)==1){
				 value=(value<<1)+1;
				 n=n>>1;
			 }else{
				 value=value<<1;
				 n=n>>1;
			 }
		 }
		 return value;
	 }
}
