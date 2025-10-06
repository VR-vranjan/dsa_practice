//for finding only one missing , do the arithmetic sum -summ of array given to get the missing element.


public class missing {

    public static int miss(int[] arr,int n) {
        int missing = 0;
        int sumtilln = n * (n + 1) / 2;
        int sumarr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumarr += arr[i];
        }
        missing = sumtilln - sumarr;
        return missing; 
    }
    public static void main(String args[]) {
        int arr[] = { 5, 6, 7, 8, 9, 4, 3, 10, 1, 11 };
        int arr2[] = { 1, 2, 3, 4, 6, 7, 8, 9 };
        int n = 11;
        int m = 9;
        
        System.out.println(miss(arr, n));
        System.out.println(miss(arr2, m));
        
    }
    
}
