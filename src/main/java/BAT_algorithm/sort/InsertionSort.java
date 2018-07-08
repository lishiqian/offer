package BAT_algorithm.sort;

/**
 * 插入排序
 * 直接插入排序基本思想是每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
 *
 * 时间复杂度：O(n) - O（n^2）
 * 空间复杂度：O(1)
 */
public class InsertionSort {
    public int[] insertionSort(int[] A, int n) {
        if(A == null || A.length < 2) return A;

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && A[j] < A[j-1]){
                int t = A[j];
                A[j] = A[j-1];
                A[j-1] = t;
                j--;
            }
        }

        return A;
    }
}
