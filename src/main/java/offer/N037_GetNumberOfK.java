package offer;

/**
 * 题目描述
 * 统计一个数字在排序数组中出现的次数。
 */
public class N037_GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0) return 0;
        int start = 0,end = array.length-1;
        int mid = 0;
        while (start < end){
            mid = (start + end)/2;
            if(array[mid] > k){
                end = mid-1;
            }else if(array[mid] < k){
                start = mid+1;
            }else {
                break;
            }
        }

        if(mid == -1 || array[mid] != k) return 0;
        int sum = 1;
        for (int i = mid+1; i < array.length && array[i] == k; i++) {
            sum++;
        }

        for (int i = mid-1; i >= 0 && array[i] == k; i--) {
            sum++;
        }

        return sum;
    }
}
