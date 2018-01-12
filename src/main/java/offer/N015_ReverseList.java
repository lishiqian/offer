package offer;

import common.ListNode;

/**
 * 题目描述
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class N015_ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode reserHead = new ListNode(0);
        while (head != null) {
            ListNode next = head.next;

            head.next = reserHead.next;
            reserHead.next = head;

            head = next;
        }

        return reserHead.next;
    }
}
