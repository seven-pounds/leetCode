package LeetCode.Other;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {1, 8, 3, 4, 7, 2, 5, 6, 9};
        sum(num, 10);
    }

    public static void sum(int[] num, int target) {

        Arrays.sort(num);
        int i = 0;
        int j = num.length - 1;
        while (i < j) {
            if (num[i] + num[j] == target) {
                System.out.println(num[i] + " " + num[j]);
                i++;
                j--;
            }
            if (num[i] + num[j] > target) j--;
            if (num[i] + num[j] < target) i++;
        }


    }
}
