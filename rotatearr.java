public class rotatearr {
    public static void rotate(int arr[], int d) {

        int n = arr.length;
        int[] res = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            
            res[i] = arr[(i + d) % n];
        }
        
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int e = 3;
        int d = 2;
        rotate(arr, d);
        rotate(arr2, e);
    }
}
