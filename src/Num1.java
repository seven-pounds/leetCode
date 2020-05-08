import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Num1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] box=new int[n];
        for (int i = 0; i < n; i++) {
            box[i]=in.nextInt();
        }
        Set set=new HashSet();
        int count=0;
        for (int i = 0; i <n ; i++) {
            int temp=box[i];
            while(set.contains(temp)){
                temp++;count++;
            }
            set.add(temp);
        }
        System.out.println(count);
        return;
    }
}
