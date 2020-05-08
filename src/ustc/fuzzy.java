package ustc;

import java.util.Scanner;

public class fuzzy {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String[] dic = new String[]{"surprise","happy","ctrip","travel","wellcome","student","system","program","editor"};
//        while (sc.hasNext()) {
//            String str = sc.nextLine();
//            System.out.println(convert(str, dic));
//        }
        System.out.println(convert("sttdents", dic));
    }
    private static String convert(String str, String[] dic) {
        for (String word : dic) {//dic是要遍历的list，word是赋值的变量。
            if (distance(str, word) <= 2) return word;
        }
        return "null";
    }
    private static int distance(String s1, String s2) {//计算出两个单词的距离。
        int len1 = s1.length(), len2 = s2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) dp[i][0] = i;
        for (int i = 0; i <= len2; i++) dp[0][i] = i;
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    int tmp = Math.min(dp[i-1][j], dp[i][j-1]);
                    dp[i][j] = 1 + Math.min(tmp, dp[i-1][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }



}
