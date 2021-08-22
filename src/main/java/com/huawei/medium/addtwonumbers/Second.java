package com.huawei.medium.addtwonumbers;

import com.huawei.common.ListNode;

public class Second {


    public static void main(String[] args) {

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode currentNode = result;
        while (l1 != null || l2 != null) {
            ListNode next;
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 :l2.val) + currentNode.val;

            if (sum / 10 > 0) {
                next = new ListNode(sum / 10);
                currentNode.val = sum % 10;
            }else {
                next = new ListNode(0);
                currentNode.val = sum;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            if (l1 == null && l2 == null) {
                if (next.val != 0) {
                    currentNode.next = next;
                }
                break;
            }
            currentNode.next = next;
            currentNode = next;
        }
        return result;
    }


}
