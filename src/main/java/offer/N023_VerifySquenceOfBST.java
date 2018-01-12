package offer;

import org.junit.Test;

/**
 * 题目描述
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class N023_VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        if (sequence.length == 1) return true;
        return verity(sequence, 0, sequence.length - 1);
    }

    public boolean verity(int[] sequence, int start, int end) {
        if (start >= end) return true;
        int pos = end - 1;
        //确定根节点的左右孩子的区分点
        while (pos > start && sequence[pos] > sequence[end]) pos--;

        //左子树的序列都要比根节点小 否则就不是二叉搜索树后续遍历
        for (int i = start; i < pos; i++) {
            if (sequence[i] > sequence[end]) return false;
        }

        return verity(sequence, start, pos) && verity(sequence, pos + 1, end - 1);
    }

    @Test
    public void test() {
        System.out.println(VerifySquenceOfBST(new int[]{5, 4, 3, 2, 1}));
    }
}
