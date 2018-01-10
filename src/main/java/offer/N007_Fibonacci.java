package offer;

import org.junit.Test;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 */
public class N007_Fibonacci {
    public int Fibonacci(int n) {
        if(n <= 0) return 0;
        int f1 = 1;
        int f2 = 1;
        while (n-- > 2){
            f1 = f1 + f2;
            f2 = f1 - f2;
        }

        return f1;
    }

    //传统递归
//    public int Fibonacci(int n) {
//        if(n <= 0) return 0;
//        if(n == 1 || n == 2) return 1;
//        return Fibonacci(n-1) + Fibonacci(n-2);
//    }

    @Test
    public void test(){
        System.out.println(Fibonacci(5));
    }
}
