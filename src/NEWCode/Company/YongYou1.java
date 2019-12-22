package NEWCode.Company;

import java.util.Scanner;

public class YongYou1 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        int p = 10;
        int[] v = {5, 8, 10, 13};
//        for (int i = 0; i < v.length; i++) {
//            v[i]=0;
//        }
//        int i=0;
//        while (sc.hasNext()&&i<5000){
//            v[i]=sc.nextInt();
//            i++;
//        }
        int count = 0;
        int max = 0;
        for (int j = 0; j < v.length; j++) {
            if (count < 0) break;
            if (v[j] < p) {
                count++;
                p = p - v[j];
            }
            max = Math.max(max, count);
            if (v[j] > p && count > 0) {
                count--;
                p = p + v[j];
            }
        }
        System.out.println(max);
    }
}
