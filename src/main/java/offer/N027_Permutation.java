package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 题目描述
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class N027_Permutation {
//    //递归
//    public ArrayList<String> Permutation(String str) {
//        ArrayList<String> permutations = new ArrayList<String>();
//        if(str == null || str.length() == 0) return permutations;
//        char[] ch = str.toCharArray();
//        Permutation(ch,0,permutations);
//        Collections.sort(permutations);
//        return permutations;
//    }
//
//    //递归方式
//    public void Permutation(char[] ch,int begin,ArrayList<String> permutations){
//        if(begin == ch.length){
//            permutations.add(new String(ch));
//            return;
//        }
//
//        for (int i = begin; i < ch.length; i++) {
//            if(i == begin || ch[begin] != ch[i]){
//                swap(ch,begin,i);
//                Permutation(ch,begin+1,permutations);
//                swap(ch,i,begin);
//            }
//        }
//    }
//
//



    //非递归
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> permutations = new ArrayList<String>();
        if(str == null || str.length() == 0) return permutations;
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        Permutation(ch,permutations);
        return permutations;
    }


    public void Permutation(char[] ch,ArrayList<String> permutations){
        boolean endFlag = false;

        while (!endFlag) {


            for (int i = ch.length - 1; i > 0; i--) {
                if (ch[i] > ch[i-1]){
                    swap(ch,i,i-1);
                    reverse(ch,ch.length-1,i);
                }
            }
        }
    }

    public void reverse(char[] ch,int start,int end){
        char temp;
        while (start < end){
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
    }

    public void swap(char[] ch,int i,int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}
