package NEWCode.Company;

public class NestEasy4 {
    public static void main(String[] args) {
        int l = 217982186;
        int r = 436746452;
        long sum = 0;
        int count = 0;
        for (int j = 1; j < l; j++) {
            sum = j + sum;
        }
        for (int i = l; i <= r; i++) {
            sum = sum + i;
            if (sum % 3 == 0) {
                count++;
            }

        }
        System.out.println(count);
    }
}
