package com.tom.d169majorityelem;

import java.util.Arrays;

public class SuperiorSolution2 {
	public int majorityElement(int[] nums) {
		
		// ±º‰∏¥‘”∂»£∫nlogn
	     Arrays.sort(nums);
	     return nums[nums.length/2];
	}
}
