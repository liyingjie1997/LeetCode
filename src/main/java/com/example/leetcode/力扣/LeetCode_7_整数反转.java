package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_7_整数反转
 * @date 2021/8/30 14:55
 */
public class LeetCode_7_整数反转 {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
    }

    private static int reverse(int x) {
        int flag = 1;
        if (x < 0) {
            flag = -1;
            x -= 2 * x;
        }
        int i = 0;
        try {
            return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString()) * flag;
        } catch (NumberFormatException e) {
            return 0;
        }

    }
}
