package com.tom.d001twosum;

import java.util.HashMap;

public class SuperiorSolution {
	/*
	 * 思路：第一次遍历数组先将所有元素和它的下标作为key-value对存入Hashmap中，
	 * 第二次遍历数组时根据目标和与当前元素之差，在Hashmap中找相应的差值。
	 * 如果存在该差值，说明存在两个数之和是目标和。此时记录下当前数组元素下标并拿出Hashmap中数组元素下标即可
	 * 。Hashmap获取元素的时间复杂度是O(1)，所以总的时间复杂度仍不超过O(n)
	 */

	public static int[] twoSum(int[] numbers, int target) {
//	    int[] result = new int[2];
//	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//	    for (int i = 0; i < numbers.length; i++) {
//	        if (map.containsKey(target - numbers[i])) {
//	            result[1] = i + 1;
//	            result[0] = map.get(target - numbers[i]);
//	            return result;
//	        }
//	        map.put(numbers[i], i + 1);
//	    }
//	    return result;
		
		if(numbers==null||numbers.length<2){
			return new int[]{0,0};
		}
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<numbers.length;i++){
			if(map.containsKey(numbers[i])){
				return new int[]{map.get(numbers[i]),i+1};
			}else{
				map.put(target-numbers[i], i+1);
			}
		}
		return new int[]{0,0};
		
	}

}
