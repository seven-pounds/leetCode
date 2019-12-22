package LeetCode.Other;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Num13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    @Test
    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        int res = 0;
        int j = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String temp = s.substring(i, i + 2);
            if (map.containsKey(temp)) {
                res = res + map.get(temp);
                i++;
            } else {
                res = res + map.get(s.substring(i, i + 1));
            }
            j = i;
        }
        if (j == s.length() - 2) res = res + map.get("" + s.charAt(s.length() - 1));
        return res;
    }
}
