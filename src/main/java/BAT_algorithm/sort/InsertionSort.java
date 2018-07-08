package BAT_algorithm.sort;

/**
 * ��������
 * ֱ�Ӳ����������˼����ÿһ����һ��������ļ�¼�����뵽ǰ���Ѿ��ź��������������ȥ��ֱ����������Ԫ��Ϊֹ��
 *
 * ʱ�临�Ӷȣ�O(n) - O��n^2��
 * �ռ临�Ӷȣ�O(1)
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
