public class transition {
    public static int transitionpt(int arr[]) {
        int transpt = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                transpt = i;
                break;
            }
        }
        
        return transpt;
    }
    public static void main(String args[]) {
        int arr[] = { 0, 0, 0, 1, 1, 0, 0 };
        System.out.println(transitionpt(arr));
    }
}
