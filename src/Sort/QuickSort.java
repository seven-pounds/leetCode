package Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2};
        QuickSort(arr, 0, 0);
        for (int num : arr) {
            System.out.print(num + " ");
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
            while (arr[start] <= key && start < end) start++;
            arr[end] = arr[start];
        }
        arr[start] = key;
        result = start;
        return result;

    }
}
