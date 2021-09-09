package com.example.leetcode.力扣;

import java.util.Stack;

/**
 * @author liyingjie
 * @describe: LeetCode_20_有效的括号
 * @date 2021/9/7 10:40
 */
//https://leetcode-cn.com/problems/valid-parentheses/
public class LeetCode_20_有效的括号 {
    public static void main(String[] args) {
        System.out.println(isValid("[["));
        System.out.println(isValid("){"));
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("({{{{}}}))"));
        System.out.println(isValid("[([]])"));
        System.out.println(isValid("["));
    }

    private static boolean isValid(String s) {
        char a = '{';
        char b = '[';
        char c = '(';
        char d = '}';
        char e = ']';
        char f = ')';
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (c1 == a || c1 == b || c1 == c) {
                stack.push(c1);
            } else {
                if (stack.empty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (c1 == d && pop != a) {
                    return false;
                }
                if (c1 == e && pop != b) {
                    return false;
                }
                if (c1 == f && pop != c) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
