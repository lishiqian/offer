package BAT_algorithm.sort;

/**
 * 归并排序
 * 归并排序是一种稳定的排序
 * 时间复杂度：O(n*logn)
 * 空间复杂度：O(n)
 */
public class MergeSort {
    public int[] mergeSort(int[] A, int n) {
        if(A == null || A.length < 2) return A;
        mergeSort(A,0,n-1);
        return A;
    }

    public void mergeSort(int[] A, int left,int right){
        if(left == right) return;
        int mid = (left + right) / 2;
        mergeSort(A, left, mid);
        mergeSort(A, mid + 1, right);
        merge(A,left,mid,right);

    }

    public void merge(int[] A, int left,int mid,int right){
        int[] help = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right){
            if(A[i] < A[j]){
                help[t++] = A[i++];
            }else{
                help[t++] = A[j++];
            }
        }

        while (i <= mid){
            help[t++] = A[i++];
        }

        while (j <= right){
            help[t++] = A[j++];
        }

        for (int k = 0; k < help.length; k++) {
            A[left + k] = help[k];
        }
    }


//    public int[] mergeSort(int[] A, int n) {
//        // write code here
//        mergeSort(A,new int[n],n-1);
//        return A;
//    }
//
//    private static void merger(int arr[], int[] newArr, int low, int mid, int high) {
//        int i = low, j = mid + 1, k = low;
//        while (i <= mid && j <= high) {
//            if (arr[i] < arr[j])
//                newArr[k++] = arr[i++];
//            else
//                newArr[k++] = arr[j++];
//        }
//
//        // 收尾处理
//        if (i <= mid) {
//            while (i <= mid) {
//                newArr[k++] = arr[i++];
//            }
//        }
//        else {
//            while (j <= high) {
//                newArr[k++] = arr[j++];
//            }
//        }
//    }
//    /**
//     *
//     * <p>Title: mergePass</p>
//     * <p>Description: 归并</p>
//     * @param arr  源数据
//     * @param newArr 临时存放的数据
//     * @param n 数值的为索引，即数组长度-1
//     * @param h 归并两个集合中一个的长度
//     */
//    private static void mergePass(int arr[],int newArr[],int n,int h){
//        int i = 0;
//        while(i <= n- 2*h + 1){
//            merger(arr, newArr, i, i+h-1,i+2*h-1);
//            i += 2 * h;
//        }
//
//        //尾部的归并处理
//        if(i<n-h+1) merger(arr, newArr, i, i+h-1, n);
//        else{
//            for (int j = i; j <= n; j++) {
//                newArr[j] = arr[j];
//            }
//        }
//
//
//
//    }
//
//    public static void mergeSort(int[] arr,int[] newArr,int n){
//        int h = 1;
//        while(h < n+1){//这里出现问题
//            mergePass(arr, newArr, n, h);
//            h = h * 2;
//            mergePass(newArr, arr, n, h);
//            h = h * 2;
//        }
//    }
}
