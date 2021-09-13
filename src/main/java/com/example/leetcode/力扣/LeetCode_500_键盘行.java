package com.example.leetcode.力扣;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liyingjie
 * @describe: LeetCode_500_键盘行
 * @date 2021/9/9 15:44
 */
//https://leetcode-cn.com/problems/keyboard-row/
public class LeetCode_500_键盘行 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
        System.out.println(Arrays.toString(findWords(new String[]{"omk"})));
        System.out.println(Arrays.toString(findWords(new String[]{"adsdf", "sfd"})));

    }


    private static String[] findWords(String[] words) {
        final List<String> q = Arrays.asList("q", "w", "e", "r", "t", "y", "u", "i", "o", "p");
        final List<String> a = Arrays.asList("a", "s", "d", "f", "g", "h", "j", "k", "l");
        final List<String> z = Arrays.asList("z", "x", "c", "v", "b", "n", "m");
        List<String> list = new ArrayList<>();
        for (String value : words) {
            String word = value.toLowerCase();
            if (word.length() == 0) {
                continue;
            }
            String s = String.valueOf(word.charAt(0));
            boolean flag = true;
            if (q.contains(s)) {
                for (int j = 1; j < word.length(); j++) {
                    if (!q.contains(String.valueOf(word.charAt(j)))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    list.add(value);
                }
            } else if (a.contains(s)) {
                for (int j = 1; j < word.length(); j++) {
                    if (!a.contains(String.valueOf(word.charAt(j)))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    list.add(value);
                }
            } else {
                for (int j = 1; j < word.length(); j++) {
                    if (!z.contains(String.valueOf(word.charAt(j)))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    list.add(value);
                }
            }


        }
        return list.toArray(new String[0]);
    }
}
