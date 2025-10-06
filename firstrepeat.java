public class firstrepeat {

    public static int first(int[] arr) {
        boolean found = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                    
                if (arr[i] == arr[j]&&i!=j) {
                found = true;
                index = j;
                break;
                    
            }
        }
    }
        if (found == true) {
            return index;
        } else {
            return -1;
        }
    }
    public static void main(String args[]) {
        int arr[] = { 1, 5, 3, 4, 3, 5, 6 };
        int[] arr2 = { 1, 2, 3, 4 };
        int[] arr3 = { 1, 8, 5, 6, 8, 1, 2 };
        System.out.println(first(arr));
        System.out.println(first(arr2));
        System.out.println(first(arr3));
    }
}
