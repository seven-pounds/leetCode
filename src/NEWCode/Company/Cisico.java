package NEWCode.Company;

import java.util.Stack;

public class Cisico {
    public static void main(String[] args) {

        System.out.println(compressWord("abbcccbb",3));
    }
    public static String compressWord(String word, int K) {
        int count=word.length()/K;
        for (int i = 0; i < count; i++) {
             word=process(word,K);
        }
        return word;
    }

    public static String process(String word, int K){

        Stack stack=new Stack();
        for (int j = 0; j < word.length(); j++) {
            if(stack.isEmpty()) {
                stack.push(word.charAt(j));
                continue;
            }
            if((char)stack.peek()==word.charAt(j)){
                stack.push(word.charAt(j));
            }else{
                stack.clear();
                stack.push(word.charAt(j));
            }
            if(stack.size()==K){
                String s1=word.substring(0,j-K+1);

                String s2="";
                if(j!=word.length()-1) s2=word.substring(j+1,word.length());
                String res=s1+s2;
                return res;
            }
        }
        // Write your code here
        return word;
    }
}
