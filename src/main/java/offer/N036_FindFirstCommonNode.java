package offer;

import common.ListNode;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class N036_FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;

        int len1 = 0,len2 = 0;

        while (cur1 != null){
            cur1 = cur1.next;
            len1++;
        }

        while (cur2 != null){
            cur2 = cur2.next;
            len2++;
        }

        cur1 = pHead1;
        cur2 = pHead2;

        if(len1 > len2){
            int d = len1 - len2;
            for (int i = 0; i < d; i++) {
                cur1 = cur1.next;
            }
        }else{
            int d = len2 - len1;
            for (int i = 0; i < d; i++) {
                cur2 = cur2.next;
            }
        }

        while (cur1 != null){
            if(cur1 == cur2) return cur1;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        return null;
    }
}
