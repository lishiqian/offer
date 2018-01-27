package offer;

import java.util.ArrayList;

/**
 * 题目描述
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数
 */
public class N033_GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index == 0) return 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);

        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        while (list.size() < index){
            int r2 = list.get(i2) * 2;
            int r3 = list.get(i3) * 3;
            int r5 = list.get(i5) * 5;

            int min = Math.min(Math.min(r2,r3),r5);
            list.add(min);

            if(min == r2) i2++;
            if(min == r3) i3++;
            if(min == r5) i5++;
        }

        return list.get(index-1);
    }
}
