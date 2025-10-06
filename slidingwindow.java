public class slidingwindow {

    public static int sumofslide(int[] arr, int x) {

        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i <= n - x; i++) {
            //reset sum for each window to 0
            int sum = 0;
            for (int j = i; j < i + x; j++) {
                sum += arr[j];
            }
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        return maxsum;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 2, 1 };
        int x = 2;
        System.out.println(sumofslide(arr, x));
    }
}
//output:
//[1,2]=>sum=3,maxsum=3
//[2,3]=>sum=5,maxsum=5
//[3,2]=>sum=5,maxsum=5
//[2,1]=>sum=3,maxsum=5

//therefore output maxsum of all windows:5
