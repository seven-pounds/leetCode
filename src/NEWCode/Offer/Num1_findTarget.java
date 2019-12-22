package NEWCode.Offer;

public class Num1_findTarget {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3, 4}, {5, 6, 7, 8}, {10, 11, 12, 13}};
        int target = 4;
        int i = num.length - 1;
        int j = 0;
        int clows = num[0].length;
        while (i >= 0 && j < clows) {
            if (target > num[i][j]) j++;
            else if (target < num[i][j]) i--;
            else {
                System.out.println("true");
                break;
            }
        }
        System.out.println("flase");
    }
}
