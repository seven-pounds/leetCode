package NEWCode.Company;

public class Alibaba_1 {
    private static int getMinimumTimeCost(int n, int[][] area) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (area[1][i] > max) {
                max = area[1][i];
                index = i;
            }
        }
        for (int i = 0; i < n; i++) {

        }
        return 1;
    }
}
