package com.example.leetcode.力扣;

import java.util.Arrays;

/**
 * @author liyingjie
 * @describe: LeetCode_1929_数组串联
 * @date 2021/8/24 15:36
 */
public class LeetCode_1929_数组串联 {
    public static void main(String[] args) {
        int[] ints1 = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(ints1)));

        int[] ints2 = {1, 3, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(ints2)));

    }

    private static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[nums.length + i] = nums[i];
        }
        return result;

    }

}
