package offer;

import common.RandomListNode;

import java.util.HashMap;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
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
