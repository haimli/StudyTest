package org.example.leetcode.list;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 *
 * @author <a href="mailto:912547587@qq.com">lihaiming</a>
 * @version 1.0.0
 * @since 2021/10/7 22:21
 **/
public class AddTwoNumber {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = null, tail = null;
        int c = 0;
        int n1, n2, temp;
        while (l1 != null || l2 != null) {
            n1 = l1 == null ? 0 : l1.val;
            n2 = l2 == null ? 0 : l2.val;
            temp = n1 + n2 + c;

            if (result == null) {
                result = new ListNode(temp % 10);
                tail = result;
            } else {
                tail.next = new ListNode(temp % 10);
                tail = tail.next;
            }
            if (temp >= 10) {
                c = 1;
                tail.next = new ListNode(c);
            } else {
                c = 0;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return result;
    }
}
