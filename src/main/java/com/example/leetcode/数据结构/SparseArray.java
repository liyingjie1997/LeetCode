package com.example.leetcode.数据结构;

/**
 * @author liyingjie
 * @describe: 稀疏数组
 * @date 2021/8/9 14:46
 */
public class SparseArray {
    public static void main(String[] args) {
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        chessArr[3][4] = 1;

        for (int[] rows : chessArr) {
            for (int row : rows) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------");

        int sum = 0;
        for (int[] rows : chessArr) {
            for (int row : rows) {
                if (row != 0) {
                    sum++;
                }
            }
        }

        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        int count = 1;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[i].length; j++) {
                if (chessArr[i][j] != 0) {
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArr[i][j];
                    count++;
                }
            }
        }

        for (int[] rows : sparseArray) {
            for (int row : rows) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------");

        chessArr = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            chessArr[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        for (int[] rows : chessArr) {
            for (int row : rows) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

    }
}
