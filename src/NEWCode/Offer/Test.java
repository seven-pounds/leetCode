package NEWCode.Offer;

public class Test {
    public static void main(String[] args) {
        int[][] m = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        findNumberIn2DArray(m,20);
    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(col>=0&&row<matrix.length){
            int tmp=matrix[row][col];
            if(target==tmp) return true;
            if(target>tmp) row++;
            if(target<tmp) col--;
        }
        return false;
    }
}
