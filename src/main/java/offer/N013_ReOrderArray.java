package offer;

import org.junit.Test;

/**
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class N013_ReOrderArray {
    //插入排序
    public void reOrderArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                int j = i;
                while (j > 0 && array[j - 1] % 2 == 0) {
                    swap(array, j, j - 1);
                    j--;
                }
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Test
    public void test() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        reOrderArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
