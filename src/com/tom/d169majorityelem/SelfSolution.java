package com.tom.d169majorityelem;

import java.util.HashMap;
import java.util.Map;

/*
 * 分析：HashMap（value,count)
 */
public class SelfSolution {
public static int majorityElement(int[] nums) {
		Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        	if(map.containsKey(nums[i])){ //(nums[i],cout)
        		map.put(nums[i], map.get(nums[i])+1);
        	}else{
        		map.put(nums[i], 1);
        	}
        	if(map.get(nums[i])>nums.length/2){
        		return nums[i];
        	}
        }
        return -1;
    }
}
