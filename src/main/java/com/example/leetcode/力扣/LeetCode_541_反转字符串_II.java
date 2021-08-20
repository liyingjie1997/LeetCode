package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_541_反转字符串_II
 * @date 2021/8/20 11:40
 */
//https://leetcode-cn.com/problems/reverse-string-ii/
public class LeetCode_541_反转字符串_II {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 2));
    }

    private static String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        int num;
        if (s.length() % (2 * k) != 0) {
            num = s.length() / (2 * k) + 1;
        } else {
            num = s.length() / (2 * k);
        }
        for (int i = 0; i < num; i++) {
            if (i == num - 1) {
                String substring = s.substring(i * 2 * k);
                if (substring.length() <= k) {
                    String s1 = new StringBuilder(substring).reverse().toString();
                    result.append(s1);
                } else {
                    result.append(new StringBuilder(substring.substring(0, k)).reverse().toString()).append(substring.substring(k));
                }
            } else {
                String substring = s.substring(i * 2 * k, (i + 1) * 2 * k);
                result.append(new StringBuilder(substring.substring(0, k)).reverse().toString()).append(substring.substring(k));
            }
        }


        return result.toString();
    }
}
