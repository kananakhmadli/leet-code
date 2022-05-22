package com.akh.leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums={1,1,3};
        int target =6;
        int [] result=twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

}