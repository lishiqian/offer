package offer;

import java.util.ArrayList;

/**
 * 题目描述
 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class N019_PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> printList = new ArrayList<Integer>();
        int start = 0;
        int height = matrix.length ;
        int widht = matrix[0].length;
        while (height > 0 && widht > 0) {
            print(matrix, start, height, widht, printList);
            start++;
            height -= 2;
            widht -= 2;
        }

        return printList;
    }

    public void print(int[][] matrix, int start, int height, int width, ArrayList<Integer> printList) {
        for (int i = start; i < start + width; i++) {
            printList.add(matrix[start][i]);
        }

        for (int i = start + 1; i < start + height-1; i++) {
            printList.add(matrix[i][start + width-1]);
        }

        if (height > 1) {
            for (int i = start+width-1; i >= start; i--) {
                printList.add(matrix[start+height-1][i]);
            }
        }

        if (width > 1) {
            for (int i = start + height - 1 -1; i > start; i--) {
                printList.add(matrix[i][start]);
            }
        }
    }
}
