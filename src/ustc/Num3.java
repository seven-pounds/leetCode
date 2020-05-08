package ustc;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
            long res=fib(a,b,n);

            if(res%3==0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        return;
    }
    public static long fib(int a, int b,int n){
        long one=a;
        long two=b;
        long res=0;
        for(int i=2;i<=n;++i){
            res=one+two;
            two=one;
            one=res;
        }
        return res;
    }
}
