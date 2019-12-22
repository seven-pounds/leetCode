package NEWCode.Company;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        System.out.println(str);
        String k = "101";
        int count = 0;
        int index = 0;
        int temp = 0;
        int res = 0;
        while ((index = str.indexOf(k, index)) != -1) {
            if (temp == 0) {
                res = index;
                temp++;
            }
            index = index + 1;
            count++;
        }
        System.out.println(count + " " + res);
    }

}


//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int [] arr=intToByte(n );
//        String str="";
//        for (int i = 31; i>=0; i--) {
//            str=str+arr[i];
//        }
//        String k="101";
//        int count=0;
//        int index=0;
//        int temp=0;
//        int res=0;
//        while((index=str.indexOf(k,index))!=-1){
//            if(temp==0){
//                res=index;
//                temp++;
//            }
//            index=index+1;
//            count++;
//        }
//        System.out.println(count+" "+res);
//
//
//    }
//
//    public static int[] intToByte(int n){
//        int[] arr=new int[32];
//        for (int i = 31; i>=0 ; i--) {
//            if((n & 0x01)==0x01){
//                arr[i]=1;
//                n=n>>1;
//            }else {
//                arr[i]=0;
//                n=n>>1;
//            }
//        }
//        return arr;
//    }
