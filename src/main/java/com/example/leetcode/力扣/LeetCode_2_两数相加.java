package com.example.leetcode.力扣;

import lombok.val;

/**
 * @author liyingjie
 * @describe: LeetCode_2_两数相加
 * @date 2021/9/6 17:42
 */
//https://leetcode-cn.com/problems/add-two-numbers/
public class LeetCode_2_两数相加 {
    public static void main(String[] args) {
        System.out.println(addTwoNumbers(new ListNode(9), new ListNode(2)).val);
    }


    public static class ListNode {
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

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        getChild(result, l1, l2);
        return result;
    }

    private static void getChild(ListNode result, ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return;
        } else if (l1 == null) {
            l1 = new ListNode(0);
        } else if (l2 == null) {
            l2 = new ListNode(0);
        }
        result.val = l1.val + l2.val;
        if (result.val >= 10) {
            result.val-=10;
            result.next = new ListNode(1);
            if (l1.next == null) {
                l1.next = new ListNode(1);
            } else {
                l1.next.val += 1;
            }
        } else {
            if (l1.next != null || l2.next != null) {
                result.next = new ListNode(0);
            } else {
                return;
            }
        }
        getChild(result.next, l1.next, l2.next);
    }



    private ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

}
