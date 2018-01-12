package offer;

import common.ListNode;
import org.junit.Test;

/**
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class N014_FindKthToTail {
//    public ListNode FindKthToTail(ListNode head, int k) {
//        //得到链表长度
//        int len = 0;
//        ListNode cur = head;
//        while (cur != null){
//            len++;
//            cur = cur.next;
//        }
//
//        if(len < k) return null;
//        cur = head;
//        for (int i = len-k; i > 0; i--) {
//            cur = cur.next;
//        }
//        return cur;
//    }

    public ListNode FindKthToTail(ListNode head, int k) {
        //得到链表长度
        int len = 0;
        //一个指针先走K步
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            if (cur == null) return null;
            cur = cur.next;
        }

        ListNode pre = head;
        while (cur != null) {
            cur = cur.next;
            pre = pre.next;
        }

        return pre;
    }

    @Test
    public void test() {
        ListNode creat = ListNode.creat(new int[]{1, 2, 3, 4, 5});
        System.out.println(FindKthToTail(creat, 1).val);
    }
}
