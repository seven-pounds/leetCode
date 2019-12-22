package NEWCode.Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class num27_Permutation {
    public static void main(String[] args) {
        String str = "abbc";
        ArrayList<String> res = new ArrayList<>();
        permutation(str.toCharArray(), 0, res);
        Collections.sort(res);
        System.out.println(res);
    }

    public static void permutation(char[] ch, int i, ArrayList<String> res) {
        if (i == ch.length - 1) {
            res.add(String.valueOf(ch));
            System.out.println(res);
        } else {
            Set<Character> charSet = new HashSet<Character>();
            for (int j = i; j < ch.length; ++j) {
                if (j == i || !charSet.contains(ch[j])) {
                    charSet.add(ch[j]);
                    swap(ch, i, j);
                    permutation(ch, i + 1, res);
                    swap(ch, j, i);
                }
            }
        }
    }

    public static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}
