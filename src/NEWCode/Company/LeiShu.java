package NEWCode.Company;

import java.util.HashMap;
import java.util.Map;

public class LeiShu {
    public static void main(String[] args) {
        String str = "akbcbbdeae";
        System.out.println(solution(str));

    }

    public static int caculate(String str) {
        char[] ch = str.toCharArray();
        int len = ch.length;
        int max = 0;

        for (int i = 0; i < len; i++) {
            Map map = new HashMap();
            map.put(ch[i], 1);
            for (int j = i + 1; j < len; j++) {
                if (map.containsKey(ch[j])) {

                    break;
                } else {
                    map.put(ch[j], 1);
                }
            }
            max = Math.max(max, map.size());
        }
        return max;
    }

    static int solution(String str) {
        int n = str.length();
        HashMap map = new HashMap();
        int i = 0, j = 0, ans = 0;
        for (j = 0; j < n; j++) {
            if (map.containsKey(str.charAt(j))) {
                i = Math.max(i, (int) map.get(str.charAt(j)));
            }
            map.put(str.charAt(j), j + 1);
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
