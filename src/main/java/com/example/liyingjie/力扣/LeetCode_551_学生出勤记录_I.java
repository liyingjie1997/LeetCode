package com.example.liyingjie.力扣;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liyingjie
 * @describe: LeetCode_551_学生出勤记录_I
 * @date 2021/8/17 15:43
 */
//https://leetcode-cn.com/problems/student-attendance-record-i/
public class LeetCode_551_学生出勤记录_I {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
    }

    private static boolean checkRecord(String s) {
        int countL = 0, countA = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                countL++;
                //连续三次L
                if (countL == 3) {
                    return false;
                }
            } else {
                countL = 0;
                if (c == 'A') {
                    countA++;
                    //总共两次A
                    if (countA == 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
