package LeetCode.Other;

public class Num28_KMP {
    public static void main(String[] args) {
        System.out.println(matchKMP("abcabaabaabcacb", "abaabcac"));
    }

    public static int[] generateNext(String str) {
        int[] next = new int[str.length()];
        char[] ch = str.toCharArray();
        next[0] = -1;
        int j = -1;
        int i = 0;
        while (i < ch.length - 1) {
            if (j == -1 || ch[i] == ch[j]) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        return next;
    }

    public static int matchKMP(String res, String p) {

        char[] arr_res = res.toCharArray();
        char[] p_arr = p.toCharArray();
        int[] next = generateNext(p);
        int i = 0;
        int j = -1;
        while (i < arr_res.length && j < p_arr.length) {
            if (j == -1 || arr_res[i] == p_arr[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == p_arr.length) return i - j;
        return -1;
    }
}
