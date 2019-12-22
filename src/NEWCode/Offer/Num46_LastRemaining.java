package NEWCode.Offer;

import java.util.LinkedList;

public class Num46_LastRemaining {
    public static void main(String[] args) {

    }

    public static int LastRemaining_Solution(int n, int m) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int bt = 0;
        while (list.size() > 1) {
            bt = (bt + m - 1) % list.size();
            list.remove(bt);
        }

        return list.size() == 1 ? (int) list.get(0) : -1;
    }
}
