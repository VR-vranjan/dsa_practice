import java.util.*;

public class removedupli {

    public static void rem(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if ( i==0||arr[i] != arr[i - 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        int[] result = Arrays.copyOf(temp, j);
        System.out.println(Arrays.toString(result));

    }
    public static void main(String args[]) {
        int[] arr = { 1, 2, 2, 3, 3,0,0, 3, 4, 5 };
        rem(arr);
    }
    
}
