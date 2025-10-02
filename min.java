public class min {
    public static int mini(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        int arr[] = { 89, 56, 45, 78, 2, 1, 4, 5 };
        System.out.println(mini(arr));
    }
    
}
