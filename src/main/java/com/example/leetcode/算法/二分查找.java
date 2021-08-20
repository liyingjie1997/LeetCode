package com.example.leetcode.算法;

/**
 * @author liyingjie
 * @describe: 二分查找
 * @date 2021/8/9 18:09
 */
public class 二分查找 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int search = search(nums, 2);
        System.out.println(search);
    }

    private static int search(int[] nums, int target) {
        int pivot = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) {
                return pivot;
            }
            if (target < nums[pivot]) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return -1;
    }
}
