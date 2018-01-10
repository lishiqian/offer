package offer;

/**
 *
 * 题目描述
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class N002_StrSpaceReplace {
    public String replaceSpace(StringBuffer str) {
        StringBuilder resStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                resStr.append('%');
                resStr.append('2');
                resStr.append('0');
            }else{
                resStr.append(str.charAt(i));
            }
        }

        return resStr.toString();
    }
}
