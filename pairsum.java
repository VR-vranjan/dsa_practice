public class pairsum {

    public static void sum(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.print("(" + arr[i] + "," + arr[j] + ")");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(count);
        
    }
    public static void main(String args[]) {
        int arr[] = { 1, 5, 7, 1 };
        int arr2[] = { 1, 1, 1, 1 };
        int k = 6;
        int l = 2;
        sum(arr, k);
        sum(arr2, l);
    }
}
