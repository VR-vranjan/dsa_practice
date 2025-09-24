public class posnegzero {
    public static void count(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.println("count is:" + pos + "," + neg + "," + zero);
    }
    public static void main(String args[]) {
        int arr[] = { 5, 6, -78, -12, -56, 36,0 };
        count(arr);
    }
}
