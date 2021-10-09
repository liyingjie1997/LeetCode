package com.example.leetcode.力扣;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author liyingjie
 * @describe: LeetCode_27_移除元素
 * @date 2021/9/27 11:01
 */
//https://leetcode-cn.com/problems/remove-element/
public class LeetCode_27_移除元素 {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    private static int removeElement(int[] nums, int val) {
        nums = Arrays.stream(nums).filter(value -> value != val).toArray();
        System.out.println(Arrays.toString(nums));
        return nums.length;
    }
}
