package LeetCode.Other;

public class Num58 {
    public int lengthOfLastWord(String s) {
        String [] strings=s.split(" ");
        int len=strings.length;
        return strings[len-1].length();
    }
}
