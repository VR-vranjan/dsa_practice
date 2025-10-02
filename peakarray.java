public class peakarray {
    public static void peak(int[] arr) {
        int peaks[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] > arr[i - 1]) {
                peaks[i] = arr[i];
            }else if (i<arr.length-1&&arr[i]>arr[i+1]) {
                peaks[i] = arr[i];
            } 

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(peaks[i]);
        }
    }
    public static void main(String args[]) {
        int[] arr = { 4, 3, 6, 1 };
        peak(arr);
    }
    
}
