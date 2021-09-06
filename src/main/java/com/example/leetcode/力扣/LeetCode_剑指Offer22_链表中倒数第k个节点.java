package com.example.leetcode.力扣;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author liyingjie
 * @describe: LeetCode_剑指Offer22_链表中倒数第k个节点
 * @date 2021/9/3 13:48
 */
//https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
public class LeetCode_剑指Offer22_链表中倒数第k个节点 {
    public static void main(String[] args) {
        //[1,2,3,4,5]
        //l
    }

    private static ListNode getKthFromEnd(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        ListNode next = head.next;
        while (true) {
            stack.push(head);
            if (next == null) {
                break;
            }
            head = next;
        }
        ListNode result = null;
        for (int i = 0; i < k; i++) {
            result = stack.pop();
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
