package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_1894_找到需要补充粉笔的学生编号
 * @date 2021/9/10 11:52
 */
//https://leetcode-cn.com/problems/find-the-student-that-will-replace-the-chalk/comments/
public class LeetCode_1894_找到需要补充粉笔的学生编号 {
    public static void main(String[] args) {
        System.out.println(chalkReplacer(new int[]{5, 1, 5}, 22));
        System.out.println(chalkReplacer(new int[]{3, 4, 1, 2}, 25));
    }

    private static int chalkReplacer(int[] chalk, int k) {
        long sum = 0L;
        for (int value : chalk) {
            sum += value;
        }
        k %= sum;
        for (int i = 0; i < chalk.length; i++) {
            k -= chalk[i];
            if (k < 0) {
                return i;
            }
        }
        return 0;
    }
}
