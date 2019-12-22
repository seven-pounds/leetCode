package NEWCode.Company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T360 {
    public static void main(String[] args) {
        String str = "aba";
        combine(str);


    }

    public static void combine(String string) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Map map = new HashMap();
        for (int i = 1; i <= string.length(); i++) {
            for (int j = 0; j <= string.length() - i; j++) {
                if (map.containsKey(string.substring(j, j + i))) {
                    map.put(string.substring(j, j + i), (Integer) map.get(string.substring(j, j + i)) + 1);
                } else {
                    map.put(string.substring(j, j + i), 1);
                }

            }
        }
        int max = 0;
        for (Object key : map.keySet()) {
            if ((int) map.get(key) > max) {
                max = (int) map.get(key);
            }
        }
        System.out.println(max);

    }


}
