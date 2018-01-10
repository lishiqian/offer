package offer;
/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */

import common.PrintString;
import common.TreeNode;
import org.junit.Test;

public class N017_HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        preOrder(root1,sb1);
        preOrder(root2,sb2);

        return KMP(sb1,sb2) != -1 ? true:false;

    }

    public void preOrder(TreeNode root,StringBuilder sb){
        if(root == null) {
            return;
        }else{
            sb.append(root.val);
            preOrder(root.left,sb);
            preOrder(root.right,sb);
        }
    }


    public int KMP(StringBuilder src,StringBuilder dest){
        if(dest.length() == 0) return -1;
        int[] next = getNext(dest);
        int i = 0,j = 0;
        while (i < src.length() && j < dest.length()){
            if(src.charAt(i) == dest.charAt(j)){
                i++;
                j++;
            }else if(next[j] == -1){
                j = 0;
                i++;
            }else {
                j = next[j];
            }
        }

        if(j == next.length) return i - next.length;
        else return -1;
    }


    public int[] getNext(StringBuilder s){
        if(s.length() == 1) return new int[]{-1};
        if(s.length() == 2) return new int[]{-1,0};
        int[] next = new int[s.length()];
        next[0] = -1;
        next[1] = 0;

        int pos = 2;
        int j = 0;
        while (pos < next.length){
            if(s.charAt(pos-1) == s.charAt(j)){
                next[pos++] = ++j;
            }else if(next[j] == -1){
                pos++;
                j = 0;
            }else{
                j = next[j];
            }
        }
        return next;
    }



    @Test
    public void test(){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb1.append("abcabc");
        sb2.append("caa");

        System.out.println(KMP(sb1,sb2));

    }


}
