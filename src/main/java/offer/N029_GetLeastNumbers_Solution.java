package offer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 题目描述
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class N029_GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> resList = new ArrayList<Integer>();
        if(k > input.length) return resList;

        for (int i = input.length/2-1; i >= 0; i--) {
            adjust(input,i,input.length);
        }



        for (int i = 0; i < k; i++) {
            resList.add(input[0]);
            swap(input,0,input.length-i-1);
            adjust(input,0,input.length-i-1);
        }
        return resList;
    }

    public void adjust(int [] arr,int parent, int length){
        int temp = arr[parent];
        int child = parent * 2 + 1;

        while (child < length){
            if(child + 1 < length && arr[child] > arr[child+1]){
                child++;
            }

            if(temp <= arr[child]) break;

            arr[parent] = arr[child];

            parent = child;
            child = child * 2 + 1;
        }
        arr[parent] = temp;
    }

    public void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    @Test
    public void test(){
        GetLeastNumbers_Solution(new int[]{4,5,1,6,2,7,3,8},4);
    }
}
