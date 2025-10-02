import java.util.Arrays;

public class reversearr {
     public static int[] rever(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
        //impo line
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void reverse(int[] arr) {
        int first = 0;
        int last = arr.length-1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        
        
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rever(arr);
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
