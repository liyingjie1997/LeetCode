package com.example.leetcode.力扣;

import java.util.Arrays;

/**
 * @author liyingjie
 * @describe: LeetCode_面试题_17_14_最小K个数
 * @date 2021/9/6 15:45
 */
//https://leetcode-cn.com/problems/smallest-k-lcci/
public class LeetCode_面试题_17_14_最小K个数 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallestK(new int[]{1, 3, 5, 7, 2, 4, 6, 8}, 4)));
    }

    public static int[] smallestK(int[] arr, int k) {
        Arrays.sort(arr);
        int[] result = new int[k];
        System.arraycopy(arr, 0, result, 0, k);
        return result;
    }
}
