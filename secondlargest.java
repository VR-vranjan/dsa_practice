//finding second largest element in an array
class secondlargest {
    public static void second(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int mindiff = Integer.MAX_VALUE;
        int sec=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest) {
                int diff = largest - arr[i];
                if (diff > 0 && diff < mindiff) {
                    mindiff = diff;
                    sec = arr[i];
                }
            }
        }
        System.out.print(sec);
    }

    public static void main(String args[]) {
        int arr[] = { 7, 1, 5, 6, 2 };
        second(arr);

    }
}