package com.huawei.medium.removeNthFromEnd;

import com.huawei.common.ListNode;

public class First {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
//        l.next.next = new ListNode(3);
//        l.next.next.next = new ListNode(4);
//        l.next.next.next.next = new ListNode(5);

        removeNthFromEnd(l, 2);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 1;
        ListNode count = head;
        while (count.next != null) {
            size++;
            count = count.next;
        }
        if (size == n) {
            return head.next;
        }

        int pre = size - n;
        ListNode currentNode = head;
        for (int i = 1; i <= pre -1 ; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        return head;
    }
}
