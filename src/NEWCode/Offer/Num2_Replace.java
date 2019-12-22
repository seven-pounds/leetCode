package NEWCode.Offer;

public class Num2_Replace {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("We Are Happy.");
        System.out.println(replaceSpace(stringBuffer));
    }

    public static String replaceSpace(StringBuffer str) {
        String res = "";
        int count = 0;
        char[] chars = str.toString().toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' ') {
                count++;
            }
        }
        char[] newchar = new char[len + 2 * count];
        for (int i = newchar.length - 1; i >= 0; i--) {
            int num = 2 * count;
            if (chars[i - num] != ' ') {
                newchar[i] = chars[i - num];
                continue;
            } else {
                newchar[i--] = '0';
                newchar[i--] = '2';
                newchar[i] = '%';
            }
            count--;
        }
        for (int i = 0; i < newchar.length; i++) {
            res = res + newchar[i];
        }
        return res;


    }
}
