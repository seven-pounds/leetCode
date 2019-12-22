package NEWCode.Offer;

public class Num44_ReverseSentence {
    public static void main(String[] args) {
        System.out.println(ReverseSentence("student. a am I").toString());
    }

    public static String ReverseSentence(String str) {
        char[] ch = str.toCharArray();
        reverse(ch, 0, ch.length - 1);
        int start = 0;
        int end = 0;
        while (end < ch.length) {
            if (ch[end] == ' ') {
                reverse(ch, start, end - 1);
                if (end == ch.length - 1) break;
                start = end + 1;
                end = end + 1;
            } else {
                end++;
            }
        }
        reverse(ch, start, end - 1);
        return new String(ch);
    }

    public static void reverse(char[] ch, int start, int end) {
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

    }
}
