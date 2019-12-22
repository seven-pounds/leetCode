package ustc;

public class DiGui {
    public static void main(String[] args) {
        test(10);
    }

    public static void test(int n) {
        if (n < 0) return;
        System.out.println(n);
        test(n - 1);
    }
}
