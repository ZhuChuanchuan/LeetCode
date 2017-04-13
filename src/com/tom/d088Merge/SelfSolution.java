package com.tom.d088Merge;

public class SelfSolution {
/*
 * question:Merge Sorted Array
 * author:tom
 * time:2016-12-6 15:22:41
 */
public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i=0,j=0;
		while(j<n&&i<m){
			if(nums2[j]<nums1[i]){
				//²åÈë iÇ°Ãæ
				push_arr(nums2[j],nums1,i,m);
				j++;
				m++;
			}else{
				i++;
			}
		}
		while(j<n){
			nums1[i++]=nums2[j++];
		}
    }

private static void push_arr(int num, int[] nums1,int cursor,int cout) {
	// TODO Auto-generated method stub
	for(int i=cout;i>=cursor;i--){
		nums1[i+1]=nums1[i];
	}
	nums1[cursor]=num;
}
}
