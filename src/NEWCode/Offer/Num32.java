package NEWCode.Offer;

import java.util.Arrays;

public class Num32 {
    public static void main(String[] args) {
        int[] num = {3334, 3, 3333332};
        System.out.println(PrintMinNumber(num));
    }

    public static String PrintMinNumber(int[] numbers) {
        Arrays.sort(numbers);
        String res = "";
        for (int i = 0; i < numbers.length - 1; i++) {
            String temp1 = String.valueOf(numbers[i]);
            String temp2 = String.valueOf(numbers[i + 1]);
            double num1 = Double.parseDouble(temp1 + temp2);
            double num2 = Double.parseDouble(temp2 + temp1);
            if (num1 > num2) {
                numbers[i + 1] = (int) num2;
            } else {
                numbers[i + 1] = (int) num1;
            }
        }
        return String.valueOf(numbers[numbers.length - 1]);

    }
}
