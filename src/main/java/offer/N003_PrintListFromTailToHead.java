package offer;

import common.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class N003_PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> resList = new ArrayList<Integer>();
        print2(resList,listNode);
        return resList;
    }

    /**
     *  函数递归
     */
    private void print(ArrayList<Integer> resList,ListNode root){
        if(root == null) return;

        print(resList,root.next);
        resList.add(root.val);
    }

    /**
     *  使用栈
     */
    private void print2(ArrayList<Integer> resList,ListNode root){
        Stack<ListNode> stack = new Stack<ListNode>();

        while (root != null){
            stack.push(root);
            root = root.next;
        }

        while (!stack.isEmpty()){
            resList.add(stack.pop().val);
        }
    }
}
