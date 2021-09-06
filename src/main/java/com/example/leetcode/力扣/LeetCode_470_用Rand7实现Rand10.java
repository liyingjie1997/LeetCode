package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_470_用Rand7实现Rand10
 * @date 2021/9/6 10:55
 */
//https://leetcode-cn.com/problems/implement-rand10-using-rand7/
public class LeetCode_470_用Rand7实现Rand10 {
    public static void main(String[] args) {

        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand10());
        System.out.println(rand10());
        System.out.println(rand10());
        System.out.println(rand10());
        System.out.println(rand10());
    }

    private static int rand10() {
        int row, col, idx;
        do {
            row = rand7();
            col = rand7();
            idx = col + (row - 1) * 7;
        } while (idx > 40);
        return 1 + (idx - 1) % 10;
    }

    private static int rand7() {
        return new Double(Math.ceil(Math.random() * 10)).intValue();
    }
}
