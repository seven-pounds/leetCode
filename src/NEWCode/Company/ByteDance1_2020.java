package NEWCode.Company;

public class ByteDance1_2020 {
    public static void main(String[] args) {
        String str = "I am Student.";
        String res = ReverseSentence(str.toCharArray());
        System.out.println(res);
    }

    public static String ReverseSentence(char[] chars) {
        if (chars == null || chars.length <= 0)
            return String.valueOf(chars);
        //翻转整个句子
        reverseSb(chars, 0, chars.length - 1);
        //翻转单词（指针指向单词的第一个和最后一个）
        int start = 0;
        int end = 0;
        while (start < chars.length) {
            while (end < chars.length && chars[end] != ' ')
                end++;
            reverseSb(chars, start, end - 1);
            start = ++end;
        }

        return String.valueOf(chars);
    }

    private static void reverseSb(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
