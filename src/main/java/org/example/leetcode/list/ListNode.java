package org.example.leetcode.list;

/**
 * 单向链表
 *
 * @author <a href="mailto:912547587@qq.com">lihaiming</a>
 * @version 1.0.0
 * @since 2021/10/7 22:21
 **/
public class ListNode {

    int val;
    ListNode next;

    ListNode() {

    }
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
