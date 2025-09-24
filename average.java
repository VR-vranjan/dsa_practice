public class average {
    public static float avr(int[] arr) {
        float sum = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println(sum);
        float avg = sum / n;
        return avg;

    }
    public static void main(String args[]) {
        int[] arr = { 5,9,4,1,2,3,7};
        System.out.println(avr(arr));
    }
    
}
