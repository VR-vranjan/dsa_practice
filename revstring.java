//3 ways of doing string reverse


public class revstring {
    public static void rev(String str) {
        String reverse = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void re(String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder bs = new StringBuilder();
        sb.reverse();
        System.out.println(sb.toString());
        for (int i = str.length() - 1; i >= 0; i--) {
            bs.append(str.charAt(i));
        }
        System.out.println(bs.toString());
        
    }
    public static void main(String args[]) {
        String str = "hello world";
        rev(str);
        re(str);

    }
}
