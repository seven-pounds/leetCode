package LeetCode.Recursion8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Num93 {
    ArrayList<String> output = new ArrayList<String>();

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        int n = s.length();

        return res;
    }

    public void backtrack(String str, int pos, int len, LinkedList<String> list) {
        String segment = "";
        if (list.size() == 4) {
            System.out.println(list);
            list.removeLast();
        }
        while (len > 0) {
            segment = str.substring(pos, pos + 1);
            if (isValid(segment)) {
                list.add(segment);
                backtrack(str, pos + 1, len - 1, list);
            } else {
                list.removeLast();
            }
        }
    }

    private boolean isValid(String segment) {
        int m = segment.length();
        if (m > 3)
            return false;
        return (segment.charAt(0) != '0') ? (Integer.valueOf(segment) <= 255) : (m == 1);
    }
}
