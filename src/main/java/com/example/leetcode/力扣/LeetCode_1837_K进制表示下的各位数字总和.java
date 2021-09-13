package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_1837_K进制表示下的各位数字总和
 * @date 2021/9/10 15:20
 */
//https://leetcode-cn.com/problems/sum-of-digits-in-base-k/
public class LeetCode_1837_K进制表示下的各位数字总和 {
    public static void main(String[] args) {
        System.out.println(sumBase(34, 6));
        System.out.println(sumBase(10, 6));
    }

    private static int sumBase(int n, int k) {
        int result = 0;
        StringBuilder num = new StringBuilder();
        while (n != 0) {
            result += n % k;
            num.append(n % k);
            n /= k;
        }
        System.out.println(num.toString());
        return result;
    }
}
