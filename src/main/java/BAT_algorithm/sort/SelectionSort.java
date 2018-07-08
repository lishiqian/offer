package BAT_algorithm.sort;

/**
 * 选择排序
 * 选择排序也是一种简单直观的排序算法。
 * 它的工作原理很容易理解：初始时在序列中找到最小（大）元素，放到序列的起始位置作为已排序序列；
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 *
 *　注意选择排序与冒泡排序的区别：冒泡排序通过依次交换相邻两个顺序不合法的元素位置，从而将当前最小（大）元素放到合适的位置；
 * 而选择排序每遍历一次都记住了当前最小（大）元素的位置，最后仅需一次交换操作即可将其放到合适的位置。
 *
 * 时间复杂度：O（n^2）
 * 空间复杂度：O(1)
 */
public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        if(A == null || A.length < 2) return A;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(A[minIndex] > A[j]){
                    minIndex = j;
                }
            }

            int t = A[i];
            A[i] = A[minIndex];
            A[minIndex] = t;
        }

        return A;
    }
}
