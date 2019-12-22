package Alogrithm;

import java.util.ArrayList;

public class LCS1 {
    public static void main(String[] args) {
        System.out.println(lcs("cnblogs", "belong"));
    }

    public static int lcs(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        int result = 0;     //记录最长公共子串长度t
        int indexi = 0;
        int indexj = 0;
        int c[][] = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0) {
                    c[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                    if (c[i][j] > result) {
                        result = c[i][j];
                        indexi = i;
                        indexj = j;
                    }
                } else {
                    c[i][j] = 0;
                }
            }
        }
        String res = "";
        while (c[indexi][indexj] > 0) {
            res = str1.charAt(indexi - 1) + res;
            indexi--;
            indexj--;
        }
        System.out.println(res);
        return result;
    }
}
