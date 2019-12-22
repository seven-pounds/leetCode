package NEWCode.Offer;

import java.util.ArrayList;

public class Num19 {
    //  1  2  3  4
    //  5  6  7  8
    //  9 10 11 12
    // 13 14 15 16
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printMatrix(matrix);
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int startRow = 0;
        int endRow = row - 1;
        int startCol = 0;
        int endCol = col - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startRow; i <= endCol; i++) {
                System.out.println(matrix[startCol][i]);
                res.add(matrix[startCol][i]);
            }
            for (int i = startCol + 1; i <= endRow; i++) {
                System.out.println(matrix[i][endCol]);
                res.add(matrix[i][endCol]);
            }
//            if(startRow!=endRow){
            for (int i = endCol - 1; i > startCol; i--) {
                System.out.println(matrix[endRow][i]);
                res.add(matrix[endRow][i]);
            }
//            }
//            if(startCol!=endCol){
            for (int i = endRow; i > startRow; i--) {
                System.out.println(matrix[i][startCol]);
                res.add(matrix[i][startCol]);
//                }
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return res;
    }
}
