package LeetCode.Other;

import java.util.HashMap;
import java.util.Map;

public class Num242_Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        Map map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), (int) map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i))) return false;
            map.put(t.charAt(i), (int) map.get(t.charAt(i)) - 1);
        }
        for (Object ch : map.keySet()) {
            if ((int) map.get(ch) != 0) return false;
        }

        return true;
    }
}
