package NEWCode.Company;

public class MeiTuan {
    public static void main(String[] args) {

    }

    public static void test(String str) {
        char[] ch = str.toCharArray();
        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    index = j;
                } else {
                    j++;
                }
            }
            for (int j = i + 1; j < index; j++) {

            }
        }
    }
}
