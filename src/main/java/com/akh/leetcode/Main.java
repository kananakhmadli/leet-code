package com.akh.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;

@Slf4j
public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 4, 11, 13, 2};
        int[] result = twoSum2(nums, 9);
        log.info("result= {}", Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int def = target - nums[i];
            if (map.containsKey(def))
                return new int[]{map.get(def), i};
            map.put(nums[i], i);
        }

        return new int[2];
    }

}