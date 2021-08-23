package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_22_黑白方格画
 * @date 2021/8/17 18:14
 */
//https://leetcode-cn.com/problems/ccw6C7/
public class LeetCode_22_黑白方格画 {
    public static void main(String[] args) {
        System.out.println(paintingPlan(2, 2));
        System.out.println(paintingPlan(2, 1));
        System.out.println(paintingPlan(2, 4));

    }

    private static int paintingPlan(int n, int k) {
        if (k == 0) {
            return 0;
        }
        if (n * n == k) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //i行J列 减去他们重复涂得 i*j
                if ((i + j) * n - (i * j) == k) {
                    //行的排列组合 * 列的排列组合
                    count += (multiply(1, n) / (multiply(1, n - i) * multiply(1, i)))
                            * (multiply(1, n) / (multiply(1, n - j) * multiply(1, j)));
                    break;
                }
            }
        }
        return count;
    }


    private static int multiply(int result, int num) {
        if (num == 0) {
            return 1;
        }
        if (num != 1) {
            result = multiply(result * num, num - 1);
        }
        return result;
    }
}
