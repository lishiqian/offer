package BAT_algorithm.sort;

/**
 * ð������
 * ʱ�临�Ӷȣ�O��n^2��
 * �ռ临�Ӷȣ�O(1)
 */
public class BubbleSort {
    public int[] bubbleSort(int[] A, int n) {
        if(A == null || A.length < 2) return A;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(A[j] > A[j+1]){
                    int t = A[j];
                    A[j] = A[j+1];
                    A[j+1] = t;
                }
            }
        }

        return A;
    }
}
