package NEWCode.Company;

import java.util.Scanner;

public class NetEasy3 {
    public static void main(String[] args) {
        fun1();
    }

    public static void fun1() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[] p = new int[q];
        for (int i = 0; i < q; i++) {
            p[i] = scanner.nextInt();
        }
        QuickSort(score, 0, n - 1);
        double[] res = new double[q];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < n; j++) {
                if (p[i] == j) {
                    res[i] = (double) (n - j) / (double) n;
                }
            }
        }
        for (int i = 0; i < q; i++) {
            System.out.print(res[i]);
        }

    }

    public static void QuickSort(int[] arr, int start, int end) {
        if (start > end) return;
        int p = partition(arr, start, end);
        if (p < 0) return;
        QuickSort(arr, start, p - 1);
        QuickSort(arr, p + 1, end);

    }

    public static int partition(int[] arr, int start, int end) {
        int result = -1;
        int key = arr[start];
        if (start >= end) result = -1;
        while (start < end) {
            while (arr[end] > key && start < end) end--;
            arr[start] = arr[end];
            while (arr[start] < key && start < end) start++;
            arr[end] = arr[start];
        }
        arr[start] = key;
        result = start;
        return result;

    }
}
