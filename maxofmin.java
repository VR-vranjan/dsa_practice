import java.util.*;
public class maxofmin {

    public static int maxpart(int arr[], int x) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n - x; i++) {
            min = Integer.MAX_VALUE;
            for (int j = i; j < i + x; j++) {
                //finding minimum of elements
                min = Math.min(min, arr[j]);
            }
            max = Math.max(min, max);

        }
        return max;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 2, 1 };
        int x = 1;
        System.out.println(maxpart(arr,x));
    }
}
