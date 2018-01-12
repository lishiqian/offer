package offer;

import common.RandomListNode;

import java.util.HashMap;

public class N025_ComplexLinkedClone {

    //复制拆分法
//    public RandomListNode Clone(RandomListNode pHead) {
//        if(pHead == null) return null;
//        RandomListNode cur = pHead;
//
//        //复制当前结点插入当前节点后面
//        while (cur != null){
//            RandomListNode copyNode = new RandomListNode(cur.label);
//            copyNode.next = cur.next;
//            cur.next = copyNode;
//            cur = cur.next.next;
//        }
//
//        //随机指针的复制
//        cur = pHead;
//        while (cur != null){
//            if(cur.random != null) {
//                cur.next.random = cur.random.next;
//            }
//            cur = cur.next.next;
//        }
//
//        //拆分链表
//        RandomListNode copyHead = pHead.next;
//        RandomListNode copyCur = copyHead;
//        cur = pHead;
//        while (cur != null){
//            cur.next = cur.next.next;
//            if(copyCur.next != null){
//                copyCur.next = copyCur.next.next;
//            }else{
//                copyCur.next = null;
//            }
//            cur = cur.next;
//            copyCur = copyCur.next;
//        }
//
//        return copyHead;
//    }

    //hash表法
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        // k 原节点 v 复制节点
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode cur = pHead;
        RandomListNode copyHead = null;
        RandomListNode curCopy = null;

        while (cur != null) {
            if (copyHead == null) {
                curCopy = new RandomListNode(cur.label);
                copyHead = curCopy;
            } else {
                curCopy.next = new RandomListNode(cur.label);
                curCopy = curCopy.next;
            }
            map.put(cur, curCopy);
            cur = cur.next;
        }


        cur = pHead;
        curCopy = copyHead;
        while (cur != null) {
            curCopy.random = map.get(cur.random);
            cur = cur.next;
            curCopy = curCopy.next;
        }

        return copyHead;
    }
}
