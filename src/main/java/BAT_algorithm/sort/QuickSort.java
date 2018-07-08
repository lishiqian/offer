package BAT_algorithm.sort;

/**
 * 快速排序
 * 时间复杂度：O(n*logn) - O（n^2）
 * 空间复杂度：O(logn)
 */
public class QuickSort {
    public int[] quickSort(int[] A, int n) {
        quickSort(A,0,n-1);
        return A;
    }

    public void quickSort(int[] A, int left,int right){
        if(left < right){
            int mid = partition(A,left,right);
            quickSort(A,left,mid-1);
            quickSort(A,mid+1,right);
        }
    }

    public int partition(int[] A,int left,int right){
        while (left < right){
            while (left < right && A[left] < A[right]) left++;
            if(left < right){
                swap(A,left,right);
                right--;
            }
            while (left < right && A[left] < A[right]) right--;
            if(left < right){
                swap(A,left,right);
                left++;
            }
        }

        return left;
    }

    public void swap(int[] A,int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
