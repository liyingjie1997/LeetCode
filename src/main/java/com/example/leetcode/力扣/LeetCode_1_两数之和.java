package com.example.leetcode.力扣;

import java.util.Arrays;

/**
 * @author liyingjie
 * @describe: LeetCode_1_两数之和
 * @date 2021/8/17 17:53
 */
//https://leetcode-cn.com/problems/two-sum/
public class LeetCode_1_两数之和 {

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums1, 9)));
        int[] nums2 = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums2, 6)));
        int[] nums3 = {3, 3};
        System.out.println(Arrays.toString(twoSum(nums3, 6)));

    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
