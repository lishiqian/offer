package offer;

import java.util.Stack;

/**
 * 题目描述
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class N020_StackMin {

    Stack<Integer> stackData = new Stack<Integer>();
    Stack<Integer> stackMin = new Stack<Integer>();

    public void push(int node) {
        if (stackMin.isEmpty()) {
            stackMin.push(node);
        } else {
            if (node < stackMin.peek()) {
                stackMin.push(node);
            } else {
                stackMin.push(stackMin.peek());
            }
        }
        stackData.push(node);
    }

    public void pop() {
        stackData.pop();
        stackMin.pop();
    }

    public int top() {
        return stackData.peek();
    }

    public int min() {
        return stackMin.peek();
    }

}
