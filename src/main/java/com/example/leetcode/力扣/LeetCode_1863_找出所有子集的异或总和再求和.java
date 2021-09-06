package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_1863_找出所有子集的异或总和再求和
 * @date 2021/9/1 11:04
 */
//https://leetcode-cn.com/problems/sum-of-all-subset-xor-totals/
public class LeetCode_1863_找出所有子集的异或总和再求和 {
    public static void main(String[] args) {

        System.out.println(subsetXORSum(new int[]{1, 3}));
        System.out.println(subsetXORSum(new int[]{5, 1, 6}));
        System.out.println(subsetXORSum(new int[]{3, 4, 5, 6, 7, 8}));
    }

    private static int subsetXORSum(int[] nums) {

        return 0;
    }

    private static int getSum(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = sum ^ nums[i];
        }
        return sum;
    }
}
