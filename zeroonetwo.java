public class zeroonetwo {

    public static void sort(int[] arr, int n) {
        
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;

            } else if (arr[i] == 1) {
                count1++;

            } else {
                count2++;
            }

            
        }
        int i = 0;
        while (count0 > 0) {
            arr[i] = 0;
            i++;
            count0--;
        }
        while (count1 > 0) {
            arr[i] = 1;
            i++;
            count1--;
        }
        while (count2 > 0) {
            arr[i] = 2;
            i++;
            count2--;
        }
        
    }
    public static void main(String args[]) {
        int arr[] = { 0, 2, 1, 0, 1 };
        int n = 5;
        sort(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    
}
