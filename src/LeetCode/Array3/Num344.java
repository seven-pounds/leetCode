package LeetCode.Array3;

public class Num344 {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            swap(s,left++,right--);
        }
    }
    public void swap(char[] s,int i,int j){
        char temp =s[i];
        s[i]=s[j];
        s[j]=temp;
    }

}
