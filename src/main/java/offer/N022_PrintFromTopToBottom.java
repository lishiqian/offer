package offer;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目描述
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class N022_PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> orderList = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            orderList.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        return orderList;
    }
}
