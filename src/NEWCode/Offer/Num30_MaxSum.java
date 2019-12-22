package NEWCode.Offer;

public class Num30_MaxSum {
    public static void main(String[] args) {
        int[] arr = {6, -3, -2, 7, -15, 1, 2, 2};
        System.out.println(findMax(arr));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max + arr[i], arr[i]);
            res = Math.max(res, max);
        }
        return res;
    }
}
