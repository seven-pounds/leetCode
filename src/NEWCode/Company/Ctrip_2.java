package NEWCode.Company;

import java.util.Scanner;

public class Ctrip_2 {
    static String resolve(String expr) {
        if (expr == null) return null;
        String res = "";

        return res;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);
    }
}
