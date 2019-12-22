package Sort;

public class heapSortTest {
    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 2, 9, 8, 5};
        heapSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void HeapAdjust(int[] arr, int parent, int length) {
        int temp = arr[parent];
        int child = 2 * parent + 1;
        while (child < length) {
            if (child + 1 < length && arr[child] < arr[child + 1]) child++;
            if (arr[parent] > arr[child]) break;
            arr[parent] = arr[child];
            parent = child;
            child = 2 * child + 1;
        }
        arr[parent] = temp;
    }

    public static void heapSort(int[] list) {
        for (int i = list.length / 2; i >= 0; i--) {
            HeapAdjust(list, i, list.length);
        }
        for (int i = list.length - 1; i > 0; i--) {
            // 最后一个元素和第一元素进行交换
            int temp = list[i];
            list[i] = list[0];
            list[0] = temp;
            // 筛选 R[0] 结点，得到i-1个结点的堆-
            HeapAdjust(list, 0, i);
        }
    }
}
