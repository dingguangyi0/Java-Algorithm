package com.ycdr.algorithm.linked.algo;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(-1);
        ListNode pre = newNode;
        while (l1!=null&&l2!=null){
            if (l1.val<= l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        if (l1 != null) { pre.next = l1; }
        if (l2 != null) { pre.next = l2; }
        return newNode.next;
    }
}
