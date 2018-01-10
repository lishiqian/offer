package offer;

/**
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class N009_JumpFloorII {
    //f(n) = f(n-1) + f(n-2) + ... + f(1)
    public int JumpFloorII(int target) {
        if(target <= 0) return -1;
        return 1 << (target-1);
    }
}
