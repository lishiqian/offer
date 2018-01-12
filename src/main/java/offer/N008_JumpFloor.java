package offer;

/**
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class N008_JumpFloor {
    public int JumpFloor(int target) {
        if (target <= 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;

        int f1 = 2;
        int f0 = 1;
        while (target-- > 2) {
            f1 = f1 + f0;
            f0 = f1 - f0;
        }

        return f1;
    }
}
