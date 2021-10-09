package com.example.leetcode.力扣;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liyingjie
 * @describe: LeetCode_1436_旅行终点站
 * @date 2021/10/9 14:26
 */
//https://leetcode-cn.com/problems/destination-city/
public class LeetCode_1436_旅行终点站 {
    public static void main(String[] args) {
        ArrayList<List<String>> paths1 = new ArrayList<>();
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("London");
        l1.add("New York");
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("New York");
        l2.add("Lima");
        ArrayList<String> l3 = new ArrayList<>();
        l3.add("Lima");
        l3.add("Sao Paulo");
        paths1.add(l1);
        paths1.add(l2);
        paths1.add(l3);
        System.out.println(destCity(paths1));

        ArrayList<List<String>> paths2 = new ArrayList<>();
        ArrayList<String> l11 = new ArrayList<>();
        l11.add("B");
        l11.add("C");
        ArrayList<String> l22 = new ArrayList<>();
        l22.add("D");
        l22.add("B");
        ArrayList<String> l33 = new ArrayList<>();
        l33.add("C");
        l33.add("A");
        paths2.add(l11);
        paths2.add(l22);
        paths2.add(l33);
        System.out.println(destCity(paths2));


        ArrayList<List<String>> paths3 = new ArrayList<>();
        ArrayList<String> l111 = new ArrayList<>();
        l111.add("A");
        l111.add("Z");
        paths3.add(l111);
        System.out.println(destCity(paths3));


        ArrayList<List<String>> paths4 = new ArrayList<>();
        ArrayList<String> l1111 = new ArrayList<>();
        l1111.add("qMTSlfgZlC");
        l1111.add("ePvzZaqLXj");
        ArrayList<String> l2222 = new ArrayList<>();
        l2222.add("xKhZXfuBeC");
        l2222.add("TtnllZpKKg");
        ArrayList<String> l3333 = new ArrayList<>();
        l3333.add("ePvzZaqLXj");
        l3333.add("sxrvXFcqgG");
        ArrayList<String> l4444 = new ArrayList<>();
        l4444.add("sxrvXFcqgG");
        l4444.add("xKhZXfuBeC");
        ArrayList<String> l5555 = new ArrayList<>();
        l5555.add("TtnllZpKKg");
        l5555.add("OAxMijOZgW");
        paths4.add(l1111);
        paths4.add(l2222);
        paths4.add(l3333);
        paths4.add(l4444);
        paths4.add(l5555);
        System.out.println(destCity(paths4));


    }

    private static String destCity(List<List<String>> paths) {
        String result = paths.get(0).get(1);
        return getnext(result, paths);
    }

    private static String getnext(String result, List<List<String>> paths) {
        for (List<String> path : paths) {
            if (path.get(0).equals(result)) {
                result = getnext(path.get(1), paths);
            }
        }
        return result;
    }
}
