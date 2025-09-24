public class countoddeven {
    public static void count(int[] arr) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);

    }
    public static void main(String args[]) {
        int[] arr = { 1,2,3,4,5 };
        count(arr);
    }
}
