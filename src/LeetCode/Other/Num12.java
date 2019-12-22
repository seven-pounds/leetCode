package LeetCode.Other;

import java.util.HashMap;
import java.util.Map;

public class Num12 {
    Map<String, String> phone = new HashMap<String, String>() {{
        put("1", "I");
        put("5", "V");
        put("10", "X");
        put("50", "L");
        put("100", "C");
        put("500", "D");
        put("1000", "M");
        put("4", "IV");
        put("9", "IX");
        put("40", "XL");
        put("90", "XC");
        put("400", "CD");
        put("900", "CM");
    }};

    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};  // 罗马数字
        int[] arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};  // 阿拉伯数字
        int index = 0;
        while (num > 0) {
            int count = num / arab[index];
            while (count-- > 0) {
                ans.append(roman[index]);
            }
            num %= arab[index];
            index++;
        }
        return ans.toString();
    }
}
