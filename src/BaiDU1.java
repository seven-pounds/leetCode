import java.util.LinkedList;
import java.util.Scanner;

public class BaiDU1 {
    public static void main(String[] args) {

    }
    public static void test(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        String com=in.next();
        for (int i = 0; i <com.length() ; i++) {
            if (com.charAt(i) == 'U') y++;
            if (com.charAt(i) == 'D') y--;
            if (com.charAt(i) == 'L') x--;
            if (com.charAt(i) == 'R') x++;
        }
    }
}
