package NEWCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PDD2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        Map temp = new HashMap();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            Integer dec = sc.nextInt();
            map.put(value, dec);
            temp.put(value, dec);
        }
        while (temp.size() > m) {
            removeMaxOne(map, temp);
            removeMaxOne(map, temp);
            for (Object key : map.keySet()) {
                if ((Integer) key != -1 && (Integer) key != 0) {
                    if ((Integer) key - (Integer) map.get(key) <= 0) {
                        map.put(0, (Integer) map.get(key));
                    } else {
                        map.put((Integer) key - (Integer) map.get(key), (Integer) map.get(key));
                    }

                }
            }
        }
        for (Object key : map.keySet()) {
            System.out.println(key);
        }

    }

    public static void removeMaxOne(Map map, Map temp) {
        int max1 = Integer.MIN_VALUE;
        for (Object key : temp.keySet()) {
            if ((Integer) key > max1) max1 = (Integer) key;
            if ((Integer) key == max1) {
                if ((Integer) map.get(key) > (Integer) map.get(max1)) max1 = (Integer) key;
            }
        }
        System.out.println(max1);
        temp.remove(max1);
        map.put(-1, map.get(max1));
    }
}
