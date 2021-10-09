package com.example.leetcode.力扣;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author liyingjie
 * @describe: LeetCode_678_有效的括号字符串
 * @date 2021/9/13 14:49
 */
public class LeetCode_678_有效的括号字符串 {
    public static void main(String[] args) {
        System.out.println(checkValidString("()"));
        System.out.println(checkValidString("(*)"));
        System.out.println(checkValidString("(*))"));
        System.out.println(checkValidString("("));
        System.out.println(checkValidString("(((((*)))**"));
        System.out.println(checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));
    }

    private static boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack_x = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == '*') {
                stack_x.push(i);
            } else {
                if (!stack.empty()) {
                    stack.pop();
                } else if (!stack_x.empty()) {
                    stack_x.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.size() > stack_x.size()) {
            return false;
        }
        while (!stack.isEmpty()) {
            int leftIndex = stack.pop();
            int asteriskIndex = stack_x.pop();
            if (leftIndex > asteriskIndex) {
                return false;
            }
        }
        return true;
    }
}
