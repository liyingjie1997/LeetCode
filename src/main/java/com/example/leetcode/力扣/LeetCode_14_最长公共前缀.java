package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_14_最长公共前缀
 * @date 2021/9/7 11:32
 */
//https://leetcode-cn.com/problems/longest-common-prefix/
public class LeetCode_14_最长公共前缀 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
        System.out.println(longestCommonPrefix(new String[]{"a"}));
        System.out.println(longestCommonPrefix(new String[]{"c", "acc", "ccc"}));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs==null||strs.length==0){
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                char c = strs[0].charAt(i);
                if (strs[j].length() == i || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
