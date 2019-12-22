package LeetCode.Other;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Num202_HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        Map map = new HashMap();
        Boolean flag = true;
        while (flag) {
            double num = 0;
            while (n > 0) {
                num = Math.pow(n % 10, 2) + num;
                n = n / 10;
            }
            if (num == 1) return true;
            if (map.containsKey(num)) return false;
            map.put(num, 1);
            n = (int) num;
        }
        return true;
    }
}
