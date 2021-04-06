package NEWCode.Offer;

public class N05 {
    public static void main(String[] args) {
        replaceSpace("We are happy.");
    }
    public static String replaceSpace(String s) {
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==' ') count++;
        }
        char[] arr = new char[s.length()+count*2];//新字符串的长度
        for (int i = arr.length-1; i>=0 ; i--) {

            int j=i-count*2;
            if(s.charAt(j)==' '){
                arr[i--]='0';
                arr[i--]='2';
                arr[i]='&';
                count--;
                continue;
            }
            arr[i]=s.charAt(j--);
        }
        return new String(arr);

    }
}
