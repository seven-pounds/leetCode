package LeetCode.Array3;

import java.util.HashMap;
import java.util.Map;

public class Num76 {
    public static void main(String[] args) {
        System.out.println(minWindow("EBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {
        int i = 0;
        int j = s.length() - 1;
        String res = s;
        while (i < j) {
            if (isContain(s, t)) {
                res = s;
                s = s.substring(i++, j);
            }
        }
        return res;
    }

    public static boolean isContain(String s, String t) {
        Map map = new HashMap();
        if (s.length() < t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), (int) map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i)) && (int) map.get(t.charAt(i)) == 0) {
                return false;
            } else {
                map.put(t.charAt(i), (int) map.get(t.charAt(i)) - 1);
            }
        }
        return true;
    }
}
