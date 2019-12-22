package NEWCode.Offer;

import java.util.Arrays;

public class Num45 {
    public static void main(String[] args) {
        int[] num = {1, 3, 0, 0, 6};
        System.out.println(isContinuous(num));
    }

    public static boolean isContinuous(int[] numbers) {
        if (numbers.length == 0) return false;
        int zeroNum = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                zeroNum++;
                continue;
            }
            if (numbers[i] == numbers[i + 1]) return false;
        }

        if (numbers[numbers.length - 1] - numbers[zeroNum] >= 5) return false;
        return true;
    }
}
