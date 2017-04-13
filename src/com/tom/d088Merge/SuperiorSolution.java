package com.tom.d088Merge;

public class SuperiorSolution {
	/*
	 * 分析：总长度 m+n-1 先利用A数组后面的为空的地方
	 */
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
	    while (tail1 >= 0 && tail2 >= 0) {
	        nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? 
	                             nums1[tail1--] : nums2[tail2--];
	    }

	    while (tail2 >= 0) { //only need to combine with remaining nums2
	        nums1[finished--] = nums2[tail2--];
	    }
	}
}
