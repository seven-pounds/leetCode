package NEWCode.Offer;

import java.util.ArrayList;

public class Num42_FindNumbersWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 11, 15};
        System.out.println(FindNumbersWithSum(arr, 15));
    }

    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                res.add(array[i]);
                res.add(array[j]);
                break;
            } else if (array[i] + array[j] < sum) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}
