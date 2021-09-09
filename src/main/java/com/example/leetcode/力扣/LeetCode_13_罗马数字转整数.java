package com.example.leetcode.力扣;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liyingjie
 * @describe: LeetCode_13_罗马数字转整数
 * @date 2021/9/6 15:54
 */
//https://leetcode-cn.com/problems/roman-to-integer/
public class LeetCode_13_罗马数字转整数 {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    private static int romanToInt(String s) {
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I') {
                if (i + 1 < chars.length && (chars[i + 1] == 'V' || chars[i + 1] == 'X')) {
                    sum -= 1;
                } else {
                    sum += 1;
                }
            } else if (chars[i] == 'V') {
                sum += 5;
            } else if (chars[i] == 'X') {
                if (i + 1 < chars.length && (chars[i + 1] == 'L' || chars[i + 1] == 'C')) {
                    sum -= 10;
                } else {
                    sum += 10;
                }
            } else if (chars[i] == 'L') {
                sum += 50;
            } else if (chars[i] == 'C') {
                if (i + 1 < chars.length && (chars[i + 1] == 'D' || chars[i + 1] == 'M')) {
                    sum -= 100;
                } else {
                    sum += 100;
                }
            } else if (chars[i] == 'D') {
                sum += 500;
            } else if (chars[i] == 'M') {
                sum += 1000;
            }
        }
        return sum;
    }
}
