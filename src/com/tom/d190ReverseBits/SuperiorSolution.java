package com.tom.d190ReverseBits;

public class SuperiorSolution {

	 public int reverseBits(int n) {  
		 int value=0;
		 //nΪ32λ�޷�������
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
