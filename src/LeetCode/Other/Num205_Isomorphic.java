package LeetCode.Other;

import java.util.HashMap;
import java.util.Map;

public class Num205_Isomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab", "aa"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if ((char) map.get(s.charAt(i)) != t.charAt(i)) return false;

            } else {
                if (map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
            }

        }
        return true;
    }
}
