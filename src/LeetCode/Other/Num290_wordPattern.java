package LeetCode.Other;

import java.util.HashMap;
import java.util.Map;

public class Num290_wordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abb", "dog cat cat"));
    }

    public static boolean wordPattern(String pattern, String str) {
        Map map = new HashMap();
        String[] arr = str.split(" ");
        if (pattern.length() != arr.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                System.out.println(map.get(pattern.charAt(i)) + "  " + arr[i]);
                if (!map.get(pattern.charAt(i)).equals(arr[i])) return false;

            } else {
                if (map.containsValue(arr[i])) return false;
                map.put(pattern.charAt(i), arr[i]);
            }
        }
        return true;
    }
}
