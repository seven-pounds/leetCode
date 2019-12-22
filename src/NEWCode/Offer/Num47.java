package NEWCode.Offer;

public class Num47 {
    public static void main(String[] args) {
        System.out.println(Sum_Solution(10));
    }

    public static int Sum_Solution(int n) {

        if (n == 1) return 1;
        return n + Sum_Solution(n - 1);
    }
}
