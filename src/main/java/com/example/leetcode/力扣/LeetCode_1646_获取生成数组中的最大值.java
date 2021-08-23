package com.example.leetcode.力扣;

import java.util.Arrays;

/**
 * @author liyingjie
 * @describe: LeetCode_1646_获取生成数组中的最大值
 * @date 2021/8/23 14:24
 */
//https://leetcode-cn.com/problems/get-maximum-in-generated-array/
/*
[0,1,1,2,1,3,2,3,1,4]
{0 1 2 3 4 5 6 7 8 9}

*/
public class LeetCode_1646_获取生成数组中的最大值 {
    public static void main(String[] args) {
        System.out.println(getMaximumGenerated(7));
        System.out.println(getMaximumGenerated(2));
        System.out.println(getMaximumGenerated(3));
        System.out.println("---------------------------");
        System.out.println(getMaximumGeneratedPlus(7));
        System.out.println(getMaximumGeneratedPlus(2));
        System.out.println(getMaximumGeneratedPlus(3));
    }

    private static int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 0; i <= n; i++) {
            if (i >= 2) {
                if (i % 2 == 0) {
                    nums[i] = nums[i / 2];
                } else {
                    nums[i] = nums[i / 2] + nums[i / 2 + 1];
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums[n];
    }

    private static int getMaximumGeneratedPlus(int n) {
        if (n == 0) return 0;
        int[] nums = new int[n + 1];
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i / 2] + i % 2 * nums[i / 2 + 1];
        }
        return Arrays.stream(nums).max().getAsInt();
    }


}
