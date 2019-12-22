package NEWCode.Company;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NetEasy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map map = new HashMap();
        int n = sc.nextInt();
        int m = sc.nextInt();
//        int[] d=new int[n];
//        int[] p=new int[n];
        for (int i = 0; i < n; i++) {
            map.put(sc.nextInt(), sc.nextInt());
//                d[i]=sc.nextInt();
//                p[i]=sc.nextInt();
        }
        System.out.println(map.toString());
//        Arrays.sort(d);
//        Arrays.sort(p);
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }


//        for(int i=0;i<m;i++){
//            for(int k=0;k<n;k++){
//                if(a[i]==d[k]) {
//                    System.out.println(p[k]);
//                    break;
//                }
//                if(a[i]>d[k]){
//                    continue;
//                }else{
//                    System.out.println(p[k-1]);
//                    break;
//                }
//
//            }
//        }
    }

}
