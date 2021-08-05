package com.ycdr.algorithm.linked.algo;

/**
 * 反转链表
 *
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode pre=null;
        while (curr!=null) {
            ListNode tmp = curr.next;
            curr.next=pre;
            pre=curr;
            curr=tmp;
        }
        return pre;
    }
}
