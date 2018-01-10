package common;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
	public int val = 0;
	public TreeNode left = null;
	public TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
    
    /**
     * 创建二叉树，当遇到0默认为空节点
     */
    public static TreeNode create(String input){
    	Queue<String> queue = new LinkedList<String>();
		String[] split = input.split("!");
		for (int i = 0; i < split.length; i++) {
			queue.offer(split[i]);
		}
		return createImpl(queue);
    }

    private static TreeNode createImpl(Queue<String> queue){
    	if(queue.isEmpty()) return null;
		String data = queue.poll();
		if("#".equals(data)) return null;
    	TreeNode node = new TreeNode(Integer.parseInt(data));
    	node.left = createImpl(queue);
    	node.right = createImpl(queue);
    	return node;
    }
}
