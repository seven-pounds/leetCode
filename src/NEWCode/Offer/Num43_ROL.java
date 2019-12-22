package NEWCode.Offer;

public class Num43_ROL {
    public static void main(String[] args) {
        System.out.println(LeftRotateString("abcXYZdef", 3));
    }

    public static String LeftRotateString(String str, int n) {
        if (str.length() == 0) return "";
        String res = str;
        n = n % str.length();
        while (n > 0) {
            res = res.substring(1, res.length()) + res.charAt(0);
            System.out.println(res);
            n--;
        }
        return res;
    }
}
