package offer;

import org.junit.Test;

import java.util.Stack;

/**
 * 题目描述
 *输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 *例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 *（注意：这两个序列的长度是相等的）
 */
public class N021_IsPopOrder {
//    public boolean IsPopOrder(int [] pushA,int [] popA) {
//        Stack<Integer> stack = new Stack<Integer>();
//        int pushIndex = 0;
//        int popIndex = 0;
//
//        while (popIndex < popA.length && pushIndex < pushA.length){
//            //入栈
//            while (pushIndex < pushA.length && (stack.isEmpty() || popA[popIndex] != stack.peek())){
//                stack.push(pushA[pushIndex++]);
//            }
//            //出栈
//            while (popIndex < popA.length && popA[popIndex] == stack.peek() && !stack.isEmpty()){
//                stack.pop();
//                popIndex++;
//            }
//
//        }
//
//        return stack.isEmpty();
//    }

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<Integer>();
        int popIndex = 0;

        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && popIndex < popA.length && stack.peek() == popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }

    @Test
    public void test(){
        System.out.println(IsPopOrder(new int[]{1,2,3,4,5},new int[]{5,4,3,2,1}));
        System.out.println(IsPopOrder(new int[]{1},new int[]{1}));
        System.out.println(IsPopOrder(new int[]{1,2,3,4,5},new int[]{2,1,3,4,5}));
    }
}
