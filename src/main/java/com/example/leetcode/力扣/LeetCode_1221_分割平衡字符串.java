package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_1221_分割平衡字符串
 * @date 2021/9/7 10:16
 */
//https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
public class LeetCode_1221_分割平衡字符串 {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }

    private static int balancedStringSplit(String s) {
        int count = 0, r = 0, l = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'R') {
                r++;
            } else {
                l++;
            }
            if (r == l) {
                count++;
            }
        }
        return count;
    }
}
