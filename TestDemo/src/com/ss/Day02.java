package com.ss;

import java.util.Arrays;

public class Day02 {

	// 给定一个数组和一个数，求解相加等于这个数的数组下标。 
	
	public static void main(String[] args) {
		
		int [] nums = {2, 7, 11, 15};
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(nums,target)));
	}
	
	
	public static int[] twoSum(int[] nums, int target) {
		
        int[] res = new int[2];
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}



