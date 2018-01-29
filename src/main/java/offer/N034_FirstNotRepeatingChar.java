package offer;

/**
 * 题目描述
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
public class N034_FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        int[] map = new int[256];
        for (int i = 0; i < str.length(); i++) {
            map[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if(map[str.charAt(i)] == 1) return i;
        }

        return -1;
    }
}
