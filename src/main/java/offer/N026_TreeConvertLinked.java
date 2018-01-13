package offer;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class N026_TreeConvertLinked {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        midOrder(pRootOfTree,queue);

        TreeNode head = null;
        TreeNode cur = null;
        while (!queue.isEmpty()){
            if(head == null){
                head = queue.poll();
                cur = head;
            }else{
                cur.right = queue.peek();
                queue.peek().left = cur;
                cur = queue.poll();
            }
        }
        return head;
    }

    public void midOrder(TreeNode node, Queue<TreeNode> queue){
        if(node == null) return;
        midOrder(node.left,queue);
        queue.offer(node);
        midOrder(node.right,queue);
    }
}
