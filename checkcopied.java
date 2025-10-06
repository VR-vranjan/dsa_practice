import java.util.Arrays;

public class checkcopied {

    public static int check(String str, String str2) {
        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String res1 = new String(arr1);
        String res2 = new String(arr2);
        if (res1.equals(res2)) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String args[]) {
        String str = "aPPLe";
        String str2 = "epLpa";
        System.out.println(check(str,str2));
    }
}