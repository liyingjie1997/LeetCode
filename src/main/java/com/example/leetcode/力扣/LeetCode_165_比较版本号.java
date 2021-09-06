package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_165_比较版本号
 * @date 2021/9/1 10:22
 */
//https://leetcode-cn.com/problems/compare-version-numbers/
public class LeetCode_165_比较版本号 {
    public static void main(String[] args) {
        System.out.println(compareVersion("1.01", "1.001"));
        System.out.println(compareVersion("1.0", "1.0.0"));
        System.out.println(compareVersion("0.1", "1.1"));
        System.out.println(compareVersion("1.0.1", "1"));
        System.out.println(compareVersion("7.5.2.4", "7.5.3"));
    }

    private static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        String[] max, min;
        int flag = 1;
        if (v1.length >= v2.length) {
            max = v1;
            min = v2;
        } else {
            max = v2;
            min = v1;
            flag = -1;
        }

        for (int i = 0; i < max.length; i++) {
            if (i >= min.length) {
                if (Integer.parseInt(max[i]) > 0) {
                    return flag;
                }
            } else {
                if (Integer.parseInt(max[i]) > Integer.parseInt(min[i])) {
                    return flag;
                } else if (Integer.parseInt(max[i]) < Integer.parseInt(min[i])) {
                    return -flag;
                }
            }
        }

        return 0;
    }
}
