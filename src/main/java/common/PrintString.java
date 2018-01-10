package common;

public class PrintString {
    public static String print(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                sb.append(arr[i]);
            }else{
                sb.append(',');
                sb.append(arr[i]);
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
