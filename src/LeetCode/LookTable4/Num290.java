package LeetCode.LookTable4;

import java.util.HashMap;
import java.util.Map;

public class Num290 {
    public static void main(String[] args) {
        wordPattern("abba","dog dog dog dog");
    }
    public static boolean wordPattern(String pattern, String str) {
        String[] word=str.split(" ");
        if(word.length!=pattern.length()) return false;
        // ab  aa
        Map<Character,String> map =new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(word[i])) return false;
            }else{
                for (String ch: map.values()) {
                    if(word[i].equals(ch)) return false;
                }
                map.put(pattern.charAt(i),word[i]);
            }
        }
        return true;
    }
}
