package com.ss;

import java.util.Arrays;
import java.util.HashMap;

public class Day01 {

	// 给定一个数组和一个数，求解相加等于这个数的数组下标。

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		System.out.println(Arrays.toString(twoSum1(nums, target)));
		System.out.println(Arrays.toString(twoSum2(nums, target)));
	}

	public static int[] twoSum1(int[] nums, int target) {

		int[] res = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					res[0] = i;
					res[1] = j;
				}
			}
		}
		return res;
	}

	public static int[] twoSum2(int[] nums, int target) {

		int[] res = new int[2];

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int k = 0; k < nums.length; k++) {
			if (map.get(target - nums[k]) != null && map.get(target - nums[k]) != k) {
				res[0] = k;
				res[1] = map.get(target - nums[k]);
			}
		}
		return res;
	}
}
