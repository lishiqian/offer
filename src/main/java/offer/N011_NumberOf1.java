package offer;

import org.junit.Test;

/**
 * 题目描述
 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class N011_NumberOf1 {
    public int NumberOf1(int n) {
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            if((n & (1 << i)) != 0) sum++;
        }
        return sum;
    }

    @Test
    public void test(){
        System.out.println(NumberOf1(20));
        System.out.println(NumberOf1(-20));
    }
}
