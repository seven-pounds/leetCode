package LeetCode.Array3;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.HashSet;
import java.util.Set;

public class Num345 {
    public String reverseVowels(String s) {
            int left=0;
            int right=s.length()-1;
            char [] ch =s.toCharArray();
            while(left<right){
                while (!isVowel(s.charAt(left))&&left<right) left++;
                while (!isVowel(s.charAt(right))&&left<right) right--;
                swap(ch,left,right);
                left++;
                right--;
            }
            return String.valueOf(ch);

        }
        public void swap(char[] s,int i,int j){
            char temp =s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        private boolean isVowel(char ch) {
            // 这里要直接用 return 语句返回，不要返回 true 或者 false
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    ||ch=='A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
        }
}
