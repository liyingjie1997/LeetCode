package com.example.liyingjie.力扣;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author liyingjie
 * @describe: LeetCode_1337_矩阵中战斗力最弱的K行
 * @date 2021/8/17 15:43
 */
//https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/
public class LeetCode_1337_矩阵中战斗力最弱的K行 {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        System.out.println(Arrays.toString(kWeakestRows(mat1, 3)));
        int[][] mat2 = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        System.out.println(Arrays.toString(kWeakestRows(mat2, 2)));
    }

    //我的思路
    private static int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>(mat.length);
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            map.put(i, count);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o1.getValue() - o2.getValue() == 0 ? o1.getKey() - o2.getKey() : o1.getValue() - o2.getValue());
        System.out.println(map);
        System.out.println(list);
        //List<Integer> collect = list.subList(0, k).stream().map(Map.Entry::getKey).collect(Collectors.toList());
        //System.out.println(collect);
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}
