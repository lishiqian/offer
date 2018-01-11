package offer;

import common.TreeNode;
import java.util.ArrayList;

/**
 * 题目描述
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */

public class N024_FindPath {
//    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
//        ArrayList<ArrayList<Integer>> allPath = new ArrayList<ArrayList<Integer>>();
//        ArrayList<Integer> path = new ArrayList<Integer>();
//        findPath(root,target,path,0,allPath);
//        return allPath;
//    }
//
//    public void findPath(TreeNode root, int target,ArrayList<Integer> path,int sum,ArrayList<ArrayList<Integer>> allPath){
//        if(root == null) return;
//        if(root.val + sum == target && root.left == null && root.right == null) {
//            path.add(root.val);
//            allPath.add(new ArrayList<Integer>(path));
//            path.remove(path.size()-1);
//            return;
//        }
//        if(root.val + sum > target) return;
//
//        path.add(root.val);
//        findPath(root.left,target,path,sum + root.val,allPath);
//        findPath(root.right,target,path,sum + root.val,allPath);
//        path.remove(path.size()-1);
//    }



    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> allPath = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        findPath(root,target,path,allPath);
        return allPath;
    }

    public void findPath(TreeNode root, int target,ArrayList<Integer> path,ArrayList<ArrayList<Integer>> allPath){
        if(root == null) return;
        target = target - root.val;
        if(target < 0) return;
        if(target == 0 && root.left == null && root.right == null) {
            path.add(root.val);
            allPath.add(new ArrayList<Integer>(path));
            path.remove(path.size()-1);
            return;
        }
        path.add(root.val);
        findPath(root.left,target,path,allPath);
        findPath(root.right,target,path,allPath);
        path.remove(path.size()-1);
    }
}
