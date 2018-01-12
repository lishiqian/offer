package offer;

import org.junit.Test;

/**
 * 题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class N012_Power {
    public double Power(double base, int exponent) {
        double res = 1;

        boolean flag = false;
        if (exponent < 0) {
            flag = true;
            exponent = -exponent;
        }

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                res *= base;
            }
            base *= base;
            exponent = exponent >>> 1;
        }

        return flag ? 1 / res : res;
    }

    @Test
    public void test() {
        System.out.println(Power(2.0, 3));
        System.out.println(Power(2.0, -3));
    }
}
