package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_292_Nim游戏
 * @date 2021/9/18 15:15
 */
public class LeetCode_292_Nim游戏 {
    public static void main(String[] args) {
        System.out.println(canWinNim(5));
        System.out.println(canWinNim(4));
        System.out.println(canWinNim(2));
        System.out.println(canWinNim(1));
    }

    private static boolean canWinNim(int n) {
        return n % 6 <= 3;
    }
}
