package NEWCode;

import java.util.Scanner;

public class PDD1 {
    static class Node {
        int key;
        int count;
        Node next;

        Node() {
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] temp = new int[4][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                temp[i][j] = sc.nextInt();
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
