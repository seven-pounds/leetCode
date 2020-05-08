package LeetCode.LookTable4;



import java.util.HashMap;
import java.util.Map;

public class Num205 {
    public boolean isIsomorphic(String s, String t) {
        // ab  aa
        Map<Character,Character> map =new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            for (Character ch: map.values()) {
                if(ch==t.charAt(i)) return false;
            }
            map.put(s.charAt(i),t.charAt(i));

        }
        return true;

    }
}
