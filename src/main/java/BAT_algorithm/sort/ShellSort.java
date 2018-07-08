package BAT_algorithm.sort;

/**
 * ϣ������
 * ʱ�临�Ӷȣ�O(n*logn)-O��n^2��
 * �ռ临�Ӷȣ�O(1)
 */
public class ShellSort {
    public int[] shellSort(int[] A, int n) {
        if(A == null) return null;

        int feet = n/2;
        while (feet > 0){
            for (int i = feet; i < n; i++) {
                int index = i;
                while (index >= feet){
                    if(A[index - feet] > A[index]){
                        swap(A,index-feet,index);
                        index -= feet;
                    }else {
                        break;
                    }
                }
            }

            feet /= 2;
        }

        return A;
    }

    public void swap(int[] A,int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
