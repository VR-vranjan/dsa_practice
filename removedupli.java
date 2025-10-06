import java.util.*;

public class removedupli {

    public static void rem(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;  
            for (int j = 0; j < i;j++) {   
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 2,2,3,1,3,2};
        rem(arr);
    }
}
