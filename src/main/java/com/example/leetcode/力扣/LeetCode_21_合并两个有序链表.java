package com.example.leetcode.力扣;

/**
 * @author liyingjie
 * @describe: LeetCode_21_合并两个有序链表
 * @date 2021/9/7 16:26
 */
//https://leetcode-cn.com/problems/merge-two-sorted-lists/
public class LeetCode_21_合并两个有序链表 {


    public static void main(String[] args) {
        ListNode l1_3 = new ListNode(4);
        ListNode l1_2 = new ListNode(2, l1_3);
        ListNode l1_1 = new ListNode(1, l1_2);

        ListNode l2_3 = new ListNode(4);
        ListNode l2_2 = new ListNode(3, l2_3);
        ListNode l2_1 = new ListNode(1, l2_2);

        System.out.println(mergeTwoLists(l1_1, l2_1).val);
        //System.out.println(mergeTwoLists(new ListNode(1), new ListNode(2)).next.val);
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }


    private static void x(ListNode l1, ListNode l2) {
        if (l1 == null) {
            l1 = l2;
        }
        if (l2 == null) {
            return;
        }
        ListNode temp;
        ListNode next = l1;
        while (true) {
            if (next.val <= l2.val && next.next.val >= l2.val) {
                temp = next.next;
                l1.next = l2;
                l2 = temp;
                x(l1, l2);
            } else {
                next = next.next;
            }
        }
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


}
