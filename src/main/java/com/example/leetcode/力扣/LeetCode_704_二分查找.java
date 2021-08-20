package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_704_二分查找
 * @date 2021/8/17 17:06
 */
//https://leetcode-cn.com/problems/binary-search/
public class LeetCode_704_二分查找 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 9));
        System.out.println(search(nums, 2));
    }

    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, between;
        while (true) {
            between = start + (end - start) / 2;
            if (nums[between] == target) {
                return between;
            }
            if (start >= end) {
                return -1;
            }
            if (nums[between] > target) {
                end = between - 1;
            } else {
                start = between + 1;
            }
        }
    }
}
