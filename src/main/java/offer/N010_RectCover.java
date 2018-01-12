package offer;

/**
 * 题目描述
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class N010_RectCover {
    public int RectCover(int target) {
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
